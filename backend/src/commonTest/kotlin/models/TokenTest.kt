package models

import parser.ConlluParser
import parser.ParserUtils
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

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
        val expectedToken = Token(
            0,
            "",
            "",
            "",
            "",
            emptyMap(),
            -1,
            "",
            null,
            null)
        val block: TokenBuilder.() -> Unit = {}

        // Act
        val actualToken = token(block)

        // Assert
        assertEquals(expectedToken, actualToken)
    }

    @Test
    fun fromStringShouldCreateATokenWithValidInput() {
        // Arrange
        val line = "1\tHello\thello\tNOUN\tNN\t_\t0\troot\t_\t_"
        val expectedToken = Token(
            id = 1,
            form = "Hello",
            lemma = "hello",
            upos = "NOUN",
            xpos = "NN",
            feats = null,
            head = 0,
            deprel = "root",
            deps = "_",
            misc = null
        )
        val featureExtractor: FeatureExtractor = { null }

        // Act
        val actualToken = Token.fromString(line, featureExtractor, { 0 }, false)

        // Assert
        assertEquals(expectedToken, actualToken)
    }

    @Test
    fun fromStringShouldThrowAnExceptionForInvalidLine() {
        // Arrange
        val line = "1\tHello\thello\tNOUN\tNN\t_\t0\troot\t_"

        // Act && expect exception
        assertFailsWith<IllegalArgumentException> {
            Token.fromString(line, {null}, { 0 }, false)
        }

    }

    @Test
    fun fromStringShouldExtractFeatures() {
        // Arrange
        val line = "1\tHello\thello\tNOUN\tNN\tfeat1=val1|feat2=val2\t2\tdep\t_\tfeat3=val3"
        val expectedToken = Token(
            id = 1,
            form = "Hello",
            lemma = "hello",
            upos = "NOUN",
            xpos = "NN",
            feats = mapOf("feat1" to "val1", "feat2" to "val2"),
            head = 2,
            deprel = "dep",
            deps = "_",
            misc = mapOf("feat3" to "val3")
        )

        // Act
        val actualToken = Token.fromString(
            line,
            ParserUtils::extractFeatures,
            ParserUtils::handleHeadRelation,
            false)

        // Assert
        assertEquals(expectedToken, actualToken)
    }
}
