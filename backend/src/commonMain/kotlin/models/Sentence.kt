package models


data class Sentence(
    val tokens: List<Token>,
    val metadata: Map<String,String>
){
    override fun toString(): String {
        val metadataRepr = metadata.entries.joinToString(separator = "\n") { "${it.key}: ${it.value}" }
        return tokens.joinToString(separator = "\n") { it.toString() } + "\n\n" + metadataRepr
    }
}

