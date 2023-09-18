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
                if (!line.isBlank() && !line.startsWith("#") && !line.contains(Regex("^\\d+-\\d+"))) {
                    val fields = line.split("\t")
                    token {
                        id = fields[0].toInt()
                        form = fields[1]
                        // Add other fields as needed
                    }
                }
            }
        }
    }

//    private fun parseFeats(feats: String): Map<String, String> {
//        if (feats == "_") return emptyMap()
//        return feats.split("|").associate { feat ->
//            val (key, value) = feat.split("=")
//            key to value
//        }
//    }
}
