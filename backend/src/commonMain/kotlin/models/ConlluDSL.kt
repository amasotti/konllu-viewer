package models

// TOKEN DSL
fun token(block: TokenBuilder.() -> Unit): Token = TokenBuilder().apply(block).build()
class TokenBuilder {
    var id: Int = 0
    var form: String = ""
    var lemma: String = ""
    var upos: String = ""
    var xpos: String = ""
    var feats: Map<String, String>? = emptyMap()
    var head: Int = -1
    var deprel: String = ""
    var deps: String? = null
    var misc: Map<String,String>? = null

    fun build(): Token {
        return Token(id, form, lemma, upos, xpos, feats, head, deprel, deps, misc)
    }
}


// DSL for Sentence
fun sentence(block: SentenceBuilder.() -> Unit): Sentence = SentenceBuilder().apply(block).build()

class SentenceBuilder {
    private val tokens = mutableListOf<Token>()
    private val metadata = mutableMapOf<String, String>()

    fun tokens(block: TOKENS.() -> Unit) {
        TOKENS(tokens).apply(block)
    }

    fun metadata(key: String, value: String) {
        metadata[key] = value
    }

    fun build(): Sentence {
        return Sentence(tokens, metadata)
    }

    class TOKENS(private val list: MutableList<Token>) {
        fun token(block: TokenBuilder.() -> Unit) {
            list.add(TokenBuilder().apply(block).build())
        }
    }
}

// DSL for Document
fun document(block: DocumentBuilder.() -> Unit): Document = DocumentBuilder().apply(block).build()

class DocumentBuilder {
    private val sentences = mutableListOf<Sentence>()
    private val metadata = mutableMapOf<String, String>()

    fun sentences(block: SENTENCES.() -> Unit) {
        SENTENCES(sentences).apply(block)
    }

    fun metadata(key: String, value: String) {
        metadata[key] = value
    }

    fun build(): Document {
        return Document(sentences, metadata)
    }

    class SENTENCES(private val list: MutableList<Sentence>) {
        fun sentence(block: SentenceBuilder.() -> Unit) {
            list.add(SentenceBuilder().apply(block).build())
        }
    }

}
