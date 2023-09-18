package models

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class TokenTest {

    @Test
    fun testTokenInitialization() {
        val token = Token(
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
        assertEquals(1, token.id)
        assertEquals("word", token.form)
        assertEquals("lemma", token.lemma)
        assertEquals("NOUN", token.upos)
        assertEquals("NN", token.xpos)
        assertEquals(mapOf("Number" to "Sing"), token.feats)
        assertEquals(2, token.head)
        assertEquals("nsubj", token.deprel)
        assertEquals(null, token.deps)
        assertEquals(null, token.misc)
    }

    @Test
    fun testTokenWhenBlockAppliedThenReturnsModifiedToken() {
        // Arrange
        val expectedToken = Token(
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
        // Act
        val token = token {
            id = 1
            form = "word"
            lemma = "lemma"
            upos = "NOUN"
            xpos = "NN"
            feats = mapOf("Number" to "Sing")
            head = 2
            deprel = "nsubj"
            deps = null
            misc = null
        }

        // Assert
        assertEquals(expectedToken, token)
    }

    @Test
    fun testTokenWhenEmptyBlockThenReturnsDefaultToken() {
        // Arrange
        val expectedToken = Token(0,"","","","", emptyMap(),0,"",null,null)
        val block: TokenBuilder.() -> Unit = {}

        // Act
        val actualToken = token(block)

        // Assert
        assertEquals(expectedToken, actualToken)
    }
}
