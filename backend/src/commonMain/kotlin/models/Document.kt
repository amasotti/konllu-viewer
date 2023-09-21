package models

data class Document(
    val sentences: List<Sentence>,
    val metadata: Map<String,String>? = emptyMap()
)

