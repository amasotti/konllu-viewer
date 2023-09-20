package parser

import models.Document
import models.document
import models.DocumentBuilder
import models.SentenceBuilder
import models.Token
import extensions.isValidConlluToken
import parser.ParserUtils.extractMetadata

object ConlluParser {

    private const val DOCUMENT_METADATA_PREFIX = "##"
    private const val DOCUMENT_METADATA_DELIMITER = ":"

    const val SENTENCE_METADATA_PREFIX = "#"
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
        val sentenceStartIndex = lines.indexOfFirst { it.startsWith(SENTENCE_METADATA_PREFIX) }

        // Split the file into metadata and sentences
        val metadataChunks : List<String> = lines.take(sentenceStartIndex)
        val sentenceChunks: List<String> = lines
                .drop(sentenceStartIndex) // Ignore metadata
                .joinToString("\n") // Join all lines into a single string
                .split(LINE_DELIMITER) // Split into sentences

        // Parse the metadata and sentences
        return document {
            extractDocumentMetadata(metadataChunks)
            parseSentences(sentenceChunks)
        }
    }

    private fun DocumentBuilder.extractDocumentMetadata(lines: List<String>) {
        apply {
            lines.filter { it.startsWith(DOCUMENT_METADATA_PREFIX) }
                .map {
                    extractMetadata(it, DOCUMENT_METADATA_PREFIX, DOCUMENT_METADATA_DELIMITER)
                }.forEach {
                    metadata(it.first, it.second)
                }
        }
    }

    /**
     * Parses a list of CoNLL-U sentences into a [Document] object.
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

    private fun SentenceBuilder.extractSentenceMetadata(lines: List<String>) {
        apply {
            lines.filter { it.startsWith(SENTENCE_METADATA_PREFIX) }
                .map {
                    extractMetadata(it, SENTENCE_METADATA_PREFIX, SENTENCE_METADATA_DELIMITER)
                }.forEach {
                    metadata(it.first, it.second)
                }
        }
    }

    /**
     * Extracts the tokens from a CoNLL-U sentence.
     *
     * @param lines The lines of the CoNLL-U sentence.
     *
     */
    private fun SentenceBuilder.extractTokens(lines: List<String>) {
        tokens {
            lines.filter { it.isValidConlluToken() }
                .forEach { line ->
                    token { Token.fromString(line, ParserUtils::extractFeatures, ParserUtils::handleHeadRelation) }
                }
        }
    }

}
