package svg

fun getSampleText() : String = """
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

    # text = āliṅgan yo 'vadhūtas tripurayuvatibhiḥ sāśrunetrotpalābhiḥ kāmīvārdrāparādhaḥ sa dahatu duritaṃ śāmbhavo vaḥ śarāgniḥ
    # sent_id = 101270
    # sent_counter = 2
    # sent_subcounter = 2
    1	āliṅgan	āliṅg	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=171287|OccId=259369|Unsandhied=āliṅgan|UnsandhiedReconstructed=True
    2	yo	yad	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37877|OccId=259334|Unsandhied=yaḥ|UnsandhiedReconstructed=True
    3	'vadhūtas	avadhū	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159536|OccId=259335|Unsandhied=avadhūtaḥ|UnsandhiedReconstructed=True
    4-5	tripurayuvatibhiḥ	_	_	_	_	_	_	_	_
    4	tripura	tripura	NOUN	_	Case=Cpd	_	_	_	LemmaId=84069|OccId=259336|Unsandhied=tripura|UnsandhiedReconstructed=True
    5	yuvatibhiḥ	yuvati	NOUN	_	Case=Ins|Gender=Fem|Number=Plur	_	_	_	LemmaId=64907|OccId=259337|Unsandhied=yuvatibhiḥ|UnsandhiedReconstructed=True
    6-9	sāśrunetrotpalābhiḥ	_	_	_	_	_	_	_	_
    6	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=4167631|Unsandhied=sa|UnsandhiedReconstructed=True
    7	aśru	aśru	NOUN	_	Case=Cpd	_	_	_	LemmaId=60164|OccId=4167632|Unsandhied=aśru|UnsandhiedReconstructed=True
    8	netra	netra	NOUN	_	Case=Cpd	_	_	_	LemmaId=29025|OccId=4167633|Unsandhied=netra|UnsandhiedReconstructed=True
    9	utpalābhiḥ	utpala	NOUN	_	Case=Ins|Gender=Fem|Number=Plur	_	_	_	LemmaId=55973|OccId=4167634|Unsandhied=utpalābhiḥ|UnsandhiedReconstructed=True
    10-13	kāmīvārdrāparādhaḥ	_	_	_	_	_	_	_	_
    10	kāmī	kāmin	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=14007|OccId=259280|Unsandhied=kāmī|UnsandhiedReconstructed=True
    11	iva	iva	PART	_		_	_	_	LemmaId=63807|OccId=259281|Unsandhied=iva|UnsandhiedReconstructed=True
    12	ārdra	ārdra	ADJ	_	Case=Cpd	_	_	_	LemmaId=59556|OccId=259282|Unsandhied=ārdra|UnsandhiedReconstructed=True
    13	aparādhaḥ	aparādha	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=21005|OccId=259283|Unsandhied=aparādhaḥ|UnsandhiedReconstructed=True
    14	sa	tad	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37875|OccId=259284|Unsandhied=saḥ|UnsandhiedReconstructed=True
    15	dahatu	dah	VERB	_	Tense=Pres|Mood=Imp|Person=3|Number=Sing	_	_	_	LemmaId=157371|OccId=259285|Unsandhied=dahatu
    16	duritaṃ	durita	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=85426|OccId=259286|Unsandhied=duritam|UnsandhiedReconstructed=True
    17	śāmbhavo	śāmbhava	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=132345|OccId=259287|Unsandhied=śāmbhavaḥ|UnsandhiedReconstructed=True
    18	vaḥ	tvad	PRON	_	Case=Gen|Number=Plur	_	_	_	LemmaId=37880|OccId=259288|Unsandhied=vaḥ|UnsandhiedReconstructed=True
    19-20	śarāgniḥ	_	_	_	_	_	_	_	_
    19	śara	śara	NOUN	_	Case=Cpd	_	_	_	LemmaId=116797|OccId=259289|Unsandhied=śara|UnsandhiedReconstructed=True
    20	agniḥ	agni	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=5705|OccId=259290|Unsandhied=agniḥ|UnsandhiedReconstructed=True

    # text = ālolām alakāvalīṃ vilulitāṃ bibhraccalatkuṇḍalaṃ kiṃcin mṛṣṭaviśeṣakaṃ tanutaraiḥ khedāmbhasāṃ śīkaraiḥ
    # sent_id = 101271
    # sent_counter = 3
    # sent_subcounter = 1
    1	ālolām	ālola	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=62349|OccId=259338|Unsandhied=ālolām|UnsandhiedReconstructed=True
    2-3	alakāvalīṃ	_	_	_	_	_	_	_	_
    2	alaka	alaka	NOUN	_	Case=Cpd	_	_	_	LemmaId=53613|OccId=259339|Unsandhied=alaka|UnsandhiedReconstructed=True
    3	āvalim	āvali	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=62408|OccId=259340|Unsandhied=āvalim|UnsandhiedReconstructed=True
    4	vilulitāṃ	vilul	VERB	_	Case=Acc|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=171448|OccId=259341|Unsandhied=vilulitām|UnsandhiedReconstructed=True
    5-7	bibhraccalatkuṇḍalaṃ	_	_	_	_	_	_	_	_
    5	_	bhṛ	VERB	_	_|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157419|OccId=259371|Unsandhied=_
    6	_	cal	VERB	_	_|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156252|OccId=259372|Unsandhied=_
    7	kuṇḍalam	kuṇḍala	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=24319|OccId=259373|Unsandhied=kuṇḍalam|UnsandhiedReconstructed=True
    8	kiṃcin	kaścit	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=164309|OccId=259342|Unsandhied=kiṃcid|UnsandhiedReconstructed=True
    9-10	mṛṣṭaviśeṣakaṃ	_	_	_	_	_	_	_	_
    9	mṛṣṭa	mṛj	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157977|OccId=259343|Unsandhied=mṛṣṭa|UnsandhiedReconstructed=True
    10	viśeṣakam	viśeṣaka	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=139222|OccId=259344|Unsandhied=viśeṣakam|UnsandhiedReconstructed=True
    11	tanutaraiḥ	tanutara	ADJ	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=168338|OccId=259291|Unsandhied=tanutaraiḥ|UnsandhiedReconstructed=True
    12-13	khedāmbhasāṃ	_	_	_	_	_	_	_	_
    12	kheda	kheda	NOUN	_	Case=Cpd	_	_	_	LemmaId=128880|OccId=259292|Unsandhied=kheda|UnsandhiedReconstructed=True|WordSem=35009,3996
    13	ambhasām	ambhas	NOUN	_	Case=Gen|Gender=Neut|Number=Plur	_	_	_	LemmaId=32142|OccId=259293|Unsandhied=ambhasām|UnsandhiedReconstructed=True
    14	śīkaraiḥ	śīkara	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=169407|OccId=259294|Unsandhied=śīkaraiḥ|UnsandhiedReconstructed=True

    # text = tanvyā yat suratāntatāntanayanaṃ vaktraṃ rativyatyaye tattvāṃ pātu cirāya kiṃ hariharabrahmādibhirdaivataiḥ
    # sent_id = 101272
    # sent_counter = 3
    # sent_subcounter = 2
    1	tanvyā	tanvī	NOUN	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=96159|OccId=259295|Unsandhied=tanvyāḥ|UnsandhiedReconstructed=True
    2	yat	yad	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37877|OccId=259345|Unsandhied=yat|UnsandhiedReconstructed=True
    3-6	suratāntatāntanayanaṃ	_	_	_	_	_	_	_	_
    3	surata	surata	NOUN	_	Case=Cpd	_	_	_	LemmaId=97545|OccId=259346|Unsandhied=surata|UnsandhiedReconstructed=True
    4	anta	anta	NOUN	_	Case=Cpd	_	_	_	LemmaId=11658|OccId=259347|Unsandhied=anta|UnsandhiedReconstructed=True
    5	tānta	tam	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157175|OccId=259348|Unsandhied=tānta|UnsandhiedReconstructed=True
    6	nayanam	nayana	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=44212|OccId=259349|Unsandhied=nayanam|UnsandhiedReconstructed=True
    7	vaktraṃ	vaktra	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=67809|OccId=259296|Unsandhied=vaktram|UnsandhiedReconstructed=True
    8-9	rativyatyaye	_	_	_	_	_	_	_	_
    8	rati	rati	NOUN	_	Case=Cpd	_	_	_	LemmaId=66668|OccId=259297|Unsandhied=rati|UnsandhiedReconstructed=True
    9	vyatyaye	vyatyaya	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=120963|OccId=259298|Unsandhied=vyatyaye|UnsandhiedReconstructed=True
    10-11	tattvāṃ	_	_	_	_	_	_	_	_
    10	tat	tad	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=259299|Unsandhied=tat|UnsandhiedReconstructed=True
    11	tvā	tvad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37880|OccId=259300|Unsandhied=tvā|UnsandhiedReconstructed=True
    12	pātu	pā	VERB	_	Tense=Pres|Mood=Imp|Person=3|Number=Sing	_	_	_	LemmaId=157846|OccId=259301|Unsandhied=pātu
    13	cirāya	cira	ADJ	_	Case=Dat|Gender=Neut|Number=Sing	_	_	_	LemmaId=51765|OccId=259302|Unsandhied=cirāya|UnsandhiedReconstructed=True
    14	kiṃ	ka	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=259303|Unsandhied=kim|UnsandhiedReconstructed=True
    15-19	hariharabrahmādibhirdaivataiḥ	_	_	_	_	_	_	_	_
    15	hari	hari	NOUN	_	Case=Cpd	_	_	_	LemmaId=108715|OccId=259304|Unsandhied=hari|UnsandhiedReconstructed=True
    16	hara	hara	NOUN	_	Case=Cpd	_	_	_	LemmaId=108599|OccId=259305|Unsandhied=hara|UnsandhiedReconstructed=True
    17	brahma	brahman	NOUN	_	Case=Cpd	_	_	_	LemmaId=149177|OccId=259306|Unsandhied=brahma|UnsandhiedReconstructed=True
    18	ādibhiḥ	ādi	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=57973|OccId=259307|Unsandhied=ādibhiḥ|UnsandhiedReconstructed=True
    19	daivataiḥ	daivata	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=89983|OccId=259308|Unsandhied=daivataiḥ|UnsandhiedReconstructed=True

    # text = alasavalitaiḥ premārdrārdrair muhurmukulīkṛtaiḥ kṣaṇam abhimukhair lajjālolair nimeṣaparāṅmukhaiḥ
    # sent_id = 101273
    # sent_counter = 4
    # sent_subcounter = 1
    1-2	alasavalitaiḥ	_	_	_	_	_	_	_	_
    1	alasa	alasa	ADJ	_	Case=Cpd	_	_	_	LemmaId=53711|OccId=259309|Unsandhied=alasa|UnsandhiedReconstructed=True
    2	valitaiḥ	val	VERB	_	Case=Ins|Gender=Neut|Number=Plur|VerbForm=Part	_	_	_	LemmaId=158954|OccId=259310|Unsandhied=valitaiḥ|UnsandhiedReconstructed=True
    3-5	premārdrārdrair	_	_	_	_	_	_	_	_
    3	prema	preman	NOUN	_	Case=Cpd	_	_	_	LemmaId=153287|OccId=259350|Unsandhied=prema|UnsandhiedReconstructed=True
    4	ārdra	ārdra	ADJ	_	Case=Cpd	_	_	_	LemmaId=59556|OccId=259351|Unsandhied=ārdra|UnsandhiedReconstructed=True
    5	ārdraiḥ	ārdra	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=59556|OccId=259352|Unsandhied=ārdraiḥ|UnsandhiedReconstructed=True
    6-7	muhurmukulīkṛtaiḥ	_	_	_	_	_	_	_	_
    6	muhur	muhur	ADV	_		_	_	_	LemmaId=136357|OccId=259353|Unsandhied=muhur|UnsandhiedReconstructed=True
    7	mukulīkṛtaiḥ	mukulīkṛta	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=133353|OccId=259354|Unsandhied=mukulīkṛtaiḥ|UnsandhiedReconstructed=True
    8	kṣaṇam	kṣaṇa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=135351|OccId=259355|Unsandhied=kṣaṇam|UnsandhiedReconstructed=True
    9	abhimukhair	abhimukha	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=22470|OccId=259356|Unsandhied=abhimukhaiḥ|UnsandhiedReconstructed=True
    10-11	lajjālolair	_	_	_	_	_	_	_	_
    10	lajjā	lajjā	NOUN	_	Case=Cpd	_	_	_	LemmaId=80727|OccId=259357|Unsandhied=lajjā|UnsandhiedReconstructed=True
    11	lolaiḥ	lola	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=81908|OccId=259358|Unsandhied=lolaiḥ|UnsandhiedReconstructed=True
    12-13	nimeṣaparāṅmukhaiḥ	_	_	_	_	_	_	_	_
    12	nimeṣa	nimeṣa	NOUN	_	Case=Cpd	_	_	_	LemmaId=27494|OccId=259359|Unsandhied=nimeṣa|UnsandhiedReconstructed=True
    13	parāṅmukhaiḥ	parāṅmukha	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=18716|OccId=259360|Unsandhied=parāṅmukhaiḥ|UnsandhiedReconstructed=True

    # text = hṛdayanihitaṃ bhāvākūtaṃ vamadbhirivekṣaṇaiḥ kathaya sukṛtī ko 'yaṃ mugdhe tvayādya vilokyate
    # sent_id = 101274
    # sent_counter = 4
    # sent_subcounter = 2
    1-2	hṛdayanihitaṃ	_	_	_	_	_	_	_	_
    1	hṛdaya	hṛdaya	NOUN	_	Case=Cpd	_	_	_	LemmaId=110583|OccId=259311|Unsandhied=hṛdaya|UnsandhiedReconstructed=True
    2	nihitam	nidhā	VERB	_	Case=Acc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161295|OccId=259312|Unsandhied=nihitam|UnsandhiedReconstructed=True
    3	bhāvākūtaṃ	bhāvākūta	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=49930|OccId=259313|Unsandhied=bhāvākūtam|UnsandhiedReconstructed=True
    4-6	vamadbhirivekṣaṇaiḥ	_	_	_	_	_	_	_	_
    4	vamadbhiḥ	vam	VERB	_	Case=Ins|Gender=Neut|Number=Plur|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=158945|OccId=259314|Unsandhied=vamadbhiḥ|UnsandhiedReconstructed=True
    5	iva	iva	PART	_		_	_	_	LemmaId=63807|OccId=259315|Unsandhied=iva|UnsandhiedReconstructed=True
    6	īkṣaṇaiḥ	īkṣaṇa	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=63981|OccId=259316|Unsandhied=īkṣaṇaiḥ|UnsandhiedReconstructed=True
    7	kathaya	kathay	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=156154|OccId=259317|Unsandhied=kathaya
    8	sukṛtī	sukṛtin	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=106751|OccId=259318|Unsandhied=sukṛtī|UnsandhiedReconstructed=True
    9	ko	ka	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37878|OccId=259361|Unsandhied=kaḥ|UnsandhiedReconstructed=True
    10	'yaṃ	idam	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37876|OccId=259362|Unsandhied=ayam|UnsandhiedReconstructed=True
    11	mugdhe	muh	VERB	_	Case=Voc|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157970|OccId=259319|Unsandhied=mugdhe|UnsandhiedReconstructed=True
    12-13	tvayādya	_	_	_	_	_	_	_	_
    12	tvayā	tvad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37880|OccId=259320|Unsandhied=tvayā|UnsandhiedReconstructed=True
    13	adya	adya	ADV	_		_	_	_	LemmaId=7682|OccId=259321|Unsandhied=adya|UnsandhiedReconstructed=True
    14	vilokyate	vilokay	VERB	_	Tense=Pres|Mood=Ind|Voice=Pass|Person=3|Number=Sing	_	_	_	LemmaId=163578|OccId=259363|Unsandhied=vilokyate

    # text = datto'syāḥ praṇayastvayaiva bhavatā ceyaṃ ciraṃ lālitā daivād adya kila tvameva kṛtavān asyā navaṃ vipriyam
    # sent_id = 101275
    # sent_counter = 5
    # sent_subcounter = 1
    1-2	datto'syāḥ	_	_	_	_	_	_	_	_
    1	dattaḥ	dā	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157372|OccId=260184|Unsandhied=dattaḥ|UnsandhiedReconstructed=True
    2	asyāḥ	idam	PRON	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=37876|OccId=260185|Unsandhied=asyāḥ|UnsandhiedReconstructed=True
    3-5	praṇayastvayaiva	_	_	_	_	_	_	_	_
    3	praṇayaḥ	praṇaya	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=151746|OccId=260186|Unsandhied=praṇayaḥ|UnsandhiedReconstructed=True
    4	tvayā	tvad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37880|OccId=260187|Unsandhied=tvayā|UnsandhiedReconstructed=True
    5	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=260188|Unsandhied=eva|UnsandhiedReconstructed=True
    6	bhavatā	bhavat	ADJ	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=49231|OccId=260189|Unsandhied=bhavatā|UnsandhiedReconstructed=True
    7-8	ceyaṃ	_	_	_	_	_	_	_	_
    7	ca	ca	CONJ	_		_	_	_	LemmaId=157144|OccId=260190|Unsandhied=ca|UnsandhiedReconstructed=True
    8	iyam	idam	PRON	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=37876|OccId=260191|Unsandhied=iyam|UnsandhiedReconstructed=True
    9	ciraṃ	ciram	ADV	_		_	_	_	LemmaId=202768|OccId=3165169|Unsandhied=ciram|UnsandhiedReconstructed=True
    10	lālitā	lālay	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=160531|OccId=260193|Unsandhied=lālitā|UnsandhiedReconstructed=True
    11	daivād	daiva	NOUN	_	Case=Abl|Gender=Neut|Number=Sing	_	_	_	LemmaId=89894|OccId=260194|Unsandhied=daivāt|UnsandhiedReconstructed=True
    12	adya	adya	ADV	_		_	_	_	LemmaId=7682|OccId=260195|Unsandhied=adya|UnsandhiedReconstructed=True
    13	kila	kila	PART	_		_	_	_	LemmaId=23494|OccId=260196|Unsandhied=kila|UnsandhiedReconstructed=True
    14-15	tvameva	_	_	_	_	_	_	_	_
    14	tvam	tvad	PRON	_	Case=Nom|Number=Sing	_	_	_	LemmaId=37880|OccId=260197|Unsandhied=tvam|UnsandhiedReconstructed=True
    15	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=260198|Unsandhied=eva|UnsandhiedReconstructed=True
    16	kṛtavān	kṛ	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156168|OccId=260199|Unsandhied=kṛtavan|UnsandhiedReconstructed=True
    17	asyā	idam	PRON	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=37876|OccId=260200|Unsandhied=asyāḥ|UnsandhiedReconstructed=True
    18	navaṃ	nava	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=44486|OccId=260201|Unsandhied=navam|UnsandhiedReconstructed=True
    19	vipriyam	vipriya	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=47460|OccId=260202|Unsandhied=vipriyam|UnsandhiedReconstructed=True

    # text = manyurduḥsaha eṣa yātyupaśamaṃ no sāntvavādaiḥ sphuṭaṃ he nistraṃśa vimuktakaṇṭhakaruṇaṃ tāvatsakhī roditu
    # sent_id = 101276
    # sent_counter = 5
    # sent_subcounter = 2
    1-2	manyurduḥsaha	_	_	_	_	_	_	_	_
    1	manyuḥ	manyu	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=36530|OccId=260203|Unsandhied=manyuḥ|UnsandhiedReconstructed=True
    2	duḥsahaḥ	duḥsaha	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=85081|OccId=260204|Unsandhied=duḥsahaḥ|UnsandhiedReconstructed=True
    3	eṣa	etad	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=163744|OccId=260205|Unsandhied=eṣa|UnsandhiedReconstructed=True
    4-5	yātyupaśamaṃ	_	_	_	_	_	_	_	_
    4	yāti	yā	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=157263|OccId=260206|Unsandhied=yāti
    5	upaśamam	upaśama	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=45629|OccId=260207|Unsandhied=upaśamam|UnsandhiedReconstructed=True
    6	no	no	PART	_		_	_	_	LemmaId=171455|OccId=719345|Unsandhied=no|UnsandhiedReconstructed=True
    7-8	sāntvavādaiḥ	_	_	_	_	_	_	_	_
    7	sāntva	sāntva	NOUN	_	Case=Cpd	_	_	_	LemmaId=112397|OccId=260208|Unsandhied=sāntva|UnsandhiedReconstructed=True
    8	vādāḥ	vāda	NOUN	_	Case=Nom|Gender=Masc|Number=Plur	_	_	_	LemmaId=76575|OccId=260209|Unsandhied=vādāḥ|UnsandhiedReconstructed=True
    9	sphuṭaṃ	sphuṭa	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=113802|OccId=260210|Unsandhied=sphuṭam|UnsandhiedReconstructed=True
    10	he	he	INTJ	_		_	_	_	LemmaId=168763|OccId=260211|Unsandhied=he|UnsandhiedReconstructed=True
    11	nistraṃśa	nistraṃśa	ADJ	_	Case=Voc|Gender=Masc|Number=Sing	_	_	_	LemmaId=34696|OccId=260212|Unsandhied=nistraṃśaiḥ|UnsandhiedReconstructed=True
    12-14	vimuktakaṇṭhakaruṇaṃ	_	_	_	_	_	_	_	_
    12	vimukta	vimuc	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=163524|OccId=260213|Unsandhied=vimukta|UnsandhiedReconstructed=True
    13	kaṇṭha	kaṇṭha	NOUN	_	Case=Cpd	_	_	_	LemmaId=1051|OccId=260214|Unsandhied=kaṇṭha|UnsandhiedReconstructed=True
    14	karuṇam	karuṇa	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=2605|OccId=260215|Unsandhied=karuṇam|UnsandhiedReconstructed=True
    15-16	tāvatsakhī	_	_	_	_	_	_	_	_
    15	tāvat	tāvat	ADV	_		_	_	_	LemmaId=82069|OccId=260216|Unsandhied=tāvat|UnsandhiedReconstructed=True
    16	sakhī	sakhī	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=9140|OccId=260217|Unsandhied=sakhī|UnsandhiedReconstructed=True
    17	roditu	rud	VERB	_	Tense=Pres|Mood=Imp|Person=3|Number=Sing	_	_	_	LemmaId=158014|OccId=260218|Unsandhied=roditu

    # text = likhannāste bhūmiṃ bahiravanataḥ prāṇadayito nirāhārāḥ sakhyaḥ satataruditocchūnanayanāḥ
    # sent_id = 101277
    # sent_counter = 6
    # sent_subcounter = 1
    1-3	likhannāste	_	_	_	_	_	_	_	_
    1	likhan	likh	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=158442|OccId=260219|Unsandhied=likhan|UnsandhiedReconstructed=True
    2	na	na	PART	_		_	_	_	LemmaId=43432|OccId=260220|Unsandhied=na|UnsandhiedReconstructed=True
    3	āste	ās	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=156126|OccId=260221|Unsandhied=āste
    4	bhūmiṃ	bhūmi	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=25418|OccId=260222|Unsandhied=bhūmim|UnsandhiedReconstructed=True
    5-6	bahiravanataḥ	_	_	_	_	_	_	_	_
    5	bahis	bahis	ADV	_		_	_	_	LemmaId=147329|OccId=260223|Unsandhied=bahis|UnsandhiedReconstructed=True
    6	avanataḥ	avanam	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159541|OccId=260224|Unsandhied=avanataḥ|UnsandhiedReconstructed=True
    7	prāṇadayito	prāṇadayita	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=156052|OccId=260225|Unsandhied=prāṇadayitaḥ|UnsandhiedReconstructed=True
    8	nirāhārāḥ	nirāhāra	ADJ	_	Case=Nom|Gender=Masc|Number=Plur	_	_	_	LemmaId=34186|OccId=260226|Unsandhied=nirāhārāḥ|UnsandhiedReconstructed=True
    9	sakhyaḥ	sakhī	NOUN	_	Case=Nom|Gender=Fem|Number=Plur	_	_	_	LemmaId=9140|OccId=260370|Unsandhied=sakhyaḥ|UnsandhiedReconstructed=True
    10-13	satataruditocchūnanayanāḥ	_	_	_	_	_	_	_	_
    10	satata	satata	ADJ	_	Case=Cpd	_	_	_	LemmaId=17014|OccId=260365|Unsandhied=satata|UnsandhiedReconstructed=True
    11	rudita	rudita	NOUN	_	Case=Cpd	_	_	_	LemmaId=71569|OccId=260366|Unsandhied=rudita|UnsandhiedReconstructed=True
    12	ucchūna	ucchūna	ADJ	_	Case=Cpd	_	_	_	LemmaId=55351|OccId=260367|Unsandhied=ucchūna|UnsandhiedReconstructed=True
    13	nayanāḥ	nayana	NOUN	_	Case=Nom|Gender=Fem|Number=Plur	_	_	_	LemmaId=44212|OccId=260368|Unsandhied=nayanāḥ|UnsandhiedReconstructed=True

    # text = parityaktaṃ sarvaṃ hasitapaṭhitaṃ pañjaraśukais tavāvasthā ceyaṃ visṛja kaṭhine mānamadhunā
    # sent_id = 101278
    # sent_counter = 6
    # sent_subcounter = 2
    1	parityaktaṃ	parityaj	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=162023|OccId=260227|Unsandhied=parityaktam|UnsandhiedReconstructed=True
    2	sarvaṃ	sarva	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=104444|OccId=260228|Unsandhied=sarvam|UnsandhiedReconstructed=True
    3-4	hasitapaṭhitaṃ	_	_	_	_	_	_	_	_
    3	hasita	hasita	NOUN	_	Case=Cpd	_	_	_	LemmaId=166742|OccId=260229|Unsandhied=hasita|UnsandhiedReconstructed=True
    4	paṭhitam	paṭh	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157818|OccId=260230|Unsandhied=paṭhitam|UnsandhiedReconstructed=True
    5-6	pañjaraśukais	_	_	_	_	_	_	_	_
    5	pañjara	pañjara	NOUN	_	Case=Cpd	_	_	_	LemmaId=14789|OccId=260231|Unsandhied=pañjara|UnsandhiedReconstructed=True
    6	śukaiḥ	śuka	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=126235|OccId=260232|Unsandhied=śukaiḥ|UnsandhiedReconstructed=True
    7-8	tavāvasthā	_	_	_	_	_	_	_	_
    7	te	tvad	PRON	_	Case=Gen|Number=Sing	_	_	_	LemmaId=37880|OccId=260233|Unsandhied=te|UnsandhiedReconstructed=True
    8	avasthā	avasthā	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=54714|OccId=260234|Unsandhied=avasthā|UnsandhiedReconstructed=True
    9-10	ceyaṃ	_	_	_	_	_	_	_	_
    9	ca	ca	CONJ	_		_	_	_	LemmaId=157144|OccId=260235|Unsandhied=ca|UnsandhiedReconstructed=True
    10	iyam	idam	PRON	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=37876|OccId=260236|Unsandhied=iyam|UnsandhiedReconstructed=True
    11	visṛja	visṛj	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=163648|OccId=260237|Unsandhied=visṛja
    12	kaṭhine	kaṭhina	ADJ	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=895|OccId=260238|Unsandhied=kaṭhine|UnsandhiedReconstructed=True
    13-14	mānamadhunā	_	_	_	_	_	_	_	_
    13	māna	māna	NOUN	_	Case=Cpd	_	_	_	LemmaId=78842|OccId=260239|Unsandhied=māna|UnsandhiedReconstructed=True
    14	madhunā	madhu	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=35443|OccId=260240|Unsandhied=madhunā|UnsandhiedReconstructed=True

    # text = nāryastanvi haṭhāddharanti ramaṇaṃ tiṣṭhanti no vāritās tatkiṃ tāmyasi kiṃ ca rodiṣi mudhā tāsāṃ priyaṃ mā kṛthāḥ
    # sent_id = 101279
    # sent_counter = 7
    # sent_subcounter = 1
    1-2	nāryastanvi	_	_	_	_	_	_	_	_
    1	nāryaḥ	nārī	NOUN	_	Case=Nom|Gender=Fem|Number=Plur	_	_	_	LemmaId=33685|OccId=260241|Unsandhied=nāryaḥ|UnsandhiedReconstructed=True
    2	tanvi	tanvī	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=96159|OccId=260242|Unsandhied=tanvi|UnsandhiedReconstructed=True
    3-4	haṭhāddharanti	_	_	_	_	_	_	_	_
    3	haṭhāt	haṭha	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=120680|OccId=260243|Unsandhied=haṭhāt|UnsandhiedReconstructed=True
    4	haranti	hṛ	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Plur	_	_	_	LemmaId=157558|OccId=260244|Unsandhied=haranti
    5	ramaṇaṃ	ramaṇa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=66750|OccId=260245|Unsandhied=ramaṇam|UnsandhiedReconstructed=True
    6	tiṣṭhanti	sthā	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Plur	_	_	_	LemmaId=157340|OccId=260246|Unsandhied=tiṣṭhanti
    7	no	no	PART	_		_	_	_	LemmaId=171455|OccId=260361|Unsandhied=no|UnsandhiedReconstructed=True
    8	vāritās	vāray	VERB	_	Case=Nom|Gender=Fem|Number=Plur|VerbForm=Part	_	_	_	LemmaId=158095|OccId=260247|Unsandhied=vāritāḥ|UnsandhiedReconstructed=True
    9-10	tatkiṃ	_	_	_	_	_	_	_	_
    9	tat	tad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=260248|Unsandhied=tat|UnsandhiedReconstructed=True
    10	kim	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=260249|Unsandhied=kim|UnsandhiedReconstructed=True
    11	tāmyasi	tam	VERB	_	Tense=Pres|Mood=Ind|Person=2|Number=Sing	_	_	_	LemmaId=157175|OccId=260250|Unsandhied=tāmyasi
    12	kiṃ	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=260251|Unsandhied=kim|UnsandhiedReconstructed=True
    13	ca	ca	CONJ	_		_	_	_	LemmaId=157144|OccId=260252|Unsandhied=ca|UnsandhiedReconstructed=True
    14	rodiṣi	rud	VERB	_	Tense=Pres|Mood=Ind|Person=2|Number=Sing	_	_	_	LemmaId=158014|OccId=260253|Unsandhied=rodiṣi
    15	mudhā	mudhā	ADV	_		_	_	_	LemmaId=136146|OccId=260254|Unsandhied=mudhā|UnsandhiedReconstructed=True
    16	tāsāṃ	tad	PRON	_	Case=Gen|Gender=Fem|Number=Plur	_	_	_	LemmaId=37875|OccId=260255|Unsandhied=tāsām|UnsandhiedReconstructed=True
    17	priyaṃ	priya	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=153187|OccId=260256|Unsandhied=priyam|UnsandhiedReconstructed=True|WordSem=35019,4002
    18	mā	mā	PART	_		_	_	_	LemmaId=170120|OccId=260257|Unsandhied=mā|UnsandhiedReconstructed=True
    19	kṛthāḥ	kṛ	VERB	_	Tense=Past|Mood=Jus|Person=2|Number=Sing	_	_	_	LemmaId=156168|OccId=719346|Unsandhied=kṛthāḥ

    # text = kāntaḥ keliruciryuvā sahṛdayastādṛkpatiḥ kātare kiṃ no barkarakarkaraiḥ priyaśatairākramya vikrīyate
    # sent_id = 101280
    # sent_counter = 7
    # sent_subcounter = 2
    1	kāntaḥ	kānta	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=13607|OccId=260258|Unsandhied=kāntaḥ|UnsandhiedReconstructed=True
    2-4	keliruciryuvā	_	_	_	_	_	_	_	_
    2	keli	keli	NOUN	_	Case=Cpd	_	_	_	LemmaId=4480|OccId=260259|Unsandhied=keli|UnsandhiedReconstructed=True
    3	ruciḥ	ruci	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=71471|OccId=260260|Unsandhied=ruciḥ|UnsandhiedReconstructed=True
    4	yuvā	yuvan	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=64889|OccId=260261|Unsandhied=yuvā|UnsandhiedReconstructed=True
    5-7	sahṛdayastādṛkpatiḥ	_	_	_	_	_	_	_	_
    5	sahṛdayaḥ	sahṛdaya	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=111361|OccId=260262|Unsandhied=sahṛdayaḥ|UnsandhiedReconstructed=True
    6	tādṛś	tādṛś	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=97060|OccId=260263|Unsandhied=tādṛś|UnsandhiedReconstructed=True
    7	patiḥ	pati	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=163749|OccId=260264|Unsandhied=patiḥ|UnsandhiedReconstructed=True
    8	kātare	kātara	ADJ	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=13536|OccId=260350|Unsandhied=kātare|UnsandhiedReconstructed=True
    9	kiṃ	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=260265|Unsandhied=kim|UnsandhiedReconstructed=True
    10	no	no	PART	_		_	_	_	LemmaId=171455|OccId=260362|Unsandhied=no|UnsandhiedReconstructed=True
    11	barkarakarkaraiḥ	barkarakarkara	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=153708|OccId=260266|Unsandhied=barkarakarkaraiḥ|UnsandhiedReconstructed=True
    12-14	priyaśatairākramya	_	_	_	_	_	_	_	_
    12	priya	priya	NOUN	_	Case=Cpd	_	_	_	LemmaId=153187|OccId=260267|Unsandhied=priya|UnsandhiedReconstructed=True|WordSem=35019,4002
    13	śataiḥ	śata	NUM	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=116433|OccId=260268|Unsandhied=śataiḥ|UnsandhiedReconstructed=True
    14	ākramya	ākram	VERB	_	VerbForm=Conv	_	_	_	LemmaId=159714|OccId=260269|Unsandhied=ākramya|UnsandhiedReconstructed=True
    15	vikrīyate	vikrī	VERB	_	Tense=Pres|Mood=Ind|Voice=Pass|Person=3|Number=Sing	_	_	_	LemmaId=163258|OccId=260351|Unsandhied=vikrīyate

    # text = kopāt komalalolabāhulatikāpāśena baddhā dṛḍhaṃ nītvā keliniketanaṃ dayitayā sāyaṃ sakhīnāṃ puraḥ
    # sent_id = 101281
    # sent_counter = 8
    # sent_subcounter = 1
    1	kopāt	kopa	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=4957|OccId=260352|Unsandhied=kopāt|UnsandhiedReconstructed=True
    2-6	komalalolabāhulatikāpāśena	_	_	_	_	_	_	_	_
    2	komala	komala	ADJ	_	Case=Cpd	_	_	_	LemmaId=4992|OccId=260353|Unsandhied=komala|UnsandhiedReconstructed=True
    3	lola	lola	ADJ	_	Case=Cpd	_	_	_	LemmaId=81908|OccId=260354|Unsandhied=lola|UnsandhiedReconstructed=True
    4	bāhu	bāhu	NOUN	_	Case=Cpd	_	_	_	LemmaId=148859|OccId=260355|Unsandhied=bāhu|UnsandhiedReconstructed=True
    5	latikā	latikā	NOUN	_	Case=Cpd	_	_	_	LemmaId=80834|OccId=260356|Unsandhied=latikā|UnsandhiedReconstructed=True
    6	pāśena	pāśa	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=94501|OccId=260357|Unsandhied=pāśena|UnsandhiedReconstructed=True
    7	baddhā	bandh	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157929|OccId=260270|Unsandhied=baddhā|UnsandhiedReconstructed=True
    8	dṛḍhaṃ	dṛḍha	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=86273|OccId=260271|Unsandhied=dṛḍham|UnsandhiedReconstructed=True
    9	nītvā	nī	VERB	_	VerbForm=Conv	_	_	_	LemmaId=157259|OccId=260272|Unsandhied=nītvā|UnsandhiedReconstructed=True
    10-11	keliniketanaṃ	_	_	_	_	_	_	_	_
    10	keli	keli	NOUN	_	Case=Cpd	_	_	_	LemmaId=4480|OccId=260273|Unsandhied=keli|UnsandhiedReconstructed=True
    11	niketanam	niketana	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=34827|OccId=260274|Unsandhied=niketanam|UnsandhiedReconstructed=True
    12	dayitayā	dayitā	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=146377|OccId=260275|Unsandhied=dayitayā|UnsandhiedReconstructed=True
    13	sāyaṃ	sāya	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=112873|OccId=260276|Unsandhied=sāyam|UnsandhiedReconstructed=True
    14	sakhīnāṃ	sakhī	NOUN	_	Case=Gen|Gender=Fem|Number=Plur	_	_	_	LemmaId=9140|OccId=260277|Unsandhied=sakhīnām|UnsandhiedReconstructed=True
    15	puraḥ	puras	ADV	_		_	_	_	LemmaId=143794|OccId=260278|Unsandhied=puras|UnsandhiedReconstructed=True

    # text = bhūyo'pyevamiti skhalan mṛdugirā saṃsūcya duśceṣṭitaṃ dhanyo hanyata eva nihnutiparaḥ preyān rudatyā hasan
    # sent_id = 101282
    # sent_counter = 8
    # sent_subcounter = 2
    1-4	bhūyo'pyevamiti	_	_	_	_	_	_	_	_
    1	bhūyaḥ	bhūyas	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=25548|OccId=260279|Unsandhied=bhūyaḥ|UnsandhiedReconstructed=True
    2	api	api	PART	_		_	_	_	LemmaId=21365|OccId=260280|Unsandhied=api|UnsandhiedReconstructed=True
    3	evam	evam	ADV	_		_	_	_	LemmaId=39758|OccId=260281|Unsandhied=evam|UnsandhiedReconstructed=True
    4	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=260282|Unsandhied=iti|UnsandhiedReconstructed=True
    5	skhalan	skhal	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=159069|OccId=260283|Unsandhied=skhalan|UnsandhiedReconstructed=True
    6-7	mṛdugirā	_	_	_	_	_	_	_	_
    6	mṛdu	mṛdu	ADJ	_	Case=Cpd	_	_	_	LemmaId=137707|OccId=260284|Unsandhied=mṛdu|UnsandhiedReconstructed=True
    7	girā	gir	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=123966|OccId=260285|Unsandhied=girā|UnsandhiedReconstructed=True
    8	saṃsūcya	saṃsūcay	VERB	_	VerbForm=Conv	_	_	_	LemmaId=170610|OccId=260286|Unsandhied=saṃsūcya|UnsandhiedReconstructed=True
    9	duśceṣṭitaṃ	duśceṣṭita	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=171456|OccId=260369|Unsandhied=duśceṣṭitam|UnsandhiedReconstructed=True
    10	dhanyo	dhanya	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=91733|OccId=260287|Unsandhied=dhanyaḥ|UnsandhiedReconstructed=True
    11	hanyata	han	VERB	_	Tense=Pres|Mood=Ind|Voice=Pass|Person=3|Number=Sing	_	_	_	LemmaId=157282|OccId=260288|Unsandhied=hanyate
    12	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=260289|Unsandhied=eva|UnsandhiedReconstructed=True
    13-14	nihnutiparaḥ	_	_	_	_	_	_	_	_
    13	nihnuti	nihnuti	NOUN	_	Case=Cpd	_	_	_	LemmaId=28460|OccId=260290|Unsandhied=nihnuti|UnsandhiedReconstructed=True
    14	paraḥ	para	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=163234|OccId=260291|Unsandhied=paraḥ|UnsandhiedReconstructed=True
    15	preyān	preyas	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=153289|OccId=2902428|Unsandhied=preyāḥ|UnsandhiedReconstructed=True
    16	rudatyā	rud	VERB	_	Case=Ins|Gender=Fem|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=158014|OccId=260292|Unsandhied=rudatyā|UnsandhiedReconstructed=True
    17	hasan	has	VERB	_	Case=Nom|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=158488|OccId=260293|Unsandhied=hasan|UnsandhiedReconstructed=True

    # text = praharaviratau madhye vāhnastato'pi pare'thavā kimuta sakale jāte vāhṇi priya tvamihaiṣyasi
    # sent_id = 101283
    # sent_counter = 9
    # sent_subcounter = 1
    1-2	praharaviratau	_	_	_	_	_	_	_	_
    1	prahara	prahara	NOUN	_	Case=Cpd	_	_	_	LemmaId=155824|OccId=260294|Unsandhied=prahara|UnsandhiedReconstructed=True|WordSem=102344,66562
    2	viratau	virati	NOUN	_	Case=Loc|Gender=Fem|Number=Sing	_	_	_	LemmaId=135713|OccId=260295|Unsandhied=viratau|UnsandhiedReconstructed=True
    3	madhye	madhya	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=35810|OccId=260296|Unsandhied=madhye|UnsandhiedReconstructed=True
    4-7	vāhnastato'pi	_	_	_	_	_	_	_	_
    4	vā	vā	CONJ	_		_	_	_	LemmaId=75765|OccId=260297|Unsandhied=vā|UnsandhiedReconstructed=True
    5	ahnaḥ	ahar	NOUN	_	Case=Gen|Gender=Neut|Number=Sing	_	_	_	LemmaId=168349|OccId=260298|Unsandhied=ahnaḥ|UnsandhiedReconstructed=True
    6	tatas	tatas	ADV	_		_	_	_	LemmaId=95922|OccId=260299|Unsandhied=tatas|UnsandhiedReconstructed=True
    7	api	api	PART	_		_	_	_	LemmaId=21365|OccId=260300|Unsandhied=api|UnsandhiedReconstructed=True
    8-9	pare'thavā	_	_	_	_	_	_	_	_
    8	pare	para	PRON	_	Case=Nom|Gender=Masc|Number=Plur	_	_	_	LemmaId=163234|OccId=260301|Unsandhied=pare|UnsandhiedReconstructed=True
    9	athavā	athavā	CONJ	_		_	_	_	LemmaId=7472|OccId=260302|Unsandhied=athavā|UnsandhiedReconstructed=True
    10-11	kimuta	_	_	_	_	_	_	_	_
    10	kim	ka	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=260303|Unsandhied=kim|UnsandhiedReconstructed=True
    11	uta	uta	CONJ	_		_	_	_	LemmaId=55443|OccId=260304|Unsandhied=uta|UnsandhiedReconstructed=True
    12	sakale	sakala	ADJ	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=8639|OccId=260305|Unsandhied=sakale|UnsandhiedReconstructed=True
    13	jāte	jan	VERB	_	Case=Loc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156584|OccId=260306|Unsandhied=jāte|UnsandhiedReconstructed=True
    14-15	vāhṇi	_	_	_	_	_	_	_	_
    14	vā	vā	CONJ	_		_	_	_	LemmaId=75765|OccId=719347|Unsandhied=vā|UnsandhiedReconstructed=True
    15	ahani	ahar	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=168349|OccId=719348|Unsandhied=ahani|UnsandhiedReconstructed=True
    16	priya	priya	ADJ	_	Case=Voc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153185|OccId=260358|Unsandhied=priyaiḥ|UnsandhiedReconstructed=True
    17-19	tvamihaiṣyasi	_	_	_	_	_	_	_	_
    17	tvam	tvad	PRON	_	Case=Nom|Number=Sing	_	_	_	LemmaId=37880|OccId=260307|Unsandhied=tvam|UnsandhiedReconstructed=True
    18	iha	iha	ADV	_		_	_	_	LemmaId=63959|OccId=260308|Unsandhied=iha|UnsandhiedReconstructed=True
    19	eṣyasi	i	VERB	_	Tense=Fut|Mood=Ind|Person=2|Number=Sing	_	_	_	LemmaId=156127|OccId=260309|Unsandhied=eṣyasi

    # text = iti dinaśataprāpyaṃ deśaṃ priyasya yiyāsato harati gamanaṃ bālālāpaiḥ sabāṣpagalajjalaiḥ
    # sent_id = 101284
    # sent_counter = 9
    # sent_subcounter = 2
    1	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=260310|Unsandhied=iti|UnsandhiedReconstructed=True
    2-4	dinaśataprāpyaṃ	_	_	_	_	_	_	_	_
    2	dina	dina	NOUN	_	Case=Cpd	_	_	_	LemmaId=147072|OccId=260311|Unsandhied=dina|UnsandhiedReconstructed=True
    3	śata	śata	NUM	_	Case=Cpd	_	_	_	LemmaId=116433|OccId=260312|Unsandhied=śata|UnsandhiedReconstructed=True
    4	prāpyam	prāp	VERB	_	Case=Acc|Gender=Masc|Number=Sing|VerbForm=Gdv	_	_	_	LemmaId=163158|OccId=260313|Unsandhied=prāpyam|UnsandhiedReconstructed=True
    5	deśaṃ	deśa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=87204|OccId=260314|Unsandhied=deśam|UnsandhiedReconstructed=True
    6	priyasya	priya	ADJ	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=153185|OccId=260315|Unsandhied=priyasya|UnsandhiedReconstructed=True
    7	yiyāsato	yiyās	VERB	_	Case=Gen|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=171454|OccId=260359|Unsandhied=yiyāsataḥ|UnsandhiedReconstructed=True
    8	harati	hṛ	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=157558|OccId=260316|Unsandhied=harati
    9	gamanaṃ	gamana	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=129464|OccId=260317|Unsandhied=gamanam|UnsandhiedReconstructed=True
    10-11	bālālāpaiḥ	_	_	_	_	_	_	_	_
    10	bāla	bāla	ADJ	_	Case=Cpd	_	_	_	LemmaId=147893|OccId=260318|Unsandhied=bāla|UnsandhiedReconstructed=True
    11	ālāpaiḥ	ālāpa	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=62245|OccId=260319|Unsandhied=ālāpaiḥ|UnsandhiedReconstructed=True
    12-15	sabāṣpagalajjalaiḥ	_	_	_	_	_	_	_	_
    12	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=2566714|Unsandhied=sa|UnsandhiedReconstructed=True
    13	bāṣpa	bāṣpa	NOUN	_	Case=Cpd	_	_	_	LemmaId=148844|OccId=2566715|Unsandhied=bāṣpa|UnsandhiedReconstructed=True
    14	galat	gal	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156217|OccId=2566716|Unsandhied=galat|UnsandhiedReconstructed=True
    15	jalaiḥ	jala	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=88026|OccId=2566717|Unsandhied=jalaiḥ|UnsandhiedReconstructed=True

    # text = yātāḥ kiṃ na milanti sundari punaścintā tvayā matkṛte no kāryā nitarāṃ kṛśāmi kathayatyevaṃ sabāṣpe mayi
    # sent_id = 101285
    # sent_counter = 10
    # sent_subcounter = 1
    1	yātāḥ	yā	VERB	_	Case=Nom|Gender=Masc|Number=Plur|VerbForm=Part	_	_	_	LemmaId=157263|OccId=260320|Unsandhied=yātāḥ|UnsandhiedReconstructed=True
    2	kiṃ	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=260321|Unsandhied=kim|UnsandhiedReconstructed=True
    3	na	na	PART	_		_	_	_	LemmaId=43432|OccId=260322|Unsandhied=na|UnsandhiedReconstructed=True
    4	milanti	mil	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Plur	_	_	_	LemmaId=169963|OccId=260323|Unsandhied=milanti
    5	sundari	sundarī	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=107809|OccId=260324|Unsandhied=sundari|UnsandhiedReconstructed=True
    6-7	punaścintā	_	_	_	_	_	_	_	_
    6	punar	punar	ADV	_		_	_	_	LemmaId=143659|OccId=260325|Unsandhied=punar|UnsandhiedReconstructed=True
    7	cintā	cintā	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=51708|OccId=260326|Unsandhied=cintā|UnsandhiedReconstructed=True
    8	tvayā	tvad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37880|OccId=260327|Unsandhied=tvayā|UnsandhiedReconstructed=True
    9-10	matkṛte	_	_	_	_	_	_	_	_
    9	mad	mad	PRON	_	Case=Cpd	_	_	_	LemmaId=37879|OccId=260328|Unsandhied=mad|UnsandhiedReconstructed=True
    10	kṛte	kṛ	VERB	_	Case=Loc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156168|OccId=260329|Unsandhied=kṛte|UnsandhiedReconstructed=True
    11	no	no	PART	_		_	_	_	LemmaId=171455|OccId=260363|Unsandhied=no|UnsandhiedReconstructed=True
    12	kāryā	kṛ	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Gdv	_	_	_	LemmaId=156168|OccId=260330|Unsandhied=kāryā|UnsandhiedReconstructed=True
    13	nitarāṃ	nitarām	ADV	_		_	_	_	LemmaId=35014|OccId=260331|Unsandhied=nitarām|UnsandhiedReconstructed=True
    14	kṛśāmi	kṛś	VERB	_	Tense=Pres|Mood=Ind|Person=1|Number=Sing	_	_	_	LemmaId=156173|OccId=260364|Unsandhied=kṛśāmi
    15-16	kathayatyevaṃ	_	_	_	_	_	_	_	_
    15	kathayati	kathay	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=156154|OccId=260332|Unsandhied=kathayati
    16	evam	evam	ADV	_		_	_	_	LemmaId=39758|OccId=260333|Unsandhied=evam|UnsandhiedReconstructed=True
    17-18	sabāṣpe	_	_	_	_	_	_	_	_
    17	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=2566712|Unsandhied=sa|UnsandhiedReconstructed=True
    18	bāṣpe	bāṣpa	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=148844|OccId=2566713|Unsandhied=bāṣpe|UnsandhiedReconstructed=True
    19	mayi	mad	PRON	_	Case=Loc|Number=Sing	_	_	_	LemmaId=37879|OccId=260335|Unsandhied=mayi|UnsandhiedReconstructed=True

    # text = lajjāmantharatārakeṇa nipataddhārāśruṇā cakṣuṣā dṛṣṭvā māṃ hasitena bhāvimaraṇotsāhastayā sūcitaḥ
    # sent_id = 101286
    # sent_counter = 10
    # sent_subcounter = 2
    1-3	lajjāmantharatārakeṇa	_	_	_	_	_	_	_	_
    1	lajjā	lajjā	NOUN	_	Case=Cpd	_	_	_	LemmaId=80727|OccId=260336|Unsandhied=lajjā|UnsandhiedReconstructed=True
    2	manthara	manthara	ADJ	_	Case=Cpd	_	_	_	LemmaId=36592|OccId=260337|Unsandhied=manthara|UnsandhiedReconstructed=True
    3	tārakeṇa	tāraka	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=97356|OccId=260338|Unsandhied=tārakeṇa|UnsandhiedReconstructed=True
    4-6	nipataddhārāśruṇā	_	_	_	_	_	_	_	_
    4	nipatat	nipat	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=161308|OccId=260339|Unsandhied=nipatat|UnsandhiedReconstructed=True
    5	dhārā	dhārā	NOUN	_	Case=Cpd	_	_	_	LemmaId=42579|OccId=260340|Unsandhied=dhārā|UnsandhiedReconstructed=True
    6	aśruṇā	aśru	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=60164|OccId=260341|Unsandhied=aśruṇā|UnsandhiedReconstructed=True
    7	cakṣuṣā	cakṣus	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=161797|OccId=260342|Unsandhied=cakṣuṣā|UnsandhiedReconstructed=True
    8	dṛṣṭvā	dṛś	VERB	_	VerbForm=Conv	_	_	_	LemmaId=157766|OccId=260343|Unsandhied=dṛṣṭvā|UnsandhiedReconstructed=True
    9	māṃ	mad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37879|OccId=260344|Unsandhied=mām|UnsandhiedReconstructed=True
    10	hasitena	hasita	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=166742|OccId=260360|Unsandhied=hasitena|UnsandhiedReconstructed=True
    11-14	bhāvimaraṇotsāhastayā	_	_	_	_	_	_	_	_
    11	bhāvi	bhāvin	ADJ	_	Case=Cpd	_	_	_	LemmaId=49987|OccId=260345|Unsandhied=bhāvi|UnsandhiedReconstructed=True
    12	maraṇa	maraṇa	NOUN	_	Case=Cpd	_	_	_	LemmaId=36896|OccId=260346|Unsandhied=maraṇa|UnsandhiedReconstructed=True
    13	utsāhaḥ	utsāha	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=56090|OccId=260347|Unsandhied=utsāhaḥ|UnsandhiedReconstructed=True|WordSem=28752
    14	tayā	tad	PRON	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=260348|Unsandhied=tayā|UnsandhiedReconstructed=True
    15	sūcitaḥ	sūcay	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=165605|OccId=260349|Unsandhied=sūcitaḥ|UnsandhiedReconstructed=True

    # text = dhīraṃ vāridharasya vāri kirataḥ śrutvā niśīthe dhvaniṃ dīrghocchvāsamudaśruṇā virahiṇīṃ bālāṃ ciraṃ dhyāyatā
    # sent_id = 101287
    # sent_counter = 11
    # sent_subcounter = 1
    1	dhīraṃ	dhīra	ADJ	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=42703|OccId=719352|Unsandhied=dhīram|UnsandhiedReconstructed=True
    2	vāridharasya	vāridhara	NOUN	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=46416|OccId=719353|Unsandhied=vāridharasya|UnsandhiedReconstructed=True
    3	vāri	vāri	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=166113|OccId=719354|Unsandhied=vāri|UnsandhiedReconstructed=True
    4	kirataḥ	kṛ	VERB	_	Case=Gen|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156169|OccId=719355|Unsandhied=kirataḥ|UnsandhiedReconstructed=True
    5	śrutvā	śru	VERB	_	VerbForm=Conv	_	_	_	LemmaId=157409|OccId=719356|Unsandhied=śrutvā|UnsandhiedReconstructed=True
    6	niśīthe	niśītha	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=28170|OccId=719357|Unsandhied=niśīthe|UnsandhiedReconstructed=True
    7	dhvaniṃ	dhvani	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=43355|OccId=719358|Unsandhied=dhvanim|UnsandhiedReconstructed=True
    8-10	dīrghocchvāsamudaśruṇā	_	_	_	_	_	_	_	_
    8	dīrgha	dīrgha	ADJ	_	Case=Cpd	_	_	_	LemmaId=84789|OccId=719359|Unsandhied=dīrgha|UnsandhiedReconstructed=True
    9	ucchvāsam	ucchvāsa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=55348|OccId=719360|Unsandhied=ucchvāsam|UnsandhiedReconstructed=True
    10	udaśruṇā	udaśru	ADJ	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=56420|OccId=719361|Unsandhied=udaśruṇā|UnsandhiedReconstructed=True
    11	virahiṇīṃ	virahin	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=138107|OccId=719362|Unsandhied=virahinīm|UnsandhiedReconstructed=True
    12	bālāṃ	bāla	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=147893|OccId=719363|Unsandhied=bālām|UnsandhiedReconstructed=True
    13	ciraṃ	ciram	ADV	_		_	_	_	LemmaId=202768|OccId=3165170|Unsandhied=ciram|UnsandhiedReconstructed=True
    14	dhyāyatā	dhyā	VERB	_	Case=Ins|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157380|OccId=719365|Unsandhied=dhyāyatā|UnsandhiedReconstructed=True

    # text = adhvanyena vimuktakaṇṭhamakhilāṃ rātriṃ tathā kranditaṃ grāmīṇairvrajato janasya vasatirgrāme niṣiddhā yathā
    # sent_id = 101288
    # sent_counter = 11
    # sent_subcounter = 2
    1	adhvanyena	adhvanya	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=9734|OccId=719366|Unsandhied=adhvanyena|UnsandhiedReconstructed=True
    2-4	vimuktakaṇṭhamakhilāṃ	_	_	_	_	_	_	_	_
    2	vimukta	vimuc	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=163524|OccId=719367|Unsandhied=vimukta|UnsandhiedReconstructed=True
    3	kaṇṭham	kaṇṭha	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=1051|OccId=719368|Unsandhied=kaṇṭham|UnsandhiedReconstructed=True
    4	akhilām	akhila	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=5605|OccId=719369|Unsandhied=akhilām|UnsandhiedReconstructed=True
    5	rātriṃ	rātri	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=70626|OccId=719370|Unsandhied=rātrim|UnsandhiedReconstructed=True
    6	tathā	tathā	ADV	_		_	_	_	LemmaId=95987|OccId=719371|Unsandhied=tathā|UnsandhiedReconstructed=True
    7	kranditaṃ	krand	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156178|OccId=719372|Unsandhied=kranditam|UnsandhiedReconstructed=True
    8-9	grāmīṇairvrajato	_	_	_	_	_	_	_	_
    8	grāmīṇaiḥ	grāmīṇa	ADJ	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=156974|OccId=719373|Unsandhied=grāmīṇaiḥ|UnsandhiedReconstructed=True
    9	vrajataḥ	vraj	VERB	_	Case=Gen|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157500|OccId=719374|Unsandhied=vrajataḥ|UnsandhiedReconstructed=True
    10	janasya	jana	NOUN	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=87452|OccId=719375|Unsandhied=janasya|UnsandhiedReconstructed=True
    11-12	vasatirgrāme	_	_	_	_	_	_	_	_
    11	vasatiḥ	vasati	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=75556|OccId=719376|Unsandhied=vasatiḥ|UnsandhiedReconstructed=True
    12	grāme	grāma	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=156948|OccId=719377|Unsandhied=grāme|UnsandhiedReconstructed=True
    13	niṣiddhā	niṣidh	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161507|OccId=719378|Unsandhied=niṣiddhā|UnsandhiedReconstructed=True
    14	yathā	yathā	PART	_		_	_	_	LemmaId=73250|OccId=719379|Unsandhied=yathā|UnsandhiedReconstructed=True

    # text = kathamapi sakhi krīḍākopād vrajeti mayodite kaṭhinahṛdayastyaktvā śayyāṃ balād gata eva saḥ
    # sent_id = 101289
    # sent_counter = 12
    # sent_subcounter = 1
    1-2	kathamapi	_	_	_	_	_	_	_	_
    1	katham	katham	ADV	_		_	_	_	LemmaId=1340|OccId=719380|Unsandhied=katham|UnsandhiedReconstructed=True
    2	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719381|Unsandhied=api|UnsandhiedReconstructed=True
    3	sakhi	sakhī	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=9140|OccId=719382|Unsandhied=sakhi|UnsandhiedReconstructed=True
    4-5	krīḍākopād	_	_	_	_	_	_	_	_
    4	krīḍā	krīḍā	NOUN	_	Case=Cpd	_	_	_	LemmaId=134134|OccId=719383|Unsandhied=krīḍā|UnsandhiedReconstructed=True
    5	kopāt	kopa	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=4957|OccId=719384|Unsandhied=kopāt|UnsandhiedReconstructed=True
    6-7	vrajeti	_	_	_	_	_	_	_	_
    6	vraja	vraj	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=157500|OccId=719385|Unsandhied=vraja
    7	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719386|Unsandhied=iti|UnsandhiedReconstructed=True
    8-9	mayodite	_	_	_	_	_	_	_	_
    8	mayā	mad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37879|OccId=719387|Unsandhied=mayā|UnsandhiedReconstructed=True
    9	udite	vad	VERB	_	Case=Loc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157266|OccId=719388|Unsandhied=udite|UnsandhiedReconstructed=True
    10-12	kaṭhinahṛdayastyaktvā	_	_	_	_	_	_	_	_
    10	kaṭhina	kaṭhina	ADJ	_	Case=Cpd	_	_	_	LemmaId=895|OccId=719389|Unsandhied=kaṭhina|UnsandhiedReconstructed=True
    11	hṛdayaḥ	hṛdaya	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=110583|OccId=719390|Unsandhied=hṛdayaḥ|UnsandhiedReconstructed=True
    12	tyaktvā	tyaj	VERB	_	VerbForm=Conv	_	_	_	LemmaId=158636|OccId=719391|Unsandhied=tyaktvā|UnsandhiedReconstructed=True
    13	śayyāṃ	śayyā	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=116789|OccId=719392|Unsandhied=śayyām|UnsandhiedReconstructed=True
    14	balād	bala	NOUN	_	Case=Abl|Gender=Neut|Number=Sing	_	_	_	LemmaId=154315|OccId=719393|Unsandhied=balāt|UnsandhiedReconstructed=True
    15	gata	gam	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156214|OccId=719394|Unsandhied=gataḥ|UnsandhiedReconstructed=True
    16	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=719395|Unsandhied=eva|UnsandhiedReconstructed=True
    17	saḥ	tad	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37875|OccId=719396|Unsandhied=saḥ|UnsandhiedReconstructed=True

    # text = iti sarabhasaṃ dhvastapremṇi vyapetaghṛṇe jane punarapi hatavrīḍaṃ cetaḥ prayāti karomi kim
    # sent_id = 101290
    # sent_counter = 12
    # sent_subcounter = 2
    1	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719397|Unsandhied=iti|UnsandhiedReconstructed=True
    2	sarabhasaṃ	sarabhasa	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=168130|OccId=719398|Unsandhied=sarabhasam|UnsandhiedReconstructed=True
    3-4	dhvastapremṇi	_	_	_	_	_	_	_	_
    3	dhvasta	dhvaṃs	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157527|OccId=720798|Unsandhied=dhvasta|UnsandhiedReconstructed=True
    4	premṇi	preman	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153287|OccId=720799|Unsandhied=premṇi|UnsandhiedReconstructed=True
    5-6	vyapetaghṛṇe	_	_	_	_	_	_	_	_
    5	vyapeta	vyape	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=164574|OccId=719399|Unsandhied=vyapeta|UnsandhiedReconstructed=True
    6	ghṛṇe	ghṛṇā	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=161190|OccId=719400|Unsandhied=ghṛṇe|UnsandhiedReconstructed=True
    7	jane	jan	VERB	_	Tense=Pres|Mood=Ind|Person=1|Number=Sing	_	_	_	LemmaId=156584|OccId=719401|Unsandhied=jane
    8-9	punarapi	_	_	_	_	_	_	_	_
    8	punar	punar	ADV	_		_	_	_	LemmaId=143659|OccId=719402|Unsandhied=punar|UnsandhiedReconstructed=True
    9	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719403|Unsandhied=api|UnsandhiedReconstructed=True
    10	hatavrīḍaṃ	hatavrīḍa	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=120752|OccId=719404|Unsandhied=hatavrīḍam|UnsandhiedReconstructed=True
    11	cetaḥ	cetas	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=51687|OccId=719405|Unsandhied=cetaḥ|UnsandhiedReconstructed=True
    12	prayāti	prayā	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=162977|OccId=719406|Unsandhied=prayāti
    13	karomi	kṛ	VERB	_	Tense=Pres|Mood=Ind|Person=1|Number=Sing	_	_	_	LemmaId=156168|OccId=719407|Unsandhied=karomi
    14	kim	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=719408|Unsandhied=kim|UnsandhiedReconstructed=True

    # text = dampatyorniśi jalpatorgṛhaśukenākarṇitaṃ yadvacas tatprātargurusaṃnidhau nigadatastasyopahāraṃ vadhūḥ
    # sent_id = 101291
    # sent_counter = 13
    # sent_subcounter = 1
    1-2	dampatyorniśi	_	_	_	_	_	_	_	_
    1	dampatiyoḥ	dampati	NOUN	_	Case=Gen|Gender=Masc|Number=Dual	_	_	_	LemmaId=101163|OccId=719409|Unsandhied=dampatiyoḥ|UnsandhiedReconstructed=True
    2	niśi	niś	NOUN	_	Case=Loc|Gender=Fem|Number=Sing	_	_	_	LemmaId=166514|OccId=719410|Unsandhied=niśi|UnsandhiedReconstructed=True
    3-5	jalpatorgṛhaśukenākarṇitaṃ	_	_	_	_	_	_	_	_
    3	jalpatoḥ	jalp	VERB	_	Case=Gen|Gender=Masc|Number=Dual|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156587|OccId=719411|Unsandhied=jalpatoḥ|UnsandhiedReconstructed=True
    4	gṛhaśukena	gṛhaśuka	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=124322|OccId=719412|Unsandhied=gṛhaśukena|UnsandhiedReconstructed=True
    5	ākarṇitam	ākarṇay	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159698|OccId=719413|Unsandhied=ākarṇitam|UnsandhiedReconstructed=True
    6-7	yadvacas	_	_	_	_	_	_	_	_
    6	yat	yad	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37877|OccId=719414|Unsandhied=yat|UnsandhiedReconstructed=True
    7	vacaḥ	vacas	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=67891|OccId=719415|Unsandhied=vacaḥ|UnsandhiedReconstructed=True
    8-11	tatprātargurusaṃnidhau	_	_	_	_	_	_	_	_
    8	tat	tad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=719469|Unsandhied=tat|UnsandhiedReconstructed=True
    9	prātar	prātar	ADV	_		_	_	_	LemmaId=152151|OccId=719470|Unsandhied=prātar|UnsandhiedReconstructed=True
    10	guru	guru	NOUN	_	Case=Cpd	_	_	_	LemmaId=124569|OccId=719471|Unsandhied=guru|UnsandhiedReconstructed=True
    11	saṃnidhau	saṃnidhi	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=17827|OccId=719472|Unsandhied=saṃnidhau|UnsandhiedReconstructed=True
    12-14	nigadatastasyopahāraṃ	_	_	_	_	_	_	_	_
    12	nigadataḥ	nigad	VERB	_	Case=Gen|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=161265|OccId=719416|Unsandhied=nigadataḥ|UnsandhiedReconstructed=True
    13	tasya	tad	PRON	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=37875|OccId=719417|Unsandhied=tasya|UnsandhiedReconstructed=True
    14	upahāram	upahāra	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=45916|OccId=719418|Unsandhied=upahāram|UnsandhiedReconstructed=True
    15	vadhūḥ	vadhū	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=68437|OccId=719419|Unsandhied=vadhūḥ|UnsandhiedReconstructed=True

    # text = karṇālaṃkṛtipadmarāgaśakalaṃ vinyasya cañcūpuṭe vrīḍārtā prakaroti dāḍimaphalavyājena vāgbandhanam
    # sent_id = 101292
    # sent_counter = 13
    # sent_subcounter = 2
    1-3	karṇālaṃkṛtipadmarāgaśakalaṃ	_	_	_	_	_	_	_	_
    1	karṇālaṃkṛti	karṇālaṃkṛti	NOUN	_	Case=Cpd	_	_	_	LemmaId=12085|OccId=719473|Unsandhied=karṇālaṃkṛti|UnsandhiedReconstructed=True
    2	padmarāga	padmarāga	NOUN	_	Case=Cpd	_	_	_	LemmaId=15970|OccId=719474|Unsandhied=padmarāga|UnsandhiedReconstructed=True
    3	śakalam	śakala	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=116352|OccId=719475|Unsandhied=śakalam|UnsandhiedReconstructed=True
    4	vinyasya	vinyas	VERB	_	VerbForm=Conv	_	_	_	LemmaId=163435|OccId=719420|Unsandhied=vinyasya|UnsandhiedReconstructed=True
    5-6	cañcūpuṭe	_	_	_	_	_	_	_	_
    5	cañcū	cañcū	NOUN	_	Case=Cpd	_	_	_	LemmaId=160999|OccId=719421|Unsandhied=cañcū|UnsandhiedReconstructed=True
    6	puṭe	puṭa	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=144408|OccId=719422|Unsandhied=puṭe|UnsandhiedReconstructed=True
    7-8	vrīḍārtā	_	_	_	_	_	_	_	_
    7	vrīḍā	vrīḍā	NOUN	_	Case=Cpd	_	_	_	LemmaId=169455|OccId=719423|Unsandhied=vrīḍā|UnsandhiedReconstructed=True
    8	ārtā	ārta	ADJ	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=59273|OccId=719424|Unsandhied=ārtā|UnsandhiedReconstructed=True
    9	prakaroti	prakṛ	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=162335|OccId=719425|Unsandhied=prakaroti
    10-12	dāḍimaphalavyājena	_	_	_	_	_	_	_	_
    10	dāḍima	dāḍima	NOUN	_	Case=Cpd	_	_	_	LemmaId=166677|OccId=719426|Unsandhied=dāḍima|UnsandhiedReconstructed=True
    11	phala	phala	NOUN	_	Case=Cpd	_	_	_	LemmaId=154076|OccId=719427|Unsandhied=phala|UnsandhiedReconstructed=True
    12	vyājena	vyāja	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=121098|OccId=719428|Unsandhied=vyājena|UnsandhiedReconstructed=True
    13	vāgbandhanam	vāgbandhana	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=76180|OccId=719429|Unsandhied=vāgbandhanam|UnsandhiedReconstructed=True

    # text = ajñānena parāṅmukhīṃ paribhavād āśliṣya māṃ duḥkhitāṃ kiṃ labdhaṃ caṭula tvayeha nayatā saubhāgyametāṃ daśām
    # sent_id = 101293
    # sent_counter = 14
    # sent_subcounter = 1
    1	ajñānena	ajñāna	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=6617|OccId=719430|Unsandhied=ajñānena|UnsandhiedReconstructed=True
    2	parāṅmukhīṃ	parāṅmukha	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=18716|OccId=719431|Unsandhied=parāṅmukhām|UnsandhiedReconstructed=True
    3	paribhavād	paribhava	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=19335|OccId=719432|Unsandhied=paribhavāt|UnsandhiedReconstructed=True
    4	āśliṣya	āśliṣ	VERB	_	VerbForm=Conv	_	_	_	LemmaId=159990|OccId=719433|Unsandhied=āśliṣya|UnsandhiedReconstructed=True
    5	māṃ	mad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37879|OccId=719434|Unsandhied=mām|UnsandhiedReconstructed=True
    6	duḥkhitāṃ	duḥkhita	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=85180|OccId=719435|Unsandhied=duḥkhitām|UnsandhiedReconstructed=True
    7	kiṃ	ka	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=719436|Unsandhied=kim|UnsandhiedReconstructed=True
    8	labdhaṃ	labh	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158020|OccId=719437|Unsandhied=labdham|UnsandhiedReconstructed=True
    9	caṭula	caṭula	ADJ	_	Case=Voc|Gender=Masc|Number=Sing	_	_	_	LemmaId=161831|OccId=719438|Unsandhied=caṭulaiḥ|UnsandhiedReconstructed=True
    10-11	tvayeha	_	_	_	_	_	_	_	_
    10	tvayā	tvad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37880|OccId=719439|Unsandhied=tvayā|UnsandhiedReconstructed=True
    11	iha	iha	ADV	_		_	_	_	LemmaId=63959|OccId=719440|Unsandhied=iha|UnsandhiedReconstructed=True
    12	nayatā	nī	VERB	_	Case=Ins|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157259|OccId=719441|Unsandhied=nayatā|UnsandhiedReconstructed=True
    13-14	saubhāgyametāṃ	_	_	_	_	_	_	_	_
    13	saubhāgyam	saubhāgya	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=101664|OccId=719442|Unsandhied=saubhāgyam|UnsandhiedReconstructed=True
    14	etām	etad	PRON	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=163744|OccId=719443|Unsandhied=etām|UnsandhiedReconstructed=True
    15	daśām	daśā	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=146520|OccId=719444|Unsandhied=daśām|UnsandhiedReconstructed=True

    # text = paśyaitad dayitākucavyatikaronmṛṣṭāṅgarāgāruṇaṃ vakṣaste malatailapaṅkaśabalair veṇīpadairaṅkitam
    # sent_id = 101294
    # sent_counter = 14
    # sent_subcounter = 2
    1-2	paśyaitad	_	_	_	_	_	_	_	_
    1	paśya	paś	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=157390|OccId=719445|Unsandhied=paśya
    2	etat	etad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=163744|OccId=719446|Unsandhied=etat|UnsandhiedReconstructed=True
    3-8	dayitākucavyatikaronmṛṣṭāṅgarāgāruṇaṃ	_	_	_	_	_	_	_	_
    3	dayitā	dayitā	NOUN	_	Case=Cpd	_	_	_	LemmaId=146377|OccId=719486|Unsandhied=dayitā|UnsandhiedReconstructed=True
    4	kuca	kuca	NOUN	_	Case=Cpd	_	_	_	LemmaId=24030|OccId=719487|Unsandhied=kuca|UnsandhiedReconstructed=True
    5	vyatikara	vyatikara	NOUN	_	Case=Cpd	_	_	_	LemmaId=120955|OccId=719488|Unsandhied=vyatikara|UnsandhiedReconstructed=True
    6	unmṛṣṭa	unmṛś	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=160343|OccId=719489|Unsandhied=unmṛṣṭa|UnsandhiedReconstructed=True
    7	aṅgarāga	aṅgarāga	NOUN	_	Case=Cpd	_	_	_	LemmaId=6181|OccId=719490|Unsandhied=aṅgarāga|UnsandhiedReconstructed=True
    8	aruṇam	aruṇa	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=32763|OccId=719491|Unsandhied=aruṇam|UnsandhiedReconstructed=True
    9-10	vakṣaste	_	_	_	_	_	_	_	_
    9	vakṣaḥ	vakṣas	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=67745|OccId=719450|Unsandhied=vakṣaḥ|UnsandhiedReconstructed=True
    10	te	tvad	PRON	_	Case=Gen|Number=Sing	_	_	_	LemmaId=37880|OccId=719451|Unsandhied=te|UnsandhiedReconstructed=True
    11-14	malatailapaṅkaśabalair	_	_	_	_	_	_	_	_
    11	mala	mala	NOUN	_	Case=Cpd	_	_	_	LemmaId=37215|OccId=720800|Unsandhied=mala|UnsandhiedReconstructed=True
    12	taila	taila	NOUN	_	Case=Cpd	_	_	_	LemmaId=83500|OccId=720801|Unsandhied=taila|UnsandhiedReconstructed=True
    13	paṅka	paṅka	NOUN	_	Case=Cpd	_	_	_	LemmaId=14658|OccId=720802|Unsandhied=paṅka|UnsandhiedReconstructed=True
    14	śabalaiḥ	śabala	ADJ	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=116643|OccId=720803|Unsandhied=śabalaiḥ|UnsandhiedReconstructed=True
    15-17	veṇīpadairaṅkitam	_	_	_	_	_	_	_	_
    15	veṇī	veṇī	NOUN	_	Case=Cpd	_	_	_	LemmaId=142306|OccId=719476|Unsandhied=veṇī|UnsandhiedReconstructed=True
    16	padaiḥ	pada	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=15753|OccId=719477|Unsandhied=padaiḥ|UnsandhiedReconstructed=True
    17	aṅkitam	aṅkay	VERB	_	Case=Acc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157194|OccId=719478|Unsandhied=aṅkitam|UnsandhiedReconstructed=True

    # text = ekatrāsanasaṃsthitiḥ parihatā pratyudgamād dūratas tāmbūlānayanacchalena rabhasāśleṣo'pi saṃvighnitaḥ
    # sent_id = 101295
    # sent_counter = 15
    # sent_subcounter = 1
    1-3	ekatrāsanasaṃsthitiḥ	_	_	_	_	_	_	_	_
    1	ekatra	ekatra	ADV	_		_	_	_	LemmaId=39595|OccId=719452|Unsandhied=ekatra|UnsandhiedReconstructed=True
    2	āsana	āsana	NOUN	_	Case=Cpd	_	_	_	LemmaId=62866|OccId=719453|Unsandhied=āsana|UnsandhiedReconstructed=True
    3	saṃsthitiḥ	saṃsthiti	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=8444|OccId=719454|Unsandhied=saṃsthitiḥ|UnsandhiedReconstructed=True
    4	parihatā	parihan	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=162242|OccId=719479|Unsandhied=parihatā|UnsandhiedReconstructed=True
    5	pratyudgamād	pratyudgama	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=140263|OccId=720804|Unsandhied=pratyudgamāt|UnsandhiedReconstructed=True
    6	dūratas	dūratas	ADV	_		_	_	_	LemmaId=86160|OccId=719455|Unsandhied=dūratas|UnsandhiedReconstructed=True
    7-9	tāmbūlānayanacchalena	_	_	_	_	_	_	_	_
    7	tāmbūla	tāmbūla	NOUN	_	Case=Cpd	_	_	_	LemmaId=97183|OccId=719456|Unsandhied=tāmbūla|UnsandhiedReconstructed=True
    8	ānayana	ānayana	NOUN	_	Case=Cpd	_	_	_	LemmaId=58397|OccId=719457|Unsandhied=ānayana|UnsandhiedReconstructed=True
    9	chalena	chala	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=52608|OccId=719458|Unsandhied=chalena|UnsandhiedReconstructed=True
    10-12	rabhasāśleṣo'pi	_	_	_	_	_	_	_	_
    10	rabhasa	rabhasa	NOUN	_	Case=Cpd	_	_	_	LemmaId=66612|OccId=719480|Unsandhied=rabhasa|UnsandhiedReconstructed=True
    11	āśleṣaḥ	āśleṣa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=62787|OccId=719481|Unsandhied=āśleṣaḥ|UnsandhiedReconstructed=True
    12	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719482|Unsandhied=api|UnsandhiedReconstructed=True
    13	saṃvighnitaḥ	saṃvighnita	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=8029|OccId=719459|Unsandhied=saṃvighnitaḥ|UnsandhiedReconstructed=True

    # text = ālāpo'pi na miśritaḥ parijanaṃ vyāpārayantyāntike kāntaṃ pratyupacārataścaturayā kopaḥ kṛtārthīkṛtaḥ
    # sent_id = 101296
    # sent_counter = 15
    # sent_subcounter = 2
    1-2	ālāpo'pi	_	_	_	_	_	_	_	_
    1	ālāpaḥ	ālāpa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=62245|OccId=719460|Unsandhied=ālāpaḥ|UnsandhiedReconstructed=True
    2	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719461|Unsandhied=api|UnsandhiedReconstructed=True
    3	na	na	PART	_		_	_	_	LemmaId=43432|OccId=719462|Unsandhied=na|UnsandhiedReconstructed=True
    4	miśritaḥ	miśray	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=166843|OccId=719463|Unsandhied=miśritaḥ|UnsandhiedReconstructed=True
    5	parijanaṃ	parijana	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=18997|OccId=719464|Unsandhied=parijanam|UnsandhiedReconstructed=True
    6-7	vyāpārayantyāntike	_	_	_	_	_	_	_	_
    6	vyāpārayatyā	vyāpāray	VERB	_	Case=Ins|Gender=Fem|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=170759|OccId=719465|Unsandhied=vyāpārayatyā|UnsandhiedReconstructed=True
    7	antike	antika	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=11945|OccId=719466|Unsandhied=antike|UnsandhiedReconstructed=True
    8	kāntaṃ	kānta	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=13607|OccId=719467|Unsandhied=kāntam|UnsandhiedReconstructed=True
    9-10	pratyupacārataścaturayā	_	_	_	_	_	_	_	_
    9	pratyupacārāt	pratyupacāra	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=176872|OccId=719483|Unsandhied=pratyupacārāt|UnsandhiedReconstructed=True
    10	caturayā	catura	ADJ	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=164328|OccId=719484|Unsandhied=caturayā|UnsandhiedReconstructed=True
    11	kopaḥ	kopa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=4957|OccId=719468|Unsandhied=kopaḥ|UnsandhiedReconstructed=True
    12	kṛtārthīkṛtaḥ	kṛtārthīkṛ	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=176871|OccId=719485|Unsandhied=kṛtārthīkṛtaḥ|UnsandhiedReconstructed=True

    # text = dṛṣṭvaikāsanasaṃsthite priyatame paścād upetyādarād ekasyā nayane pidhāya vihitakrīḍānubandhacchalaḥ
    # sent_id = 101297
    # sent_counter = 16
    # sent_subcounter = 1
    1-4	dṛṣṭvaikāsanasaṃsthite	_	_	_	_	_	_	_	_
    1	dṛṣṭvā	dṛś	VERB	_	VerbForm=Conv	_	_	_	LemmaId=157766|OccId=719492|Unsandhied=dṛṣṭvā|UnsandhiedReconstructed=True
    2	eka	eka	NUM	_	Case=Cpd	_	_	_	LemmaId=39102|OccId=719493|Unsandhied=eka|UnsandhiedReconstructed=True
    3	āsana	āsana	NOUN	_	Case=Cpd	_	_	_	LemmaId=62866|OccId=719494|Unsandhied=āsana|UnsandhiedReconstructed=True
    4	saṃsthite	saṃsthā	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=164822|OccId=719495|Unsandhied=saṃsthite|UnsandhiedReconstructed=True
    5	priyatame	priyatama	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153203|OccId=719496|Unsandhied=priyatame|UnsandhiedReconstructed=True
    6	paścād	paścāt	ADV	_		_	_	_	LemmaId=92800|OccId=719497|Unsandhied=paścāt|UnsandhiedReconstructed=True
    7-8	upetyādarād	_	_	_	_	_	_	_	_
    7	upetya	upe	VERB	_	VerbForm=Conv	_	_	_	LemmaId=160734|OccId=719498|Unsandhied=upetya|UnsandhiedReconstructed=True
    8	ādarāt	ādara	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=58114|OccId=719499|Unsandhied=ādarāt|UnsandhiedReconstructed=True
    9	ekasyā	eka	NUM	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=39102|OccId=719500|Unsandhied=ekasyāḥ|UnsandhiedReconstructed=True
    10	nayane	nayana	NOUN	_	Case=Acc|Gender=Neut|Number=Dual	_	_	_	LemmaId=44212|OccId=719501|Unsandhied=nayane|UnsandhiedReconstructed=True
    11	pidhāya	pidhā	VERB	_	VerbForm=Conv	_	_	_	LemmaId=171016|OccId=719502|Unsandhied=pidhāya|UnsandhiedReconstructed=True
    12-15	vihitakrīḍānubandhacchalaḥ	_	_	_	_	_	_	_	_
    12	vihita	vidhā	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=163351|OccId=719503|Unsandhied=vihita|UnsandhiedReconstructed=True
    13	krīḍā	krīḍā	NOUN	_	Case=Cpd	_	_	_	LemmaId=134134|OccId=719504|Unsandhied=krīḍā|UnsandhiedReconstructed=True
    14	anubandha	anubandha	NOUN	_	Case=Cpd	_	_	_	LemmaId=11103|OccId=719505|Unsandhied=anubandha|UnsandhiedReconstructed=True
    15	chalaḥ	chala	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=52608|OccId=719506|Unsandhied=chalaḥ|UnsandhiedReconstructed=True

    # text = īṣadvakrimakaṃdharaḥ sapulakaḥ premollasanmānasām antarhāsalasatkapolaphalakāṃ dhūrto'parāṃ cumbati
    # sent_id = 101298
    # sent_counter = 16
    # sent_subcounter = 2
    1-3	īṣadvakrimakaṃdharaḥ	_	_	_	_	_	_	_	_
    1	īṣat	īṣat	ADV	_		_	_	_	LemmaId=64128|OccId=719624|Unsandhied=īṣat|UnsandhiedReconstructed=True
    2	vakrima	vakrima	ADJ	_	Case=Cpd	_	_	_	LemmaId=67706|OccId=719625|Unsandhied=vakrima|UnsandhiedReconstructed=True
    3	kaṃdharaḥ	kaṃdhara	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=1703|OccId=719626|Unsandhied=kaṃdharaḥ|UnsandhiedReconstructed=True
    4	sapulakaḥ	sapulaka	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=17967|OccId=719507|Unsandhied=sapulakaḥ|UnsandhiedReconstructed=True
    5-7	premollasanmānasām	_	_	_	_	_	_	_	_
    5	prema	preman	NOUN	_	Case=Cpd	_	_	_	LemmaId=153287|OccId=719627|Unsandhied=prema|UnsandhiedReconstructed=True
    6	ullasat	ullas	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=160764|OccId=719628|Unsandhied=ullasat|UnsandhiedReconstructed=True
    7	mānasām	mānasa	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=78988|OccId=719629|Unsandhied=mānasām|UnsandhiedReconstructed=True
    8-11	antarhāsalasatkapolaphalakāṃ	_	_	_	_	_	_	_	_
    8	antarhāsa	antarhāsa	NOUN	_	Case=Cpd	_	_	_	LemmaId=11863|OccId=719630|Unsandhied=antarhāsa|UnsandhiedReconstructed=True
    9	lasat	las	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=159903|OccId=719631|Unsandhied=lasat|UnsandhiedReconstructed=True
    10	kapola	kapola	NOUN	_	Case=Cpd	_	_	_	LemmaId=1974|OccId=719632|Unsandhied=kapola|UnsandhiedReconstructed=True
    11	phalakām	phalaka	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=154103|OccId=719633|Unsandhied=phalakām|UnsandhiedReconstructed=True
    12-13	dhūrto'parāṃ	_	_	_	_	_	_	_	_
    12	dhūrtaḥ	dhūrta	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=42948|OccId=719508|Unsandhied=dhūrtaḥ|UnsandhiedReconstructed=True|WordSem=45002
    13	aparām	apara	PRON	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=166280|OccId=719509|Unsandhied=aparām|UnsandhiedReconstructed=True
    14	cumbati	cumb	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=156259|OccId=719510|Unsandhied=cumbati

    # text = caraṇapatanapratyākhyānātprasādaparāṅmukhe nibhṛtakitavācāretyuktvā ruṣā paruṣīkṛte
    # sent_id = 101299
    # sent_counter = 17
    # sent_subcounter = 1
    1-5	caraṇapatanapratyākhyānātprasādaparāṅmukhe	_	_	_	_	_	_	_	_
    1	caraṇa	caraṇa	NOUN	_	Case=Cpd	_	_	_	LemmaId=164451|OccId=719511|Unsandhied=caraṇa|UnsandhiedReconstructed=True
    2	patana	patana	NOUN	_	Case=Cpd	_	_	_	LemmaId=15500|OccId=719512|Unsandhied=patana|UnsandhiedReconstructed=True
    3	pratyākhyānāt	pratyākhyāna	NOUN	_	Case=Abl|Gender=Neut|Number=Sing	_	_	_	LemmaId=140420|OccId=719513|Unsandhied=pratyākhyānāt|UnsandhiedReconstructed=True
    4	prasāda	prasāda	NOUN	_	Case=Cpd	_	_	_	LemmaId=155687|OccId=719514|Unsandhied=prasāda|UnsandhiedReconstructed=True
    5	parāṅmukhe	parāṅmukha	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=18716|OccId=719515|Unsandhied=parāṅmukhe|UnsandhiedReconstructed=True
    6-10	nibhṛtakitavācāretyuktvā	_	_	_	_	_	_	_	_
    6	nibhṛta	nibhṛta	ADJ	_	Case=Cpd	_	_	_	LemmaId=35282|OccId=719516|Unsandhied=nibhṛta|UnsandhiedReconstructed=True
    7	kitava	kitava	NOUN	_	Case=Cpd	_	_	_	LemmaId=23311|OccId=719517|Unsandhied=kitava|UnsandhiedReconstructed=True
    8	ācārā	ācāra	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=57409|OccId=719518|Unsandhied=ācārā|UnsandhiedReconstructed=True
    9	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719519|Unsandhied=iti|UnsandhiedReconstructed=True
    10	uktvā	vac	VERB	_	VerbForm=Conv	_	_	_	LemmaId=157264|OccId=719520|Unsandhied=uktvā|UnsandhiedReconstructed=True
    11	ruṣā	ruṣ	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=171261|OccId=719521|Unsandhied=ruṣā|UnsandhiedReconstructed=True
    12	paruṣīkṛte	paruṣīkṛ	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=212414|OccId=3061430|Unsandhied=paruṣīkṛte|UnsandhiedReconstructed=True

    # text = vrajati ramaṇe niḥśvasyoccaiḥ stanasthitahastayā nayanasalilacchannā dṛṣṭiḥ sakhīṣu niveśitā
    # sent_id = 101300
    # sent_counter = 17
    # sent_subcounter = 2
    1	vrajati	vraj	VERB	_	Case=Loc|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157500|OccId=719522|Unsandhied=vrajati|UnsandhiedReconstructed=True
    2	ramaṇe	ramaṇa	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=66750|OccId=719523|Unsandhied=ramaṇe|UnsandhiedReconstructed=True
    3-4	niḥśvasyoccaiḥ	_	_	_	_	_	_	_	_
    3	niḥśvasya	niḥśvas	VERB	_	VerbForm=Conv	_	_	_	LemmaId=161232|OccId=719524|Unsandhied=niḥśvasya|UnsandhiedReconstructed=True
    4	uccais	uccais	ADV	_		_	_	_	LemmaId=64367|OccId=719525|Unsandhied=uccais|UnsandhiedReconstructed=True
    5-7	stanasthitahastayā	_	_	_	_	_	_	_	_
    5	stana	stana	NOUN	_	Case=Cpd	_	_	_	LemmaId=102167|OccId=719526|Unsandhied=stana|UnsandhiedReconstructed=True
    6	sthita	sthā	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157340|OccId=719527|Unsandhied=sthita|UnsandhiedReconstructed=True
    7	hastayā	hasta	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=166517|OccId=719528|Unsandhied=hastayā|UnsandhiedReconstructed=True
    8-10	nayanasalilacchannā	_	_	_	_	_	_	_	_
    8	nayana	nayana	NOUN	_	Case=Cpd	_	_	_	LemmaId=44212|OccId=719529|Unsandhied=nayana|UnsandhiedReconstructed=True
    9	salila	salila	NOUN	_	Case=Cpd	_	_	_	LemmaId=105191|OccId=719530|Unsandhied=salila|UnsandhiedReconstructed=True
    10	channā	chad	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156263|OccId=719531|Unsandhied=channā|UnsandhiedReconstructed=True
    11	dṛṣṭiḥ	dṛṣṭi	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=86502|OccId=719532|Unsandhied=dṛṣṭiḥ|UnsandhiedReconstructed=True
    12	sakhīṣu	sakhī	NOUN	_	Case=Loc|Gender=Fem|Number=Plur	_	_	_	LemmaId=9140|OccId=719533|Unsandhied=sakhīṣu|UnsandhiedReconstructed=True
    13	niveśitā	niveśay	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161476|OccId=719534|Unsandhied=niveśitā|UnsandhiedReconstructed=True

    # text = kāñcyā gāḍhatarāvaruddhavasanaprāntā kimarthaṃ punar mugdhākṣī svapitīti tatparijanaṃ svairaṃ priye pṛcchati
    # sent_id = 101301
    # sent_counter = 18
    # sent_subcounter = 1
    1	kāñcyā	kāñcī	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=13406|OccId=719535|Unsandhied=kāñcyā|UnsandhiedReconstructed=True
    2-5	gāḍhatarāvaruddhavasanaprāntā	_	_	_	_	_	_	_	_
    2	gāḍhatara	gāḍhatara	ADJ	_	Case=Cpd	_	_	_	LemmaId=202393|OccId=5516921|Unsandhied=gāḍhatara
    3	avaruddha	avarudh	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=159612|OccId=5516922|Unsandhied=avaruddha
    4	vasana	vasana	NOUN	_	Case=Cpd	_	_	_	LemmaId=75475|OccId=5516923|Unsandhied=vasana
    5	prāntā	prānta	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=153083|OccId=5516924|Unsandhied=prāntā
    6	kimarthaṃ	kimartha	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=23393|OccId=719540|Unsandhied=kimartham|UnsandhiedReconstructed=True
    7	punar	punar	ADV	_		_	_	_	LemmaId=143659|OccId=719541|Unsandhied=punar|UnsandhiedReconstructed=True
    8	mugdhākṣī	mugdhākṣī	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=136345|OccId=719542|Unsandhied=mugdhākṣī|UnsandhiedReconstructed=True
    9-10	svapitīti	_	_	_	_	_	_	_	_
    9	svapiti	svap	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=160029|OccId=719634|Unsandhied=svapiti
    10	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719635|Unsandhied=iti|UnsandhiedReconstructed=True
    11-12	tatparijanaṃ	_	_	_	_	_	_	_	_
    11	tat	tad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=719543|Unsandhied=tat|UnsandhiedReconstructed=True
    12	parijanam	parijana	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=18997|OccId=719544|Unsandhied=parijanam|UnsandhiedReconstructed=True
    13	svairaṃ	svaira	ADJ	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=120809|OccId=719545|Unsandhied=svairam|UnsandhiedReconstructed=True
    14	priye	priya	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153185|OccId=719546|Unsandhied=priye|UnsandhiedReconstructed=True
    15	pṛcchati	pracch	VERB	_	Case=Loc|Gender=Masc|Number=Sing|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157397|OccId=719547|Unsandhied=pṛcchati|UnsandhiedReconstructed=True

    # text = mātaḥ svaptumapīha vārayati māmityāhitakrodhayā paryasya svapiticchalena śayane datto'vakāśastayā
    # sent_id = 101302
    # sent_counter = 18
    # sent_subcounter = 2
    1	mātaḥ	mātṛ	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=78551|OccId=719548|Unsandhied=mātar|UnsandhiedReconstructed=True
    2-4	svaptumapīha	_	_	_	_	_	_	_	_
    2	svaptum	svap	VERB	_	VerbForm=Inf	_	_	_	LemmaId=160029|OccId=719549|Unsandhied=svaptum|UnsandhiedReconstructed=True
    3	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719550|Unsandhied=api|UnsandhiedReconstructed=True
    4	iha	iha	ADV	_		_	_	_	LemmaId=63959|OccId=719551|Unsandhied=iha|UnsandhiedReconstructed=True
    5	vārayati	vāray	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=158095|OccId=719552|Unsandhied=vārayati
    6-9	māmityāhitakrodhayā	_	_	_	_	_	_	_	_
    6	mām	mad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37879|OccId=719553|Unsandhied=mām|UnsandhiedReconstructed=True
    7	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719554|Unsandhied=iti|UnsandhiedReconstructed=True
    8	āhita	ādhā	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=159787|OccId=719555|Unsandhied=āhita|UnsandhiedReconstructed=True
    9	krodhayā	krodha	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=134152|OccId=719556|Unsandhied=krodhayā|UnsandhiedReconstructed=True
    10	paryasya	paryas	VERB	_	VerbForm=Conv	_	_	_	LemmaId=162272|OccId=719557|Unsandhied=paryasya|UnsandhiedReconstructed=True
    11-12	svapiticchalena	_	_	_	_	_	_	_	_
    11	svapiti	svap	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=160029|OccId=719558|Unsandhied=svapiti
    12	chalena	chala	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=52608|OccId=719559|Unsandhied=chalena|UnsandhiedReconstructed=True
    13	śayane	śayana	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=116774|OccId=719560|Unsandhied=śayane|UnsandhiedReconstructed=True
    14-16	datto'vakāśastayā	_	_	_	_	_	_	_	_
    14	dattaḥ	dā	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157372|OccId=719561|Unsandhied=dattaḥ|UnsandhiedReconstructed=True
    15	avakāśaḥ	avakāśa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=53938|OccId=719562|Unsandhied=avakāśaḥ|UnsandhiedReconstructed=True
    16	tayā	tad	PRON	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=719563|Unsandhied=tayā|UnsandhiedReconstructed=True

    # text = ekasmiñśayane parāṅmukhatayā vītottaraṃ tāmyator anyonyasya hṛdi sthite'pyanunaye saṃrakṣatorgauravam
    # sent_id = 101303
    # sent_counter = 19
    # sent_subcounter = 1
    1-2	ekasmiñśayane	_	_	_	_	_	_	_	_
    1	ekasmin	eka	NUM	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=39102|OccId=719564|Unsandhied=ekasmin|UnsandhiedReconstructed=True
    2	śayane	śayana	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=116774|OccId=719565|Unsandhied=śayane|UnsandhiedReconstructed=True
    3	parāṅmukhatayā	parāṅmukhatā	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=169952|OccId=719566|Unsandhied=parāṅmukhatayā|UnsandhiedReconstructed=True
    4	vītottaraṃ	vītottara	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=141229|OccId=719567|Unsandhied=vītottaram|UnsandhiedReconstructed=True
    5	tāmyator	tam	VERB	_	Case=Gen|Gender=Masc|Number=Dual|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=157175|OccId=719568|Unsandhied=tāmyatoḥ|UnsandhiedReconstructed=True
    6	anyonyasya	anyonya	PRON	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=20534|OccId=719569|Unsandhied=anyonyasya|UnsandhiedReconstructed=True
    7	hṛdi	hṛd	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=110524|OccId=719570|Unsandhied=hṛdi|UnsandhiedReconstructed=True
    8-10	sthite'pyanunaye	_	_	_	_	_	_	_	_
    8	sthite	sthā	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157340|OccId=719571|Unsandhied=sthite|UnsandhiedReconstructed=True
    9	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719572|Unsandhied=api|UnsandhiedReconstructed=True
    10	anunaye	anunaya	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=10941|OccId=719573|Unsandhied=anunaye|UnsandhiedReconstructed=True
    11-12	saṃrakṣatorgauravam	_	_	_	_	_	_	_	_
    11	saṃrakṣatoḥ	saṃrakṣ	VERB	_	Case=Gen|Gender=Masc|Number=Dual|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=164697|OccId=719574|Unsandhied=saṃrakṣatoḥ|UnsandhiedReconstructed=True
    12	gauravam	gaurava	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=125541|OccId=719575|Unsandhied=gauravam|UnsandhiedReconstructed=True

    # text = dampatyoḥ śanakairapāṅgavalanān miśrībhavaccakṣuṣor bhagno mānakaliḥ sahāsarabhasaṃ vyāsaktakaṇṭhagraham
    # sent_id = 101304
    # sent_counter = 19
    # sent_subcounter = 2
    1	dampatyoḥ	dampati	NOUN	_	Case=Gen|Gender=Masc|Number=Dual	_	_	_	LemmaId=101163|OccId=719576|Unsandhied=dampatiyoḥ|UnsandhiedReconstructed=True
    2-4	śanakairapāṅgavalanān	_	_	_	_	_	_	_	_
    2	śanakais	śanakais	ADV	_		_	_	_	LemmaId=115561|OccId=719577|Unsandhied=śanakais|UnsandhiedReconstructed=True
    3	apāṅga	apāṅga	NOUN	_	Case=Cpd	_	_	_	LemmaId=21269|OccId=719578|Unsandhied=apāṅga|UnsandhiedReconstructed=True
    4	valanāt	valana	NOUN	_	Case=Abl|Gender=Neut|Number=Sing	_	_	_	LemmaId=74930|OccId=719579|Unsandhied=valanāt|UnsandhiedReconstructed=True
    5-6	miśrībhavaccakṣuṣor	_	_	_	_	_	_	_	_
    5	miśrībhavat	miśrībhū	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=176747|OccId=719580|Unsandhied=miśrībhavat|UnsandhiedReconstructed=True
    6	_	cakṣus	NOUN	_	Case=Gen|Gender=Masc|Number=Dual	_	_	_	LemmaId=161797|OccId=719581|Unsandhied=_
    7	bhagno	bhañj	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158867|OccId=719582|Unsandhied=bhagnaḥ|UnsandhiedReconstructed=True
    8	mānakaliḥ	mānakali	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=78844|OccId=719583|Unsandhied=mānakaliḥ|UnsandhiedReconstructed=True
    9-11	sahāsarabhasaṃ	_	_	_	_	_	_	_	_
    9	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=2584303|Unsandhied=sa|UnsandhiedReconstructed=True
    10	hāsa	hāsa	NOUN	_	Case=Cpd	_	_	_	LemmaId=109460|OccId=2584304|Unsandhied=hāsa|UnsandhiedReconstructed=True
    11	rabhasam	rabhasa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=66612|OccId=2584305|Unsandhied=rabhasam|UnsandhiedReconstructed=True
    12-14	vyāsaktakaṇṭhagraham	_	_	_	_	_	_	_	_
    12	vyāsakta	vyāsañj	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=164651|OccId=719586|Unsandhied=vyāsakta|UnsandhiedReconstructed=True
    13	kaṇṭha	kaṇṭha	NOUN	_	Case=Cpd	_	_	_	LemmaId=1051|OccId=719587|Unsandhied=kaṇṭha|UnsandhiedReconstructed=True
    14	graham	graha	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=125579|OccId=719588|Unsandhied=graham|UnsandhiedReconstructed=True

    # text = paśyāmo mayi kiṃ prapadyata iti sthairyaṃ mayālambitaṃ kiṃ māmālapatītyayaṃ khalu śaṭhaḥ kopastayāpyāśritaḥ
    # sent_id = 101305
    # sent_counter = 20
    # sent_subcounter = 1
    1	paśyāmo	paś	VERB	_	Tense=Pres|Mood=Ind|Person=1|Number=Plur	_	_	_	LemmaId=157390|OccId=4984932|Unsandhied=paśyāmaḥ
    2	mayi	mad	PRON	_	Case=Loc|Number=Sing	_	_	_	LemmaId=37879|OccId=719590|Unsandhied=mayi|UnsandhiedReconstructed=True
    3	kiṃ	ka	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=719591|Unsandhied=kim|UnsandhiedReconstructed=True
    4	prapadyata	prapad	VERB	_	Tense=Pres|Mood=Ind|Voice=Pass|Person=3|Number=Sing	_	_	_	LemmaId=162912|OccId=719592|Unsandhied=prapadyate
    5	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719593|Unsandhied=iti|UnsandhiedReconstructed=True
    6	sthairyaṃ	sthairya	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=103104|OccId=719594|Unsandhied=sthairyam|UnsandhiedReconstructed=True
    7-8	mayālambitaṃ	_	_	_	_	_	_	_	_
    7	mayā	mad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37879|OccId=719595|Unsandhied=mayā|UnsandhiedReconstructed=True
    8	ālambitam	ālamb	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159909|OccId=719596|Unsandhied=ālambitam|UnsandhiedReconstructed=True
    9	kiṃ	ka	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=719597|Unsandhied=kim|UnsandhiedReconstructed=True
    10-13	māmālapatītyayaṃ	_	_	_	_	_	_	_	_
    10	mām	mad	PRON	_	Case=Acc|Number=Sing	_	_	_	LemmaId=37879|OccId=719598|Unsandhied=mām|UnsandhiedReconstructed=True
    11	ālapati	ālap	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=159906|OccId=719599|Unsandhied=ālapati
    12	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719600|Unsandhied=iti|UnsandhiedReconstructed=True
    13	ayam	idam	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37876|OccId=719601|Unsandhied=ayam|UnsandhiedReconstructed=True
    14	khalu	khalu	PART	_		_	_	_	LemmaId=128848|OccId=720806|Unsandhied=khalu|UnsandhiedReconstructed=True
    15	śaṭhaḥ	śaṭha	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=116413|OccId=719602|Unsandhied=śaṭhaḥ|UnsandhiedReconstructed=True
    16-19	kopastayāpyāśritaḥ	_	_	_	_	_	_	_	_
    16	kopaḥ	kopa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=4957|OccId=719603|Unsandhied=kopaḥ|UnsandhiedReconstructed=True
    17	tayā	tad	PRON	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=719604|Unsandhied=tayā|UnsandhiedReconstructed=True
    18	api	api	PART	_		_	_	_	LemmaId=21365|OccId=719605|Unsandhied=api|UnsandhiedReconstructed=True
    19	āśritaḥ	āśri	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159985|OccId=719606|Unsandhied=āśritaḥ|UnsandhiedReconstructed=True

    # text = ityanyonyavilakṣadṛṣṭicature tasminnavasthāntare savyājaṃ hasitaṃ mayā dhṛtiharo bāṣpastu muktastayā
    # sent_id = 101306
    # sent_counter = 20
    # sent_subcounter = 2
    1-5	ityanyonyavilakṣadṛṣṭicature	_	_	_	_	_	_	_	_
    1	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=719607|Unsandhied=iti|UnsandhiedReconstructed=True
    2	anyonya	anyonya	PRON	_	Case=Cpd	_	_	_	LemmaId=20534|OccId=719608|Unsandhied=anyonya|UnsandhiedReconstructed=True
    3	vilakṣa	vilakṣa	ADJ	_	Case=Cpd	_	_	_	LemmaId=47567|OccId=719609|Unsandhied=vilakṣa|UnsandhiedReconstructed=True
    4	dṛṣṭi	dṛṣṭi	NOUN	_	Case=Cpd	_	_	_	LemmaId=86502|OccId=719610|Unsandhied=dṛṣṭi|UnsandhiedReconstructed=True
    5	cature	catura	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=164328|OccId=719611|Unsandhied=cature|UnsandhiedReconstructed=True
    6-8	tasminnavasthāntare	_	_	_	_	_	_	_	_
    6	tasmin	tad	PRON	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=719612|Unsandhied=tasmin|UnsandhiedReconstructed=True
    7	avasthā	avasthā	NOUN	_	Case=Cpd	_	_	_	LemmaId=54714|OccId=719613|Unsandhied=avasthā|UnsandhiedReconstructed=True
    8	antare	antara	ADJ	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=11865|OccId=719614|Unsandhied=antare|UnsandhiedReconstructed=True
    9-10	savyājaṃ	_	_	_	_	_	_	_	_
    9	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=2708271|Unsandhied=sa|UnsandhiedReconstructed=True
    10	vyājam	vyāja	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=121098|OccId=2708272|Unsandhied=vyājam|UnsandhiedReconstructed=True
    11	hasitaṃ	has	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158488|OccId=719616|Unsandhied=hasitam|UnsandhiedReconstructed=True
    12	mayā	mad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37879|OccId=719617|Unsandhied=mayā|UnsandhiedReconstructed=True
    13-14	dhṛtiharo	_	_	_	_	_	_	_	_
    13	dhṛti	dhṛti	NOUN	_	Case=Cpd	_	_	_	LemmaId=43018|OccId=719618|Unsandhied=dhṛti|UnsandhiedReconstructed=True
    14	haraḥ	hara	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=108598|OccId=719619|Unsandhied=haraḥ|UnsandhiedReconstructed=True
    15-16	bāṣpastu	_	_	_	_	_	_	_	_
    15	bāṣpaḥ	bāṣpa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=148844|OccId=719620|Unsandhied=bāṣpaḥ|UnsandhiedReconstructed=True
    16	tu	tu	PART	_		_	_	_	LemmaId=82701|OccId=719621|Unsandhied=tu|UnsandhiedReconstructed=True
    17-18	muktastayā	_	_	_	_	_	_	_	_
    17	muktaḥ	muc	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157281|OccId=719622|Unsandhied=muktaḥ|UnsandhiedReconstructed=True
    18	tayā	tad	PRON	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=719623|Unsandhied=tayā|UnsandhiedReconstructed=True

    # text = parimlāne māne mukhaśaśini tasyāḥ karadhṛte mayi kṣīṇopāye praṇipatanamātraikaśaraṇe
    # sent_id = 101307
    # sent_counter = 21
    # sent_subcounter = 1
    1	parimlāne	parimlā	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=162123|OccId=720807|Unsandhied=parimlāne|UnsandhiedReconstructed=True
    2	māne	māna	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=78842|OccId=720808|Unsandhied=māne|UnsandhiedReconstructed=True
    3-4	mukhaśaśini	_	_	_	_	_	_	_	_
    3	mukha	mukha	NOUN	_	Case=Cpd	_	_	_	LemmaId=136827|OccId=720809|Unsandhied=mukha|UnsandhiedReconstructed=True
    4	śaśini	śaśin	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=131105|OccId=720810|Unsandhied=śaśini|UnsandhiedReconstructed=True
    5	tasyāḥ	tad	PRON	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=720811|Unsandhied=tasyāḥ|UnsandhiedReconstructed=True
    6-7	karadhṛte	_	_	_	_	_	_	_	_
    6	kara	kara	NOUN	_	Case=Cpd	_	_	_	LemmaId=2230|OccId=720812|Unsandhied=kara|UnsandhiedReconstructed=True
    7	dhṛte	dhṛ	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157616|OccId=720813|Unsandhied=dhṛte|UnsandhiedReconstructed=True
    8	mayi	mad	PRON	_	Case=Loc|Number=Sing	_	_	_	LemmaId=37879|OccId=720814|Unsandhied=mayi|UnsandhiedReconstructed=True
    9-10	kṣīṇopāye	_	_	_	_	_	_	_	_
    9	kṣīṇā	kṣi	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156197|OccId=720815|Unsandhied=kṣīṇā|UnsandhiedReconstructed=True
    10	upāye	upāya	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=46119|OccId=720816|Unsandhied=upāye|UnsandhiedReconstructed=True
    11-14	praṇipatanamātraikaśaraṇe	_	_	_	_	_	_	_	_
    11	praṇipatana	praṇipatana	NOUN	_	Case=Cpd	_	_	_	LemmaId=150883|OccId=720817|Unsandhied=praṇipatana|UnsandhiedReconstructed=True
    12	mātra	mātra	NOUN	_	Case=Cpd	_	_	_	LemmaId=78185|OccId=720818|Unsandhied=mātra|UnsandhiedReconstructed=True
    13	eka	eka	NUM	_	Case=Cpd	_	_	_	LemmaId=39102|OccId=720819|Unsandhied=eka|UnsandhiedReconstructed=True
    14	śaraṇe	śaraṇa	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=116840|OccId=720820|Unsandhied=śaraṇe|UnsandhiedReconstructed=True

    # text = tayā pakṣmaprāntavrajapuṭaniruddhena sahasā prasādo bāṣpena stanataṭaviśīrṇena kathitaḥ
    # sent_id = 101308
    # sent_counter = 21
    # sent_subcounter = 2
    1	tayā	tad	PRON	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=720821|Unsandhied=tayā|UnsandhiedReconstructed=True
    2-6	pakṣmaprāntavrajapuṭaniruddhena	_	_	_	_	_	_	_	_
    2	pakṣma	pakṣman	NOUN	_	Case=Cpd	_	_	_	LemmaId=14650|OccId=720822|Unsandhied=pakṣma|UnsandhiedReconstructed=True
    3	prānta	prānta	NOUN	_	Case=Cpd	_	_	_	LemmaId=153083|OccId=720823|Unsandhied=prānta|UnsandhiedReconstructed=True
    4	vraja	vraja	NOUN	_	Case=Cpd	_	_	_	LemmaId=115333|OccId=720824|Unsandhied=vraja|UnsandhiedReconstructed=True
    5	puṭa	puṭa	NOUN	_	Case=Cpd	_	_	_	LemmaId=144408|OccId=720825|Unsandhied=puṭa|UnsandhiedReconstructed=True
    6	niruddhena	nirudh	VERB	_	Case=Ins|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161367|OccId=720826|Unsandhied=niruddhena|UnsandhiedReconstructed=True
    7	sahasā	sahas	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=105710|OccId=720827|Unsandhied=sahasā|UnsandhiedReconstructed=True
    8	prasādo	prasāda	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=155687|OccId=720828|Unsandhied=prasādaḥ|UnsandhiedReconstructed=True
    9	bāṣpena	bāṣpa	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=148844|OccId=720829|Unsandhied=bāṣpeṇa|UnsandhiedReconstructed=True
    10-12	stanataṭaviśīrṇena	_	_	_	_	_	_	_	_
    10	stana	stana	NOUN	_	Case=Cpd	_	_	_	LemmaId=102167|OccId=720830|Unsandhied=stana|UnsandhiedReconstructed=True
    11	taṭa	taṭa	NOUN	_	Case=Cpd	_	_	_	LemmaId=95852|OccId=720831|Unsandhied=taṭa|UnsandhiedReconstructed=True
    12	viśīrṇena	viśṛ	VERB	_	Case=Ins|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=163619|OccId=720832|Unsandhied=viśīrṇena|UnsandhiedReconstructed=True
    13	kathitaḥ	kath	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156153|OccId=720833|Unsandhied=kathitaḥ|UnsandhiedReconstructed=True

    # text = tasyāḥ sāndravilepanastanataṭapraśleṣamudrāṅkitaṃ kiṃ vakṣaścaraṇānativyatikaravyājena gopāyate
    # sent_id = 101309
    # sent_counter = 22
    # sent_subcounter = 1
    1	tasyāḥ	tad	PRON	_	Case=Gen|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=720834|Unsandhied=tasyāḥ|UnsandhiedReconstructed=True
    2-8	sāndravilepanastanataṭapraśleṣamudrāṅkitaṃ	_	_	_	_	_	_	_	_
    2	sāndra	sāndra	ADJ	_	Case=Cpd	_	_	_	LemmaId=112411|OccId=720835|Unsandhied=sāndra|UnsandhiedReconstructed=True
    3	vilepana	vilepana	NOUN	_	Case=Cpd	_	_	_	LemmaId=138285|OccId=720836|Unsandhied=vilepana|UnsandhiedReconstructed=True
    4	stana	stana	NOUN	_	Case=Cpd	_	_	_	LemmaId=102167|OccId=720837|Unsandhied=stana|UnsandhiedReconstructed=True
    5	taṭa	taṭa	NOUN	_	Case=Cpd	_	_	_	LemmaId=95852|OccId=720838|Unsandhied=taṭa|UnsandhiedReconstructed=True
    6	praśleṣa	praśleṣa	NOUN	_	Case=Cpd	_	_	_	LemmaId=154960|OccId=720839|Unsandhied=praśleṣa|UnsandhiedReconstructed=True
    7	mudrā	mudrā	NOUN	_	Case=Cpd	_	_	_	LemmaId=136131|OccId=720840|Unsandhied=mudrā|UnsandhiedReconstructed=True
    8	aṅkitam	aṅkay	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157194|OccId=720841|Unsandhied=aṅkitam|UnsandhiedReconstructed=True
    9	kiṃ	ka	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37878|OccId=720842|Unsandhied=kim|UnsandhiedReconstructed=True
    10-13	vakṣaścaraṇānativyatikaravyājena	_	_	_	_	_	_	_	_
    10	vakṣaḥ	vakṣas	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=67745|OccId=720843|Unsandhied=vakṣaḥ|UnsandhiedReconstructed=True
    11	caraṇānati	caraṇānati	NOUN	_	Case=Cpd	_	_	_	LemmaId=164097|OccId=720844|Unsandhied=caraṇānati|UnsandhiedReconstructed=True
    12	vyatikara	vyatikara	NOUN	_	Case=Cpd	_	_	_	LemmaId=120955|OccId=720845|Unsandhied=vyatikara|UnsandhiedReconstructed=True
    13	vyājena	vyāja	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=121098|OccId=720846|Unsandhied=vyājena|UnsandhiedReconstructed=True
    14	gopāyate	gopāy	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=160801|OccId=720917|Unsandhied=gopāyate

    # text = ityukte kva tad ityudīrya sahasā tatsampramārṣṭuṃ mayā sāśliṣṭā rabhasena tatsukhavaśāttanvyāpi tad vismṛtam
    # sent_id = 101310
    # sent_counter = 22
    # sent_subcounter = 2
    1-2	ityukte	_	_	_	_	_	_	_	_
    1	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=720847|Unsandhied=iti|UnsandhiedReconstructed=True
    2	ukte	vac	VERB	_	Case=Loc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157264|OccId=720848|Unsandhied=ukte|UnsandhiedReconstructed=True
    3	kva	kva	ADV	_		_	_	_	LemmaId=134289|OccId=720849|Unsandhied=kva|UnsandhiedReconstructed=True
    4	tad	tad	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=720850|Unsandhied=tat|UnsandhiedReconstructed=True
    5-6	ityudīrya	_	_	_	_	_	_	_	_
    5	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=720851|Unsandhied=iti|UnsandhiedReconstructed=True
    6	udīrya	udīray	VERB	_	VerbForm=Conv	_	_	_	LemmaId=160199|OccId=720852|Unsandhied=udīrya|UnsandhiedReconstructed=True
    7	sahasā	sahas	NOUN	_	Case=Ins|Gender=Neut|Number=Sing	_	_	_	LemmaId=105710|OccId=720853|Unsandhied=sahasā|UnsandhiedReconstructed=True
    8-9	tatsampramārṣṭuṃ	_	_	_	_	_	_	_	_
    8	tat	tad	PRON	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=720918|Unsandhied=tat|UnsandhiedReconstructed=True
    9	sampramārṣṭum	sampramṛj	VERB	_	VerbForm=Inf	_	_	_	LemmaId=176878|OccId=720919|Unsandhied=sampramārṣṭum|UnsandhiedReconstructed=True
    10	mayā	mad	PRON	_	Case=Ins|Number=Sing	_	_	_	LemmaId=37879|OccId=720854|Unsandhied=mayā|UnsandhiedReconstructed=True
    11-12	sāśliṣṭā	_	_	_	_	_	_	_	_
    11	sā	tad	PRON	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=720855|Unsandhied=sā|UnsandhiedReconstructed=True
    12	āśliṣṭā	āśliṣ	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159990|OccId=720856|Unsandhied=āśliṣṭā|UnsandhiedReconstructed=True
    13	rabhasena	rabhasa	NOUN	_	Case=Ins|Gender=Masc|Number=Sing	_	_	_	LemmaId=66612|OccId=720857|Unsandhied=rabhasena|UnsandhiedReconstructed=True
    14-18	tatsukhavaśāttanvyāpi	_	_	_	_	_	_	_	_
    14	tad	tad	PRON	_	Case=Cpd	_	_	_	LemmaId=37875|OccId=720858|Unsandhied=tad|UnsandhiedReconstructed=True
    15	sukha	sukha	NOUN	_	Case=Cpd	_	_	_	LemmaId=106817|OccId=720859|Unsandhied=sukha|UnsandhiedReconstructed=True
    16	vaśāt	vaśa	NOUN	_	Case=Abl|Gender=Masc|Number=Sing	_	_	_	LemmaId=75122|OccId=720860|Unsandhied=vaśāt|UnsandhiedReconstructed=True
    17	tanvyā	tanvī	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=96159|OccId=720861|Unsandhied=tanvyā|UnsandhiedReconstructed=True
    18	api	api	PART	_		_	_	_	LemmaId=21365|OccId=720862|Unsandhied=api|UnsandhiedReconstructed=True
    19	tad	tad	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37875|OccId=720863|Unsandhied=tat|UnsandhiedReconstructed=True
    20	vismṛtam	vismṛ	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=164487|OccId=720864|Unsandhied=vismṛtam|UnsandhiedReconstructed=True

    # text = tvaṃ mugdhākṣi vinaiva kañculikayā dhatse manohāriṇīṃ lakṣmīmityabhidhāyini priyatame tadvīṭikāṃ saṃspṛśi
    # sent_id = 101311
    # sent_counter = 23
    # sent_subcounter = 1
    1	tvaṃ	tvad	PRON	_	Case=Nom|Number=Sing	_	_	_	LemmaId=37880|OccId=720865|Unsandhied=tvam|UnsandhiedReconstructed=True
    2	mugdhākṣi	mugdhākṣī	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=136345|OccId=720866|Unsandhied=mugdhākṣi|UnsandhiedReconstructed=True
    3-4	vinaiva	_	_	_	_	_	_	_	_
    3	vinā	vinā	ADV	_		_	_	_	LemmaId=121616|OccId=720867|Unsandhied=vinā|UnsandhiedReconstructed=True
    4	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=720868|Unsandhied=eva|UnsandhiedReconstructed=True
    5	kañculikayā	kañculikā	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=694|OccId=720869|Unsandhied=kañculikayā|UnsandhiedReconstructed=True
    6	dhatse	dhā	VERB	_	Tense=Pres|Mood=Ind|Person=2|Number=Sing	_	_	_	LemmaId=157327|OccId=720870|Unsandhied=dhatse
    7	manohāriṇīṃ	manohārin	ADJ	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=169443|OccId=720871|Unsandhied=manohāriṇīm|UnsandhiedReconstructed=True
    8-10	lakṣmīmityabhidhāyini	_	_	_	_	_	_	_	_
    8	lakṣmīm	lakṣmī	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=80344|OccId=720872|Unsandhied=lakṣmīm|UnsandhiedReconstructed=True
    9	iti	iti	PART	_		_	_	_	LemmaId=63331|OccId=720873|Unsandhied=iti|UnsandhiedReconstructed=True
    10	abhidhāyini	abhidhāyin	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=169812|OccId=720874|Unsandhied=abhidhāyini|UnsandhiedReconstructed=True
    11	priyatame	priyatama	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153203|OccId=720875|Unsandhied=priyatame|UnsandhiedReconstructed=True
    12-13	tadvīṭikāṃ	_	_	_	_	_	_	_	_
    12	tad	tad	PRON	_	Case=Cpd	_	_	_	LemmaId=37875|OccId=720876|Unsandhied=tad|UnsandhiedReconstructed=True
    13	vīṭikām	vīṭikā	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=141513|OccId=720877|Unsandhied=vīṭikām|UnsandhiedReconstructed=True
    14	saṃspṛśi	saṃspṛś	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=8455|OccId=720878|Unsandhied=_

    # text = śayyopāntaniviṣṭasasmitamukhīnetrotsavānandito niryātaḥ śanakairalīkavacanopanyāsam ālījanaḥ
    # sent_id = 101312
    # sent_counter = 23
    # sent_subcounter = 2
    1-7	śayyopāntaniviṣṭasasmitamukhīnetrotsavānandito	_	_	_	_	_	_	_	_
    1	śayyā	śayyā	NOUN	_	Case=Cpd	_	_	_	LemmaId=116789|OccId=720879|Unsandhied=śayyā|UnsandhiedReconstructed=True
    2	upānta	upānta	NOUN	_	Case=Cpd	_	_	_	LemmaId=46036|OccId=720880|Unsandhied=upānta|UnsandhiedReconstructed=True
    3	niviṣṭa	niviś	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=161475|OccId=720881|Unsandhied=niviṣṭa|UnsandhiedReconstructed=True
    4	sasmita	sasmita	ADJ	_	Case=Cpd	_	_	_	LemmaId=105638|OccId=720882|Unsandhied=sasmita|UnsandhiedReconstructed=True
    5	mukhī	mukhī	NOUN	_	Case=Cpd	_	_	_	LemmaId=116136|OccId=720883|Unsandhied=mukhī|UnsandhiedReconstructed=True
    6	netrotsava	netrotsava	NOUN	_	Case=Cpd	_	_	_	LemmaId=29072|OccId=720884|Unsandhied=netrotsava|UnsandhiedReconstructed=True
    7	ānanditaḥ	ānand	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159800|OccId=720885|Unsandhied=ānanditaḥ|UnsandhiedReconstructed=True
    8	niryātaḥ	niryā	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161425|OccId=720886|Unsandhied=niryātaḥ|UnsandhiedReconstructed=True
    9-11	śanakairalīkavacanopanyāsam	_	_	_	_	_	_	_	_
    9	śanakais	śanakais	ADV	_		_	_	_	LemmaId=115561|OccId=720920|Unsandhied=śanakais|UnsandhiedReconstructed=True
    10	alīka	alīka	NOUN	_	Case=Cpd	_	_	_	LemmaId=53783|OccId=720921|Unsandhied=alīka|UnsandhiedReconstructed=True
    11	vacanopanyāsam	vacanopanyāsa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=67882|OccId=720922|Unsandhied=vacanopanyāsam|UnsandhiedReconstructed=True
    12-13	ālījanaḥ	_	_	_	_	_	_	_	_
    12	āli	āli	NOUN	_	Case=Cpd	_	_	_	LemmaId=62295|OccId=720923|Unsandhied=āli|UnsandhiedReconstructed=True
    13	janaḥ	jana	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=87452|OccId=720924|Unsandhied=janaḥ|UnsandhiedReconstructed=True

    # text = bhrūbhaṅge racite'pi dṛṣṭiradhikaṃ sotkaṇṭham udvīkṣate kārkaśyaṃ gamite'pi cetasi tanūromāñcamālambate
    # sent_id = 101313
    # sent_counter = 24
    # sent_subcounter = 1
    1-2	bhrūbhaṅge	_	_	_	_	_	_	_	_
    1	bhrū	bhrū	NOUN	_	Case=Cpd	_	_	_	LemmaId=26430|OccId=720887|Unsandhied=bhrū|UnsandhiedReconstructed=True
    2	bhaṅge	bhaṅga	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=48584|OccId=720888|Unsandhied=bhaṅge|UnsandhiedReconstructed=True
    3-4	racite'pi	_	_	_	_	_	_	_	_
    3	racite	racay	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=159596|OccId=720889|Unsandhied=racite|UnsandhiedReconstructed=True
    4	api	api	PART	_		_	_	_	LemmaId=21365|OccId=720890|Unsandhied=api|UnsandhiedReconstructed=True
    5-6	dṛṣṭiradhikaṃ	_	_	_	_	_	_	_	_
    5	dṛṣṭiḥ	dṛṣṭi	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=86502|OccId=720891|Unsandhied=dṛṣṭiḥ|UnsandhiedReconstructed=True
    6	adhikam	adhika	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=7907|OccId=720892|Unsandhied=adhikam|UnsandhiedReconstructed=True
    7-8	sotkaṇṭham	_	_	_	_	_	_	_	_
    7	sa	sa	ADV	_		_	_	_	LemmaId=202954|OccId=3672128|Unsandhied=sa|UnsandhiedReconstructed=True
    8	utkaṇṭham	utkaṇṭhā	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=55467|OccId=3672129|Unsandhied=utkaṇṭham|UnsandhiedReconstructed=True
    9	udvīkṣate	udvīkṣ	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=160293|OccId=3672130|Unsandhied=udvīkṣate
    10	kārkaśyaṃ	kārkaśya	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=14237|OccId=720895|Unsandhied=kārkaśyam|UnsandhiedReconstructed=True
    11-12	gamite'pi	_	_	_	_	_	_	_	_
    11	gamite	gamay	VERB	_	Case=Loc|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157710|OccId=720896|Unsandhied=gamite|UnsandhiedReconstructed=True
    12	api	api	PART	_		_	_	_	LemmaId=21365|OccId=720897|Unsandhied=api|UnsandhiedReconstructed=True
    13	cetasi	cetas	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=51687|OccId=720898|Unsandhied=cetasi|UnsandhiedReconstructed=True
    14-16	tanūromāñcamālambate	_	_	_	_	_	_	_	_
    14	tanū	tanū	NOUN	_	Case=Cpd	_	_	_	LemmaId=96222|OccId=720899|Unsandhied=tanū|UnsandhiedReconstructed=True
    15	romāñcam	romāñca	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=80022|OccId=720900|Unsandhied=romāñcam|UnsandhiedReconstructed=True
    16	ālambate	ālamb	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=159909|OccId=720901|Unsandhied=ālambate

    # text = ruddhāyāmapi vāci sasmitamidaṃ dagdhānanaṃ jāyate dṛṣṭe nirvahaṇaṃ bhaviṣyati kathaṃ mānasya tasmiñjane
    # sent_id = 101314
    # sent_counter = 24
    # sent_subcounter = 2
    1-2	ruddhāyāmapi	_	_	_	_	_	_	_	_
    1	ruddhāyām	rudh	VERB	_	Case=Loc|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158015|OccId=720902|Unsandhied=ruddhāyām|UnsandhiedReconstructed=True
    2	api	api	PART	_		_	_	_	LemmaId=21365|OccId=720903|Unsandhied=api|UnsandhiedReconstructed=True
    3	vāci	vāc	NOUN	_	Case=Loc|Gender=Fem|Number=Sing	_	_	_	LemmaId=76023|OccId=720904|Unsandhied=vāci|UnsandhiedReconstructed=True
    4-5	sasmitamidaṃ	_	_	_	_	_	_	_	_
    4	sasmitam	sasmita	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=105638|OccId=720905|Unsandhied=sasmitam|UnsandhiedReconstructed=True
    5	idam	idam	PRON	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=37876|OccId=720906|Unsandhied=idam|UnsandhiedReconstructed=True
    6-7	dagdhānanaṃ	_	_	_	_	_	_	_	_
    6	dagdha	dah	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157371|OccId=720907|Unsandhied=dagdha|UnsandhiedReconstructed=True
    7	ānanam	ānana	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=58264|OccId=720908|Unsandhied=ānanam|UnsandhiedReconstructed=True
    8	jāyate	jan	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=156584|OccId=720909|Unsandhied=jāyate
    9	dṛṣṭe	dṛś	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=157766|OccId=720910|Unsandhied=dṛṣṭe|UnsandhiedReconstructed=True
    10	nirvahaṇaṃ	nirvahaṇa	NOUN	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=27908|OccId=720911|Unsandhied=nirvahaṇam|UnsandhiedReconstructed=True
    11	bhaviṣyati	bhū	VERB	_	Tense=Fut|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=157250|OccId=720912|Unsandhied=bhaviṣyati
    12	kathaṃ	katham	ADV	_		_	_	_	LemmaId=1340|OccId=720913|Unsandhied=katham|UnsandhiedReconstructed=True
    13	mānasya	māna	NOUN	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=78842|OccId=720914|Unsandhied=mānasya|UnsandhiedReconstructed=True
    14-15	tasmiñjane	_	_	_	_	_	_	_	_
    14	tasmin	tad	PRON	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=37875|OccId=720915|Unsandhied=tasmin|UnsandhiedReconstructed=True
    15	jane	jana	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=87452|OccId=720916|Unsandhied=jane|UnsandhiedReconstructed=True

    # text = kānte katyapi vāsarāṇi gamaya tvaṃ mīlayitvā dṛśau svasti svasti nimīlayāmi nayane yāvan na śūnyā diśaḥ
    # sent_id = 101315
    # sent_counter = 25
    # sent_subcounter = 1
    1	kānte	kāntā	NOUN	_	Case=Voc|Gender=Fem|Number=Sing	_	_	_	LemmaId=13608|OccId=688422|Unsandhied=kānte|UnsandhiedReconstructed=True
    2-3	katyapi	_	_	_	_	_	_	_	_
    2	kati	kati	ADV	_		_	_	_	LemmaId=174543|OccId=688423|Unsandhied=kati|UnsandhiedReconstructed=True
    3	api	api	PART	_		_	_	_	LemmaId=21365|OccId=688424|Unsandhied=api|UnsandhiedReconstructed=True
    4	vāsarāṇi	vāsara	NOUN	_	Case=Acc|Gender=Neut|Number=Plur	_	_	_	LemmaId=46995|OccId=688425|Unsandhied=vāsarāṇi|UnsandhiedReconstructed=True
    5	gamaya	gamay	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=157710|OccId=688426|Unsandhied=gamaya
    6	tvaṃ	tvad	PRON	_	Case=Nom|Number=Sing	_	_	_	LemmaId=37880|OccId=688427|Unsandhied=tvam|UnsandhiedReconstructed=True
    7	mīlayitvā	mīlay	VERB	_	VerbForm=Conv	_	_	_	LemmaId=159858|OccId=688428|Unsandhied=mīlayitvā|UnsandhiedReconstructed=True
    8	dṛśau	dṛś	NOUN	_	Case=Acc|Gender=Fem|Number=Dual	_	_	_	LemmaId=86440|OccId=688429|Unsandhied=_
    9	svasti	svasti	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=121755|OccId=688430|Unsandhied=svasti|UnsandhiedReconstructed=True
    10	svasti	svasti	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=121755|OccId=688431|Unsandhied=svasti|UnsandhiedReconstructed=True
    11	nimīlayāmi	nimīlay	VERB	_	Tense=Pres|Mood=Ind|Person=1|Number=Sing	_	_	_	LemmaId=161337|OccId=688432|Unsandhied=nimīlayāmi
    12	nayane	nayana	NOUN	_	Case=Acc|Gender=Neut|Number=Dual	_	_	_	LemmaId=44212|OccId=688433|Unsandhied=nayane|UnsandhiedReconstructed=True
    13	yāvan	yāvat	SCONJ	_		_	_	_	LemmaId=64536|OccId=688434|Unsandhied=yāvat|UnsandhiedReconstructed=True
    14	na	na	PART	_		_	_	_	LemmaId=43432|OccId=688435|Unsandhied=na|UnsandhiedReconstructed=True
    15	śūnyā	śūnya	ADJ	_	Case=Nom|Gender=Fem|Number=Plur	_	_	_	LemmaId=127178|OccId=688436|Unsandhied=śūnyāḥ|UnsandhiedReconstructed=True
    16	diśaḥ	diś	NOUN	_	Case=Nom|Gender=Fem|Number=Plur	_	_	_	LemmaId=84570|OccId=688437|Unsandhied=diśaḥ|UnsandhiedReconstructed=True

    # text = āyātā vayamāgamiṣyati suhṛdvargasya bhāgyodayaiḥ saṃdeśo vada kastavābhilaṣitastīrtheṣu toyāñjaliḥ
    # sent_id = 101316
    # sent_counter = 25
    # sent_subcounter = 2
    1	āyātā	āyā	VERB	_	Case=Nom|Gender=Masc|Number=Plur|VerbForm=Part	_	_	_	LemmaId=159878|OccId=688438|Unsandhied=āyātāḥ|UnsandhiedReconstructed=True
    2-3	vayamāgamiṣyati	_	_	_	_	_	_	_	_
    2	vayam	mad	PRON	_	Case=Nom|Number=Plur	_	_	_	LemmaId=37879|OccId=688439|Unsandhied=vayam|UnsandhiedReconstructed=True
    3	āgamiṣyati	āgam	VERB	_	Tense=Fut|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=159723|OccId=688440|Unsandhied=āgamiṣyati
    4-5	suhṛdvargasya	_	_	_	_	_	_	_	_
    4	suhṛd	suhṛd	NOUN	_	Case=Cpd	_	_	_	LemmaId=98826|OccId=688441|Unsandhied=suhṛd|UnsandhiedReconstructed=True
    5	vargasya	varga	NOUN	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=69400|OccId=688442|Unsandhied=vargasya|UnsandhiedReconstructed=True
    6-7	bhāgyodayaiḥ	_	_	_	_	_	_	_	_
    6	bhāgya	bhāgya	NOUN	_	Case=Cpd	_	_	_	LemmaId=49553|OccId=688443|Unsandhied=bhāgya|UnsandhiedReconstructed=True
    7	udayaiḥ	udaya	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=56494|OccId=688444|Unsandhied=udayaiḥ|UnsandhiedReconstructed=True
    8	saṃdeśo	saṃdeśa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=17597|OccId=688452|Unsandhied=saṃdeśaḥ|UnsandhiedReconstructed=True
    9	vada	vad	VERB	_	Tense=Pres|Mood=Imp|Person=2|Number=Sing	_	_	_	LemmaId=157266|OccId=688445|Unsandhied=vada
    10-13	kastavābhilaṣitastīrtheṣu	_	_	_	_	_	_	_	_
    10	kaḥ	ka	PRON	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=37878|OccId=688446|Unsandhied=kaḥ|UnsandhiedReconstructed=True
    11	te	tvad	PRON	_	Case=Gen|Number=Sing	_	_	_	LemmaId=37880|OccId=688447|Unsandhied=te|UnsandhiedReconstructed=True
    12	abhilaṣitaḥ	abhilaṣ	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158931|OccId=688448|Unsandhied=abhilaṣitaḥ|UnsandhiedReconstructed=True
    13	tīrtheṣu	tīrtha	NOUN	_	Case=Loc|Gender=Neut|Number=Plur	_	_	_	LemmaId=82616|OccId=688449|Unsandhied=tīrtheṣu|UnsandhiedReconstructed=True
    14-15	toyāñjaliḥ	_	_	_	_	_	_	_	_
    14	toya	toya	NOUN	_	Case=Cpd	_	_	_	LemmaId=83600|OccId=688450|Unsandhied=toya|UnsandhiedReconstructed=True
    15	añjaliḥ	añjali	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=6672|OccId=688451|Unsandhied=añjaliḥ|UnsandhiedReconstructed=True

    # text = sā patyuḥ prathamāparādhasamaye sakhyopadeśaṃ vinā no jānāti savibhramāṅgavalanāvakroktisaṃsūcanam
    # sent_id = 101317
    # sent_counter = 26
    # sent_subcounter = 1
    1	sā	tad	PRON	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=37875|OccId=720925|Unsandhied=sā|UnsandhiedReconstructed=True
    2	patyuḥ	pati	NOUN	_	Case=Gen|Gender=Masc|Number=Sing	_	_	_	LemmaId=163749|OccId=720926|Unsandhied=pateḥ|UnsandhiedReconstructed=True|WordSem=46160
    3-5	prathamāparādhasamaye	_	_	_	_	_	_	_	_
    3	prathama	prathama	ADJ	_	Case=Cpd	_	_	_	LemmaId=140448|OccId=720927|Unsandhied=prathama|UnsandhiedReconstructed=True|WordSem=72232
    4	aparādha	aparādha	NOUN	_	Case=Cpd	_	_	_	LemmaId=21005|OccId=720928|Unsandhied=aparādha|UnsandhiedReconstructed=True|WordSem=23317,3691
    5	samaye	samaya	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=30049|OccId=720929|Unsandhied=samaye|UnsandhiedReconstructed=True|WordSem=34213
    6-7	sakhyopadeśaṃ	_	_	_	_	_	_	_	_
    6	sakhyā	sakhī	NOUN	_	Case=Ins|Gender=Fem|Number=Sing	_	_	_	LemmaId=9140|OccId=720930|Unsandhied=sakhyā|UnsandhiedReconstructed=True|WordSem=45000
    7	upadeśam	upadeśa	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	_	_	_	LemmaId=45037|OccId=720931|Unsandhied=upadeśam|UnsandhiedReconstructed=True|WordSem=31247
    8	vinā	vinā	ADV	_		_	_	_	LemmaId=121616|OccId=720932|Unsandhied=vinā|UnsandhiedReconstructed=True|WordSem=127575
    9	no	no	PART	_		_	_	_	LemmaId=171455|OccId=720933|Unsandhied=no|UnsandhiedReconstructed=True
    10	jānāti	jñā	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=157151|OccId=720934|Unsandhied=jānāti|WordSem=87036

    # text = svacchairacchakapolamūlagalitaiḥ paryastanetrotpalā bālā kevalameva roditi luṭhallolālakairaśrubhiḥ
    # sent_id = 101318
    # sent_counter = 26
    # sent_subcounter = 2
    1-5	svacchairacchakapolamūlagalitaiḥ	_	_	_	_	_	_	_	_
    1	svacchaiḥ	svaccha	ADJ	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=120824|OccId=720935|Unsandhied=svacchaiḥ|UnsandhiedReconstructed=True|WordSem=77445,76568
    2	accha	accha	ADJ	_	Case=Cpd	_	_	_	LemmaId=6380|OccId=720936|Unsandhied=accha|UnsandhiedReconstructed=True|WordSem=77445,68998
    3	kapola	kapola	NOUN	_	Case=Cpd	_	_	_	LemmaId=1974|OccId=720937|Unsandhied=kapola|UnsandhiedReconstructed=True|WordSem=27284
    4	mūla	mūla	NOUN	_	Case=Cpd	_	_	_	LemmaId=137542|OccId=720938|Unsandhied=mūla|UnsandhiedReconstructed=True
    5	galitaiḥ	gal	VERB	_	Case=Ins|Gender=Neut|Number=Plur|VerbForm=Part	_	_	_	LemmaId=156217|OccId=720939|Unsandhied=galitaiḥ|UnsandhiedReconstructed=True|WordSem=93621,84818
    6-8	paryastanetrotpalā	_	_	_	_	_	_	_	_
    6	paryasta	paryas	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=162272|OccId=720940|Unsandhied=paryasta|UnsandhiedReconstructed=True
    7	netra	netra	NOUN	_	Case=Cpd	_	_	_	LemmaId=29025|OccId=720941|Unsandhied=netra|UnsandhiedReconstructed=True|WordSem=26077
    8	utpalā	utpala	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=55973|OccId=720942|Unsandhied=utpalā|UnsandhiedReconstructed=True|WordSem=50371
    9	bālā	bālā	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=147895|OccId=720943|Unsandhied=bālā|UnsandhiedReconstructed=True|WordSem=45844
    10-11	kevalameva	_	_	_	_	_	_	_	_
    10	kevalam	kevala	ADJ	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=166116|OccId=720944|Unsandhied=kevalam|UnsandhiedReconstructed=True
    11	eva	eva	PART	_		_	_	_	LemmaId=39754|OccId=720945|Unsandhied=eva|UnsandhiedReconstructed=True
    12	roditi	rud	VERB	_	Tense=Pres|Mood=Ind|Person=3|Number=Sing	_	_	_	LemmaId=158014|OccId=720946|Unsandhied=roditi|WordSem=84811
    13-16	luṭhallolālakairaśrubhiḥ	_	_	_	_	_	_	_	_
    13	luṭhat	luṭh	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=159190|OccId=720947|Unsandhied=luṭhat|UnsandhiedReconstructed=True
    14	lola	lola	ADJ	_	Case=Cpd	_	_	_	LemmaId=81908|OccId=720948|Unsandhied=lola|UnsandhiedReconstructed=True
    15	alakaiḥ	alaka	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=53613|OccId=720949|Unsandhied=alakaiḥ|UnsandhiedReconstructed=True|WordSem=25850
    16	aśruṣu	aśru	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	_	_	_	LemmaId=60164|OccId=720950|Unsandhied=aśruṣu|UnsandhiedReconstructed=True|WordSem=26520

    # text = bhavatu viditaṃ chadmālāpairalaṃ priya gamyatāṃ tanurapi na te doṣo'smākaṃ vidhistu parāṅmukhaḥ
    # sent_id = 101319
    # sent_counter = 27
    # sent_subcounter = 1
    1	bhavatu	bhū	VERB	_	Tense=Pres|Mood=Imp|Person=3|Number=Sing	_	_	_	LemmaId=157250|OccId=720951|Unsandhied=bhavatu
    2	viditaṃ	vid	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=158058|OccId=720952|Unsandhied=viditam|UnsandhiedReconstructed=True
    3-5	chadmālāpairalaṃ	_	_	_	_	_	_	_	_
    3	chadma	chadman	NOUN	_	Case=Cpd	_	_	_	LemmaId=52495|OccId=720953|Unsandhied=chadma|UnsandhiedReconstructed=True
    4	ālāpaiḥ	ālāpa	NOUN	_	Case=Ins|Gender=Masc|Number=Plur	_	_	_	LemmaId=62245|OccId=720954|Unsandhied=ālāpaiḥ|UnsandhiedReconstructed=True
    5	alam	alam	ADV	_		_	_	_	LemmaId=53665|OccId=720955|Unsandhied=alam|UnsandhiedReconstructed=True
    6	priya	priya	ADJ	_	Case=Voc|Gender=Masc|Number=Sing	_	_	_	LemmaId=153185|OccId=720956|Unsandhied=priyaiḥ|UnsandhiedReconstructed=True
    7	gamyatāṃ	gam	VERB	_	Tense=Pres|Mood=Imp|Voice=Pass|Person=3|Number=Sing	_	_	_	LemmaId=156214|OccId=720957|Unsandhied=gamyatām
    8-9	tanurapi	_	_	_	_	_	_	_	_
    8	tanuḥ	tanu	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=96158|OccId=720958|Unsandhied=tanuḥ|UnsandhiedReconstructed=True
    9	api	api	PART	_		_	_	_	LemmaId=21365|OccId=720959|Unsandhied=api|UnsandhiedReconstructed=True
    10	na	na	PART	_		_	_	_	LemmaId=43432|OccId=720960|Unsandhied=na|UnsandhiedReconstructed=True
    11	te	tvad	PRON	_	Case=Gen|Number=Sing	_	_	_	LemmaId=37880|OccId=720961|Unsandhied=te|UnsandhiedReconstructed=True
    12-13	doṣo'smākaṃ	_	_	_	_	_	_	_	_
    12	doṣaḥ	doṣa	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=90071|OccId=720962|Unsandhied=doṣaḥ|UnsandhiedReconstructed=True
    13	naḥ	mad	PRON	_	Case=Gen|Number=Plur	_	_	_	LemmaId=37879|OccId=720963|Unsandhied=naḥ|UnsandhiedReconstructed=True
    14-15	vidhistu	_	_	_	_	_	_	_	_
    14	vidhiḥ	vidhi	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=122846|OccId=720964|Unsandhied=vidhiḥ|UnsandhiedReconstructed=True
    15	tu	tu	PART	_		_	_	_	LemmaId=82701|OccId=720965|Unsandhied=tu|UnsandhiedReconstructed=True
    16	parāṅmukhaḥ	parāṅmukha	ADJ	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=18716|OccId=720966|Unsandhied=parāṅmukhaḥ|UnsandhiedReconstructed=True

    # text = tava yathā tathābhūtaṃ prema prapannamimāṃ daśāṃ prakṛticapale kā naḥ pīḍā gate hatajīvite
    # sent_id = 101320
    # sent_counter = 27
    # sent_subcounter = 2
    1	tava	tvad	PRON	_	Case=Gen|Number=Sing	_	_	_	LemmaId=37880|OccId=720967|Unsandhied=te|UnsandhiedReconstructed=True
    2	yathā	yathā	PART	_		_	_	_	LemmaId=73250|OccId=720968|Unsandhied=yathā|UnsandhiedReconstructed=True
    3	tathābhūtaṃ	tathābhūta	ADJ	_	Case=Nom|Gender=Neut|Number=Sing	_	_	_	LemmaId=96002|OccId=720969|Unsandhied=tathābhūtam|UnsandhiedReconstructed=True
    4	prema	preman	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	_	_	_	LemmaId=153287|OccId=720970|Unsandhied=prem|UnsandhiedReconstructed=True
    5-6	prapannamimāṃ	_	_	_	_	_	_	_	_
    5	prapannam	prapad	VERB	_	Case=Nom|Gender=Neut|Number=Sing|VerbForm=Part	_	_	_	LemmaId=162912|OccId=720971|Unsandhied=prapannam|UnsandhiedReconstructed=True
    6	imām	idam	PRON	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=37876|OccId=720972|Unsandhied=imām|UnsandhiedReconstructed=True
    7	daśāṃ	daśā	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	_	_	_	LemmaId=146520|OccId=720973|Unsandhied=daśām|UnsandhiedReconstructed=True
    8-9	prakṛticapale	_	_	_	_	_	_	_	_
    8	prakṛti	prakṛti	NOUN	_	Case=Cpd	_	_	_	LemmaId=151147|OccId=720974|Unsandhied=prakṛti|UnsandhiedReconstructed=True
    9	capale	capala	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=164411|OccId=720975|Unsandhied=capale|UnsandhiedReconstructed=True
    10	kā	ka	PRON	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=37878|OccId=720976|Unsandhied=kā|UnsandhiedReconstructed=True
    11	naḥ	mad	PRON	_	Case=Gen|Number=Plur	_	_	_	LemmaId=37879|OccId=720977|Unsandhied=naḥ|UnsandhiedReconstructed=True
    12	pīḍā	pīḍā	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=144289|OccId=720978|Unsandhied=pīḍā|UnsandhiedReconstructed=True
    13	gate	gam	VERB	_	Case=Loc|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156214|OccId=720979|Unsandhied=gate|UnsandhiedReconstructed=True
    14-15	hatajīvite	_	_	_	_	_	_	_	_
    14	hata	han	VERB	_	Case=Cpd|VerbForm=Part	_	_	_	LemmaId=157282|OccId=720980|Unsandhied=hata|UnsandhiedReconstructed=True
    15	jīvite	jīvita	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=89392|OccId=720981|Unsandhied=jīvite|UnsandhiedReconstructed=True

    # text = urasi nihitastāro hāraḥ kṛtā jaghane ghane kalakalavatī kāñcī pādau kvaṇanmaṇinūpurau
    # sent_id = 101321
    # sent_counter = 28
    # sent_subcounter = 1
    1	urasi	uras	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	_	_	_	LemmaId=37906|OccId=720982|Unsandhied=urasi|UnsandhiedReconstructed=True
    2-3	nihitastāro	_	_	_	_	_	_	_	_
    2	nihitaḥ	nidhā	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	_	_	_	LemmaId=161295|OccId=720983|Unsandhied=nihitaḥ|UnsandhiedReconstructed=True
    3	tāraḥ	tāra	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=97326|OccId=720984|Unsandhied=tāraḥ|UnsandhiedReconstructed=True
    4	hāraḥ	hāra	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	_	_	_	LemmaId=108676|OccId=720985|Unsandhied=hāraḥ|UnsandhiedReconstructed=True
    5	kṛtā	kṛ	VERB	_	Case=Nom|Gender=Fem|Number=Sing|VerbForm=Part	_	_	_	LemmaId=156168|OccId=720986|Unsandhied=kṛtā|UnsandhiedReconstructed=True
    6	jaghane	jaghana	NOUN	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=53008|OccId=720987|Unsandhied=jaghane|UnsandhiedReconstructed=True
    7	ghane	ghana	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	_	_	_	LemmaId=157043|OccId=720988|Unsandhied=ghane|UnsandhiedReconstructed=True
    8	kalakalavatī	kalakalavat	ADJ	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=176879|OccId=721069|Unsandhied=kalakalavatī|UnsandhiedReconstructed=True
    9	kāñcī	kāñcī	NOUN	_	Case=Nom|Gender=Fem|Number=Sing	_	_	_	LemmaId=13406|OccId=720989|Unsandhied=kāñcī|UnsandhiedReconstructed=True
    10	pādau	pāda	NOUN	_	Case=Nom|Gender=Masc|Number=Dual	_	_	_	LemmaId=93551|OccId=720990|Unsandhied=pādau|UnsandhiedReconstructed=True
    11-13	kvaṇanmaṇinūpurau	_	_	_	_	_	_	_	_
    11	kvaṇat	kvaṇ	VERB	_	Case=Cpd|Tense=Pres|VerbForm=Part	_	_	_	LemmaId=156189|OccId=720991|Unsandhied=kvaṇat|UnsandhiedReconstructed=True
    12	maṇi	maṇi	NOUN	_	Case=Cpd	_	_	_	LemmaId=26897|OccId=720992|Unsandhied=maṇi|UnsandhiedReconstructed=True
    13	nūpurau	nūpura	NOUN	_	Case=Nom|Gender=Masc|Number=Dual	_	_	_	LemmaId=28842|OccId=720993|Unsandhied=nūpurau|UnsandhiedReconstructed=True

""".trimIndent()

