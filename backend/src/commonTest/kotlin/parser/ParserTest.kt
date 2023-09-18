package parser

import kotlin.test.Test
import kotlin.test.assertEquals

class ConlluParserTest {
    @Test
    fun testParseConlluFile() {
        val fileContent = """
            ## text: Jaiminīyabrāhmaṇa
            ## text_id: 479
            ## chapter: JB, 1, 1
            ## chapter_id: 11561
            # text = tat āhuḥ kena juhoti kasmin hūyate iti
            # sent_id = 636570_1
            1	tat	tad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	2	obj	_	LemmaId=37875|OccId=5036785|Unsandhied=tat|Annotator=Ol
            2	āhuḥ	ah	VERB	_	Mood=Ind|Number=Plur|Person=3|Tense=Past	0	root	_	LemmaId=156124|OccId=5036786|Unsandhied=āhuḥ|Annotator=Ol|Punctuation=fullStop
            3	kena	ka	PRON	_	Case=Ins|Gender=Neut|Number=Sing	4	obl	_	LemmaId=37878|OccId=5036787|Unsandhied=kena|Annotator=Ol
            4	juhoti	hu	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Pres	2	ccomp	_	LemmaId=157629|OccId=5036788|Unsandhied=juhoti|Annotator=Ol|Punctuation=fullStop
            5	kasmin	ka	PRON	_	Case=Loc|Gender=Neut|Number=Sing	6	obl	_	LemmaId=37878|OccId=5036789|Unsandhied=kasmin|Annotator=Ol
            6	hūyate	hu	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Pres|Voice=Pass	4	parataxis	_	LemmaId=157629|OccId=5036790|Unsandhied=hūyate|Annotator=Ol
            7	iti	iti	PART	_	_	6	mark	_	LemmaId=63331|OccId=5036791|Unsandhied=iti|Annotator=Ol|Punctuation=fullStop
            
            # text = prāṇena eva juhoti
            # sent_id = 636571_1
            1	prāṇena	prāṇa	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	3	obl	_	LemmaId=156090|OccId=5036792|Unsandhied=prāṇena|Annotator=Ol
            2	eva	eva	PART	_	_	1	discourse	_	LemmaId=39754|OccId=5036793|Unsandhied=eva|Annotator=Ol
            3	juhoti	hu	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Pres	0	root	_	LemmaId=157629|OccId=5036794|Unsandhied=juhoti|Annotator=Ol|Punctuation=fullStop
            
        """.trimIndent()

        val document = ConlluParser.parseConlluFile(fileContent)
        println(document.sentences)

        assertEquals(2, document.sentences.size)
        // ... (continue with more assertions)
    }
}
