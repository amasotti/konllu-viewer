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
                    !line.isBlank() && // Then is a delimiter
                    !line.startsWith("#") &&  // Then is a comment
                    !line.contains(Regex("^\\d+-\\d+")) // Then is a multiword token to be ignored
                    ) {
                    val fields = line.split("\t")
                    println("Line: $line" + "\n")
                    println("FieldSize: " + fields.size + "\n")
                    println("ID would be: " + fields[0].toInt() + "\n")
                    println("Form would be: " + fields[1] + "\n")
                    println("Lemma would be: " + fields[2] + "\n")
                    println("UPOS would be: " + fields[3] + "\n")
                    println("XPOS would be: " + fields[4] + "\n")
                    println("Feats would be: " + extractFeatures(fields[5]) + "\n")
                    println("Head would be: " + handleHeadRelation(fields[6]) + "\n")
                    println("Deprel would be: " + fields[7] + "\n")
                    println("Deps would be: " + fields[8] + "\n")
                    println("Misc would be: " + extractFeatures(fields[9]) + "\n")
                    token {
                        id = fields[0].toInt()
                        form = fields[1]
                        lemma = fields[2]
                        upos = fields[3]
                        xpos = fields[4]
                        feats = extractFeatures(fields[5])
                        head = handleHeadRelation(fields[6])
                        deprel = fields[7]
                        deps = fields[8]
                        misc = extractFeatures(fields[9])
                    }
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
            }.map {
                it[0] to it[1]
            }.toMap()
    }

    private fun handleHeadRelation(headDep: String) : Int {
        return if (headDep == "_") -1 else headDep.toInt()
    }

}
