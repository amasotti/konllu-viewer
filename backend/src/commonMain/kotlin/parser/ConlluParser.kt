package parser

import models.*

object ConlluParser {
    fun parseConlluFile(fileContent: String): Document {
        val documentLines = fileContent.lines()
        val documentMetadata = mutableMapOf<String, String>()
        val sentences = mutableListOf<Sentence>()

        // Step 1: Extract document metadata
        val sentenceStartIndex = documentLines.indexOfFirst { it.startsWith("#") }
        documentLines.subList(0, sentenceStartIndex).forEach { line ->
            if (line.startsWith("##")) {
                val key = line.substringAfter("##").substringBefore(":").trim()
                val value = line.substringAfter(":").trim()
                documentMetadata[key] = value
            }
        }

        // Step 2: Create list of chunks
        val sentenceChunks = fileContent.substring(sentenceStartIndex).split("\n\n")

        // Step 3: Parse sentences
        sentenceChunks.forEach { chunk ->
            val lines = chunk.lines()
            val sentenceMetadata = mutableMapOf<String, String>()
            val tokens = mutableListOf<Token>()

            lines.forEach { line ->
                when {
                    line.isBlank() -> Unit
                    line.startsWith("#") -> {
                        val sentenceMetadataKey = line.substringAfter("#").substringBefore("=").trim()
                        val sentenceMetadataValue = line.substringAfter("=").trim()
                        sentenceMetadata[sentenceMetadataKey] = sentenceMetadataValue
                    }
                    else -> {
                        val fields = line.split("\t")
                        val token = Token(
                            id = fields[0].toInt(),
                            form = fields[1],
                            lemma = fields[2],
                            upos = fields[3],
                            xpos = fields[4],
                            feats = parseFeats(fields[5]),
                            head = fields[6].toInt(),
                            deprel = fields[7],
                            deps = fields.getOrNull(8),
                            misc = fields.getOrNull(9)
                        )
                        tokens.add(token)
                    }
                }
            }
            sentences.add(Sentence(tokens, sentenceMetadata))
        }

        return Document(sentences, documentMetadata)
    }

    private fun parseFeats(feats: String): Map<String, String> {
        if (feats == "_") return emptyMap()
        return feats.split("|").associate { feat ->
            val (key, value) = feat.split("=")
            key to value
        }
    }
}
