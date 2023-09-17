package models

data class Token(
    val id: Int,
    val form: String,
    val lemma: String,
    val upos: String,
    val xpos: String,
    val feats: Map<String, String>,
    val head: Int,
    val deprel: String,
    val deps: String?,
    val misc: String?
)
