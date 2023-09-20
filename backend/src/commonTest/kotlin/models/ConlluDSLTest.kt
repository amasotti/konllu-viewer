package models

import kotlin.test.Test
import kotlin.test.assertEquals

class ConlluDSLTest {
    @Test
    fun documentDSLShouldCreateADocumentWithSentencesAndMetadata() {
        // Arrange
        val expectedDocument = Document(
            sentences = listOf(
                Sentence(
                    tokens = listOf(
                        tokenMock1,
                        tokenMock2
                    ),
                    metadata = mutableMapOf("language" to "Mixed")
                ),
                Sentence(
                    tokens = listOf(
                        tokenMock1,
                        tokenMock2
                    ),
                    metadata = mutableMapOf("language" to "English")
                )
            ),
            metadata = mutableMapOf("source" to "example")
        )

        // Act
        val actualDocument = document {
            metadata("source", "example")

            sentences {
                sentence {
                    metadata("language", "Mixed")

                    tokens {
                        token {
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
                        token {
                            id = 2
                            form = "is"
                            lemma = "be"
                            upos = "VERB"
                            xpos = "VB"
                            feats = mapOf("Tense" to "Pres")
                            head = 0
                            deprel = "root"
                            deps = null
                            misc = mapOf("SomeKey" to "SomeValue")
                        }
                    }
                }
                sentence {
                    metadata("language", "English")

                    tokens {
                        token {
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
                        token {
                            id = 2
                            form = "is"
                            lemma = "be"
                            upos = "VERB"
                            xpos = "VB"
                            feats = mapOf("Tense" to "Pres")
                            head = 0
                            deprel = "root"
                            deps = null
                            misc = mapOf("SomeKey" to "SomeValue")
                        }
                    }
                }
            }
        }

        // Assert
        assertEquals(expectedDocument, actualDocument)
    }

    @Test
    fun tokenDSLShouldCreateTokenWithAllProperties() {
        // Arrange
        val expectedToken = tokenMock2

        // Act
        val actualToken = token {
            id = 2
            form = "is"
            lemma = "be"
            upos = "VERB"
            xpos = "VB"
            feats = mapOf("Tense" to "Pres")
            head = 0
            deprel = "root"
            deps = null
            misc = mapOf("SomeKey" to "SomeValue")
        }

        // Assert
        assertEquals(expectedToken, actualToken)
    }
}
