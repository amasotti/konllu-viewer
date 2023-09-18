package models


data class Sentence(
    val tokens: List<Token>,
    val metadata: Map<String,String>
)

