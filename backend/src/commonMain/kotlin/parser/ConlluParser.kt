package parser

import models.Document
import models.document
import models.DocumentBuilder
import models.SentenceBuilder
import models.Token
import extensions.isValidConlluToken
import extensions.toPrettyString
import parser.ParserUtils.extractMetadata

object ConlluParser {

    const val SENTENCE_METADATA_PREFIX = "#" // Public since used in extensions
    private const val DOCUMENT_METADATA_PREFIX = "##"
    private const val DOCUMENT_METADATA_DELIMITER = ":"
    private const val SENTENCE_METADATA_DELIMITER = "="
    private const val LINE_DELIMITER = "\n\n"
    val MULTIWORD_TOKEN_DELIMITER = Regex("^\\d+-\\d+")  // 1-2


    /**
     * Parses a CoNLL-U file into a [Document] object.
     *
     * @param fileContent The content of the CoNLL-U file.
     * @return A [Document] object.
     */
    fun parseConlluFile(fileContent: String): Document {
        // Read the file line by line
        val lines = fileContent.lines()

        // Find the index of the first sentence
        val sentenceStartIndex = lines.indexOfLast { it.startsWith(DOCUMENT_METADATA_PREFIX) }

        // Split the file into metadata and sentences
        val metadataChunks : List<String> = lines.take(maxOf(sentenceStartIndex + 1, 0))
        val sentenceChunks: List<String> = lines
                .drop(sentenceStartIndex) // Ignore metadata
                .joinToString("\n") // Join all lines into a single string
                .split(LINE_DELIMITER) // Split into sentences

//        println("METADATA CHUNKS $metadataChunks")
//        println("SENTENCE CHUNKS $sentenceChunks")

        // Parse the metadata and sentences
        val doc = document {
            extractDocumentMetadata(metadataChunks)
            parseSentences(sentenceChunks)
        }
        println(doc.metadata.toPrettyString())
        println("DOC $doc" )
        return doc
    }

    /**
     * Extracts the metadata from a CoNLL-U file.
     *
     * @param lines The lines of the CoNLL-U file.
     *
     * @return A [DocumentBuilder] object.
     */
    private fun DocumentBuilder.extractDocumentMetadata(lines: List<String>) {

        val metadataLines = lines.filter { it.startsWith(DOCUMENT_METADATA_PREFIX) }

        metadataLines.forEach {
            val (key, value) = extractMetadata(it, DOCUMENT_METADATA_PREFIX, DOCUMENT_METADATA_DELIMITER)
            metadata(key, value)
        }
    }

    /**
     * Extracts the metadata from a CoNLL-U sentence.
     *
     * @param lines The lines of the CoNLL-U sentence.
     *
     * @return A [SentenceBuilder] object.
     */
    private fun SentenceBuilder.extractSentenceMetadata(lines: List<String>) {

        val sentenceLines = lines.filter { it.startsWith(SENTENCE_METADATA_PREFIX) }
        sentenceLines.forEach {
            val (key, value) = extractMetadata(it, SENTENCE_METADATA_PREFIX, SENTENCE_METADATA_DELIMITER)
            metadata(key, value)
        }

    }

    /**
     * Extracts the tokens from a CoNLL-U sentence.
     *
     * @param lines The lines of the CoNLL-U sentence.
     *
     */
    private fun SentenceBuilder.extractTokens(lines: List<String>) {

        val validLines = lines.filter { it.isValidConlluToken() }

        tokens {
            validLines
                .forEach { line ->
                    val tok = Token.fromString(line, ParserUtils::extractFeatures, ParserUtils::handleHeadRelation)
                    token {
                        id = tok.id
                        form = tok.form
                        lemma = tok.lemma
                        upos = tok.upos
                        xpos = tok.xpos
                        feats = tok.feats
                        head = tok.head
                        deprel = tok.deprel
                        deps = tok.deps
                        misc = tok.misc
                    }
                }
        }
    }

    /**
     * Parses a list of CoNLL-U sentences into a [Document] object.
     *
     * @param chunks The CoNLL-U sentences as a list of strings.
     * @return A [Document] object.
     *
     */
    private fun DocumentBuilder.parseSentences(chunks: List<String>)
    {
        sentences {
            chunks.forEach { chunk ->
                sentence {
                    val lines = chunk.lines()
                    extractSentenceMetadata(lines)
                    extractTokens(lines)
                }
            }
        }
    }


}
