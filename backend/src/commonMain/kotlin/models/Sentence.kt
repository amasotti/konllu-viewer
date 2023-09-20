package models

import extensions.toPrettyString


data class Sentence(
    val tokens: List<Token>,
    val metadata: Map<String,String>
){
    override fun toString(): String {
        return buildString {
            append(tokens.joinToString("\n"))
            append("\n\n")
            append(metadata.toPrettyString())
        }
    }
}

