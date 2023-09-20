package extensions

import models.ConlluFieldsEnum
import parser.ParserUtils
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ConlluStringValidationest {
    @Test
    fun shouldReturnTrueForValidToken() {
        val realToken = "1\taskambhane\taskambhana\tNOUN\t_\t" +
                "Case=Loc|Gender=Neut|Number=Sing\t4\tobl:loc" +
                "\t_\t" +
                "LemmaId=61179|OccId=4366015|Unsandhied=askambhane|Annotator=Er\n"
        assertTrue(realToken.isValidConlluToken())
    }

    @Test
    fun shouldReturnFalseForBlankToken() {
        assertFalse("".isValidConlluToken())
        assertFalse(" ".isValidConlluToken())
    }

    @Test
    fun shouldReturnFalseForTokenWithMetadataPrefix() {
        assertFalse("#metadata".isValidConlluToken())
    }

    @Test
    fun shouldReturnFalseForTokenWithMultiwordDelimiter() {
        assertFalse("1-3 token|multiword".isValidConlluToken())
    }
}


class ConlluStringTransformationTest {
    @Test
    fun shouldRetrieveIntegerField() {
        val conlluLine = listOf("1", "The", "the", "DET", "_", "Case=Nom", "2", "det", "_", "_")
        val field = conlluLine.getConlluField(ConlluFieldsEnum.ID) { it.toInt() }
        assertEquals(1, field)
    }

    @Test
    fun shouldRetrieveAndTransformField() {
        val conlluLine = listOf("1", "The", "the", "DET", "_", "Case=Nom", "2", "det", "_", "_")
        val field = conlluLine.getConlluField(ConlluFieldsEnum.LEMMA) { it.uppercase() }
        assertEquals("THE", field)
    }

    @Test
    fun shouldRetrieveAndExtractInformationFromFeatureField() {
        val conlluLine = listOf("1", "The", "the", "DET", "_", "Case=Nom|Num=Sing|Test=TestValue", "2", "det", "_", "_")
        val field = conlluLine.getConlluField(ConlluFieldsEnum.FEATS) { ParserUtils.extractFeatures(it) }
        assertEquals(mapOf("Case" to "Nom", "Num" to "Sing", "Test" to "TestValue"), field)
    }
}
