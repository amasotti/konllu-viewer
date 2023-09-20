package parser

import models.*

object ConlluParser {

    /**
     * Field indices in CoNLL-U format
     *
     * Token(
     *  id=1,
     *  form=askambhane,
     *  lemma=askambhana,
     *  upos=NOUN,
     *  xpos=_,
     *  feats={Case=Loc, Gender=Neut, Number=Sing},
     *  head=4,
     *  deprel=obl:loc,
     *  deps=, misc=null
     *  )
     *
     */
    const val FIELD_ID = 0
    const val FIELD_FORM = 1
    const val FIELD_LEMMA = 2
    const val FIELD_UPOS = 3
    const val FIELD_XPOS = 4
    const val FIELD_FEATS = 5
    const val FIELD_HEAD = 6
    const val FIELD_DEPREL = 7
    const val FIELD_DEPS = 8
    const val FIELD_MISC = 9

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
                    println("ID would be: " + fields[FIELD_ID].toInt() + "\n")
                    println("Form would be: " + fields[FIELD_FORM] + "\n")
                    println("Lemma would be: " + fields[FIELD_LEMMA] + "\n")
                    println("UPOS would be: " + fields[FIELD_UPOS] + "\n")
                    println("XPOS would be: " + fields[FIELD_XPOS] + "\n")
                    println("Feats would be: " + extractFeatures(fields[FIELD_FEATS]) + "\n")
                    println("Head would be: " + handleHeadRelation(fields[FIELD_HEAD]) + "\n")
                    println("Deprel would be: " + fields[FIELD_DEPREL] + "\n")
                    println("Deps would be: " + fields[FIELD_DEPS] + "\n")
                    println("Misc would be: " + extractFeatures(fields[FIELD_MISC]) + "\n")
                    token {
                        id = fields[FIELD_ID].toInt()
                        form = fields[FIELD_FORM]
                        lemma = fields[FIELD_LEMMA]
                        upos = fields[FIELD_UPOS]
                        xpos = fields[FIELD_XPOS]
                        feats = extractFeatures(fields[FIELD_FEATS])
                        head = handleHeadRelation(fields[FIELD_HEAD])
                        deprel = fields[FIELD_DEPREL]
                        deps = fields[FIELD_DEPS]
                        misc = extractFeatures(fields[FIELD_MISC])
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
            }.associate {
                it.first() to it.last()
            }
    }

    private fun handleHeadRelation(headDep: String) : Int {
        return if (headDep == "_") -1 else headDep.toInt()
    }

}
