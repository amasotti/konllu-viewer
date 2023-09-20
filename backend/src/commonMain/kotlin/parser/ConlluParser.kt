package parser

import models.*


object ConlluParser {

    fun parseConlluFile(fileContent: String): Document {
        val documentLines = fileContent.lines()
        val sentenceStartIndex = documentLines.indexOfFirst { it.startsWith("#") }

        return document {
            extractDocumentMetadata(documentLines.subList(0, sentenceStartIndex))
            val sentenceChunks = fileContent.substring(sentenceStartIndex).split("\n\n")
            parseSentences(sentenceChunks)
        }
    }

    private fun DocumentBuilder.extractDocumentMetadata(lines: List<String>) {
        lines.forEach { line ->
            if (line.startsWith("##")) {
                val key = line.substringAfter("##").substringBefore(":").trim()
                val value = line.substringAfter(":").trim()
                metadata(key, value)
            }
        }
    }

    private fun DocumentBuilder.parseSentences(chunks: List<String>) {
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
        lines.forEach { line ->
            if (line.startsWith("#")) {
                val key = line.substringAfter("#").substringBefore("=").trim()
                val value = line.substringAfter("=").trim()
                metadata(key, value)
            }
        }
    }

    private fun SentenceBuilder.extractTokens(lines: List<String>) {
        tokens {
            lines.forEach { line ->
                if (
                    line.isNotBlank() && // Then is a delimiter
                    !line.startsWith("#") &&  // Then is a comment
                    !line.contains(Regex("^\\d+-\\d+")) // Then is a multiword token to be ignored
                    ) {
                    token { Token.fromString(line, ::extractFeatures, ::handleHeadRelation) }
                }
            }
        }
    }

    private fun extractFeatures(feats: String): Map<String, String>? {
        return if (feats == "_" || feats.isBlank()) null
        else feats
            .split("|")
            .map {
                it.split("=")
            }.associate {
                it.first() to it.last()
            }
    }

    private fun handleHeadRelation(headDep: String) : Int {
        return if (headDep == "_") -1 else headDep.toInt()
    }

}
