package models

import kotlin.test.Test
import kotlin.test.assertEquals

class DocumentTest {

    @Test
    fun testDocumentClassInitialization() {
        val tok1 = Token(
            id = 1,
            form = "word",
            lemma = "lemma",
            upos = "NOUN",
            xpos = "NN",
            feats = mapOf("Number" to "Sing"),
            head = 2,
            deprel = "nsubj",
            deps = null,
            misc = null
        )
        val sentence = Sentence(listOf(tok1))
        val sentence2 = Sentence(listOf(tok1, tok1))

        val document = Document(listOf(sentence, sentence2))
        assertEquals(2, document.sentences.size)
        assertEquals(sentence, document.sentences[0])
        assertEquals(sentence2, document.sentences[1])
    }

}
