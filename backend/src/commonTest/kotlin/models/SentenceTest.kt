package models

import kotlin.test.Test
import kotlin.test.assertEquals

class SentenceTest {

    @Test
    fun testSentenceInitialization() {
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
        val tok2 = Token(
            id = 2,
            form = "word2",
            lemma = "lemma2",
            upos = "NOUN",
            xpos = "NN",
            feats = mapOf("Number" to "Sing"),
            head = 0,
            deprel = "root",
            deps = null,
            misc = null
        )

        val sentence = Sentence(listOf(tok1, tok2))
        assertEquals(listOf(tok1, tok2), sentence.tokens)
        assertEquals(2, sentence.tokens.size)
    }

}
