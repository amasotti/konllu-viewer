package parser

import kotlin.test.Test
import kotlin.test.assertEquals

class ConlluParserTest {
    @Test
    fun testParseConlluFile() {
        val fileContent = """
## text: Amaruśataka
## text_id: 131
## chapter: AmaruŚ, 1
## chapter_id: 950
# text = jyākṛṣṭibaddhakhaṭakāmukhapāṇipṛṣṭhapreṅkhannakhāṃśucayasaṃvalito 'mbikāyāḥ
# sent_id = 101267
# sent_counter = 1
# sent_subcounter = 1
1-12	jyākṛṣṭibaddhakhaṭakāmukhapāṇipṛṣṭhapreṅkhannakhāṃśucayasaṃvalito	_	_	_	_	_	_	_	_
1	jyā	jyā	NOUN	_	Case=Cpd	_	_	_	LemmaId=95278|OccId=2139495|Unsandhied=jyā|UnsandhiedReconstructed=True
2	kṛṣṭi	kṛṣṭi	NOUN	_	Case=Cpd	_	_	_	LemmaId=4068|OccId=2139496|Unsandhied=kṛṣṭi|UnsandhiedReconstructed=True
3	baddha	bandh	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157929|OccId=2139497|Unsandhied=baddha|UnsandhiedReconstructed=True
4	khaṭakā	khaṭakā	NOUN	_	Case=Cpd	_	_	_	LemmaId=128715|OccId=2139498|Unsandhied=khaṭakā|UnsandhiedReconstructed=True
5	mukha	mukha	NOUN	_	Case=Cpd	_	_	_	LemmaId=136827|OccId=2139499|Unsandhied=mukha|UnsandhiedReconstructed=True
6	pāṇi	pāṇi	NOUN	_	Case=Cpd	_	_	_	LemmaId=93275|OccId=2139500|Unsandhied=pāṇi|UnsandhiedReconstructed=True
7	pṛṣṭha	pṛṣṭha	NOUN	_	Case=Cpd	_	_	_	LemmaId=150091|OccId=2139501|Unsandhied=pṛṣṭha|UnsandhiedReconstructed=True
8	preṅkhat	preṅkh	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=177033|OccId=2139502|Unsandhied=preṅkhat|UnsandhiedReconstructed=True
9	nakha	nakha	NOUN	_	Case=Cpd	_	_	_	LemmaId=43607|OccId=2139503|Unsandhied=nakha|UnsandhiedReconstructed=True
10	aṃśu	aṃśu	NOUN	_	Case=Cpd	_	_	_	LemmaId=26|OccId=2139504|Unsandhied=aṃśu|UnsandhiedReconstructed=True
11	caya	caya	NOUN	_	Case=Cpd	_	_	_	LemmaId=51215|OccId=2139505|Unsandhied=caya|UnsandhiedReconstructed=True
12	saṃvalitaḥ	saṃval	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=171447|OccId=2139506|Unsandhied=saṃvalitaḥ|UnsandhiedReconstructed=True
13	'mbikāyāḥ	ambikā	NOUN	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=32073|OccId=259322|Unsandhied=ambikāyāḥ|UnsandhiedReconstructed=True

# text = tvāṃ pātu mañjaritapallavakarṇapūralobhabhramadbhramaravibhramabhṛt kaṭākṣaḥ
# sent_id = 101268
# sent_counter = 1
# sent_subcounter = 2
1	tvāṃ	tvad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37880|OccId=259266|Unsandhied=tvā|UnsandhiedReconstructed=True
2	pātu	pā	VERB	_	Tense=Pres|Mood=Imp|Person=3|Number=Sing	_	_	_	LemmaId=157846|OccId=259267|Unsandhied=pātu
3-10	mañjaritapallavakarṇapūralobhabhramadbhramaravibhramabhṛt	_	_	_	_	_	_	_	_
3	mañjarita	mañjarita	ADJ	_	Case=Cpd	_	_	_	LemmaId=26795|OccId=259323|Unsandhied=mañjarita|UnsandhiedReconstructed=True
4	pallava	pallava	NOUN	_	Case=Cpd	_	_	_	LemmaId=92556|OccId=259324|Unsandhied=pallava|UnsandhiedReconstructed=True
5	karṇapūra	karṇapūra	NOUN	_	Case=Cpd	_	_	_	LemmaId=11998|OccId=259325|Unsandhied=karṇapūra|UnsandhiedReconstructed=True
6	lobha	lobha	NOUN	_	Case=Cpd	_	_	_	LemmaId=81872|OccId=259326|Unsandhied=lobha|UnsandhiedReconstructed=True
7	bhramat	bhram	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=159182|OccId=259327|Unsandhied=bhramat|UnsandhiedReconstructed=True
8	bhramara	bhramara	NOUN	_	Case=Cpd	_	_	_	LemmaId=26303|OccId=259328|Unsandhied=bhramara|UnsandhiedReconstructed=True
9	vibhrama	vibhrama	NOUN	_	Case=Cpd	_	_	_	LemmaId=123102|OccId=259329|Unsandhied=vibhrama|UnsandhiedReconstructed=True
10-85	bhṛt	bhṛt	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=25696|OccId=259330|Unsandhied=bhṛt|UnsandhiedReconstructed=True
10	bhṛt	bhṛt	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=25696|OccId=259330|Unsandhied=bhṛt|UnsandhiedReconstructed=True
11	kaṭākṣaḥ	kaṭākṣa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=742|OccId=259331|Unsandhied=kaṭākṣaḥ|UnsandhiedReconstructed=True

# text = kṣipto hastāvalagnaḥ prasabham abhihato 'py ādadāno 'ṃśukāntaṃ gṛhṇan keśeṣvapāstaścaraṇanipatito nekṣitaḥ sambhrameṇa
# sent_id = 101269
# sent_counter = 2
# sent_subcounter = 1
1	kṣipto	kṣip	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156198|OccId=259268|Unsandhied=kṣiptaḥ|UnsandhiedReconstructed=True
2-3	hastāvalagnaḥ	_	_	_	_	_	_	_	_
2	hasta	hasta	NOUN	_	Case=Cpd	_	_	_	LemmaId=166517|OccId=259364|Unsandhied=hasta|UnsandhiedReconstructed=True
3	avalagnaḥ	avalag	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=171449|OccId=259365|Unsandhied=avalagnaḥ|UnsandhiedReconstructed=True
4	prasabham	prasabham	ADV	_		_	_	_	LemmaId=171450|OccId=259370|Unsandhied=prasabham|UnsandhiedReconstructed=True
5	abhihato	abhihan	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159209|OccId=259332|Unsandhied=abhihataḥ|UnsandhiedReconstructed=True
6	'py	api	PART	_		_	_	_	LemmaId=21365|OccId=259333|Unsandhied=api|UnsandhiedReconstructed=True
7	ādadāno	ādā	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=159774|OccId=259366|Unsandhied=ādadānaḥ|UnsandhiedReconstructed=True
8-9	'ṃśukāntaṃ	_	_	_	_	_	_	_	_
8	aṃśuka	aṃśuka	NOUN	_	Case=Cpd	_	_	_	LemmaId=1174|OccId=259367|Unsandhied=aṃśuka|UnsandhiedReconstructed=True
9	antam	anta	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=11658|OccId=259368|Unsandhied=antam|UnsandhiedReconstructed=True
10	gṛhṇan	grah	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156232|OccId=259269|Unsandhied=gṛhṇan|UnsandhiedReconstructed=True
11-14	keśeṣvapāstaścaraṇanipatito	_	_	_	_	_	_	_	_
11	keśeṣu	keśa	NOUN	_	Case=Loc|Gender=Masc|Number=Plur	_	_	_	LemmaId=4545|OccId=259270|Unsandhied=keśeṣu|UnsandhiedReconstructed=True
12	apāstaḥ	apās	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158510|OccId=259271|Unsandhied=apāstaḥ|UnsandhiedReconstructed=True
13	caraṇa	caraṇa	NOUN	_	Case=Cpd	_	_	_	LemmaId=164451|OccId=259272|Unsandhied=caraṇa|UnsandhiedReconstructed=True
14	nipatitaḥ	nipat	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161308|OccId=259273|Unsandhied=nipatitaḥ|UnsandhiedReconstructed=True
15-16	nekṣitaḥ	_	_	_	_	_	_	_	_
15	na	na	PART	_		_	_	_	LemmaId=43432|OccId=259274|Unsandhied=na|UnsandhiedReconstructed=True
16	īkṣitaḥ	īkṣ	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156133|OccId=259275|Unsandhied=īkṣitaḥ|UnsandhiedReconstructed=True
17	sambhrameṇa	sambhrama	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=103868|OccId=259276|Unsandhied=sambhrameṇa|UnsandhiedReconstructed=True

    """.trimIndent()

        val document = ConlluParser.parseConlluFile(fileContent)

        assertEquals(3, document.sentences.size)
        assertEquals(13, document.sentences[0].tokens.size)
        assertEquals(11, document.sentences[1].tokens.size)
    }
}
