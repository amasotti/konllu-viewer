package models

import kotlin.test.Test
import kotlin.test.assertEquals

class SentenceTest {
    private val tok1 = Token(
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
    private val tok2 = Token(
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

    @Test
    fun testSentenceInitialization() {

        val metadata = mapOf(
            "text" to "This is a sentence.",
            "sentId" to "1"
        )

        val sentence = Sentence(listOf(tok1, tok2), metadata)
        assertEquals(listOf(tok1, tok2), sentence.tokens)
        assertEquals(2, sentence.tokens.size)
        assertEquals(metadata, sentence.metadata)
    }

}
