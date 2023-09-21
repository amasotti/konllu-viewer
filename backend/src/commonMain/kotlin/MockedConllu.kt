/**
 * MockedConllu.kt
 */
val SAMPLE_TEXT : String = """
# layer=2-MA
# citation_text=ṚV
# citation_chapter=10, 149
1	savitā	savitṛ	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	4	nsubj	_	LemmaId=105325|OccId=4366012|Unsandhied=savitā|Annotator=Er
2	yantraiḥ	yantra	NOUN	_	Case=Ins|Gender=Neut|Number=Plur	4	obl:instr	_	LemmaId=73751|OccId=4366013|Unsandhied=yantraiḥ|Annotator=Er
3	pṛthivīm	pṛthivī	NOUN	_	Case=Acc|Gender=Fem|Number=Sing	4	obj	_	LemmaId=150027|OccId=4366014|Unsandhied=pṛthivīm|Annotator=Er
4	aramṇāt	ram	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Past	0	root	_	LemmaId=157997|OccId=4366100|Unsandhied=aramṇāt|Annotator=Er|Punctuation=fullStop


# text = askambhane savitā dyām adṛṃhat
# sent_id = 596923_2
# layer=2-MA
# citation_text=ṚV
# citation_chapter=10, 149
1	askambhane	askambhana	NOUN	_	Case=Loc|Gender=Neut|Number=Sing	4	obl:loc	_	LemmaId=61179|OccId=4366015|Unsandhied=askambhane|Annotator=Er
2	savitā	savitṛ	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	4	nsubj	_	LemmaId=105325|OccId=4366016|Unsandhied=savitā|Annotator=Er
3	dyām	div	NOUN	_	_	4	obj	_	LemmaId=168377|OccId=4366017|Unsandhied=dyām|Annotator=Er
4	adṛṃhat	dṛh	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Past	0	root	_	LemmaId=158229|OccId=4366018|Unsandhied=adṛṃhat|Annotator=Er|Punctuation=fullStop


# text = aśvam iva adhukṣat dhunim antarikṣam atūrte baddham savitā samudram
# sent_id = 596924_1
# layer=2-MA
# citation_text=ṚV
# citation_chapter=10, 149
1	aśvam	aśva	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	3	obl:manner	_	LemmaId=60200|OccId=4366019|Unsandhied=aśvam|Annotator=Er
2	iva	iva	PART	_	_	1	case:sim	_	LemmaId=63807|OccId=4366020|Unsandhied=iva|Annotator=Er
3	adhukṣat	duh	VERB	_	Mood=Ind|Number=Sing|Person=3|Tense=Past	0	root	_	LemmaId=158662|OccId=4366021|Unsandhied=adhukṣat|Annotator=Er
4	dhunim	dhuni	ADJ	_	Case=Acc|Gender=Masc|Number=Sing	5	amod	_	LemmaId=42744|OccId=4366022|Unsandhied=dhunim|Annotator=Er
5	antarikṣam	antarikṣa	NOUN	_	Case=Acc|Gender=Neut|Number=Sing	3	obj	_	LemmaId=11898|OccId=4366023|Unsandhied=antarikṣam|Annotator=Er|Punctuation=comma
6	atūrte	atūrta	ADJ	_	Case=Loc|Gender=Masc|Number=Sing	8	orphan	_	LemmaId=7356|OccId=4366024|Unsandhied=atūrte|Annotator=Er
7	baddham	bandh	VERB	_	Case=Acc|Gender=Masc|Number=Sing|Tense=Past|VerbForm=Part	9	acl:dpct	_	LemmaId=157929|OccId=4366025|Unsandhied=baddham|Annotator=Er
8	savitā	savitṛ	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	3	conj	_	LemmaId=105325|OccId=4366026|Unsandhied=savitā|Annotator=Er
9	samudram	samudra	NOUN	_	Case=Acc|Gender=Masc|Number=Sing	8	orphan	_	LemmaId=30275|OccId=4366027|Unsandhied=samudram|Annotator=Er|Punctuation=fullStop


# text = yatrā samudra skabhito vy aunad apāṃ napāt savitā tasya veda
# sent_id = 596925
# sent_counter = 2
# sent_subcounter = 1
1	yatrā	yatra	SCONJ	_		5	mark	_	LemmaId=73233|OccId=4366028|Unsandhied=yatrā
2	samudra	samudra	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	5	nsubj	_	LemmaId=30275|OccId=4366029|Unsandhied=samudra
3	skabhito	skambh	VERB	_	Case=Nom|Gender=Masc|Number=Sing|VerbForm=Part	2	acl	_	LemmaId=159176|OccId=4366030|Unsandhied=skabhitaḥ
4	vy	vi	ADV	_		5	advmod	_	LemmaId=216733|OccId=4366031|Unsandhied=vi
5	aunad	und	VERB	_	Tense=Impf|Mood=Ind|Person=3|Number=Sing	10	advcl	_	LemmaId=156143|OccId=4366101|Unsandhied=aunat|Punctuation=comma
6	apāṃ	ap	NOUN	_	Case=Gen|Gender=Neut|Number=Plur	7	compound	_	LemmaId=167009|OccId=4366032|Unsandhied=apām
7	napāt	napāt	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	10	nsubj	_	LemmaId=216442|OccId=4366033|Unsandhied=napāt
8	savitā	savitṛ	NOUN	_	Case=Nom|Gender=Masc|Number=Sing	10	nsubj	_	LemmaId=105325|OccId=4366034|Unsandhied=savitā
9	tasya	tad	PRON	_	Case=Gen|Gender=Neut|Number=Sing	10	obj	_	LemmaId=37875|OccId=4366035|Unsandhied=tasya
10	veda	vid	VERB	_	Tense=Past|Mood=Ind|Person=3|Number=Sing	0	root	_	LemmaId=158058|OccId=4366036|Unsandhied=veda|Punctuation=fullStop

""".trimIndent()


val SAMPLE_SPANISH : String = """
# global.Entity = eid-etype-head-other
# newdoc id = 3LB-CAST-111_C-2
# sent_id = 3LB-CAST-111_C-2-s1
# text = El gobernante, con ganada fama desde que llegó hace 16 meses al poder de explotar al máximo su oratoria y acusado por sus detractores de incontinencia verbal, enmudeció desde el momento en el que el Tribunal Supremo de Justicia (TSJ) decidió suspender temporalmente los comicios múltiples ante la imposibilidad "técnica" de celebrarlos el 28 de mayo.
# orig_file_sentence 001#1
1	El	el	DET	da0ms0	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	2	det	2:det	_
2	gobernante	gobernante	NOUN	ncms000	Gender=Masc|Number=Sing	32	nsubj	32:nsubj	SpaceAfter=No|ArgTem=arg1:tem
3	,	,	PUNCT	fc	PunctType=Comm	6	punct	6:punct	_
4	con	con	ADP	sps00	_	6	case	6:case	_
5	ganada	ganado	ADJ	aq0fsp	Gender=Fem|Number=Sing|VerbForm=Part	6	amod	6:amod	_
6	fama	fama	NOUN	ncfs000	Gender=Fem|Number=Sing	2	nmod	2:nmod	_
7	desde	desde	ADP	sps00	_	9	mark	9:mark	_
8	que	que	SCONJ	cs	_	9	mark	9:mark	_
9	llegó	llegar	VERB	vmis3s0	Mood=Ind|Number=Sing|Person=3|Tense=Past|VerbForm=Fin	6	acl	6:acl	_
10	hace	hacer	VERB	vmip3s0	Mood=Ind|Number=Sing|Person=3|Tense=Pres|VerbForm=Fin	9	advcl	9:advcl	ArgTem=argM:tmp
11	16	16	NUM	_	NumForm=Digit|NumType=Card	12	nummod	12:nummod	_
12	meses	mes	NOUN	ncmp000	Gender=Masc|Number=Plur	10	obj	10:obj	_
13-14	al	_	_	_	_	_	_	_	_
13	a	a	ADP	spcms	_	15	case	15:case	_
14	el	el	DET	_	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	15	det	15:det	_
15	poder	poder	NOUN	ncms000	Gender=Masc|Number=Sing	9	obl	9:obl	ArgTem=argM:loc
16	de	de	ADP	sps00	_	17	mark	17:mark	_
17	explotar	explotar	VERB	vmn0000	VerbForm=Inf	6	acl	6:acl	_
18-19	al	_	_	_	_	_	_	_	MWE=al_máximo|MWEPOS=ADV
18	a	a	ADP	rg	_	17	case	17:case	ArgTem=argM:mnr|MWE=al_máximo|MWEPOS=ADV
19	el	el	DET	_	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	17	det	17:det	_
20	máximo	máximo	NOUN	_	_	18	fixed	18:fixed	_
21	su	su	DET	dp3cs0	Number=Sing|Person=3|Poss=Yes|PronType=Prs	22	det	22:det	_
22	oratoria	oratoria	NOUN	ncfs000	Gender=Fem|Number=Sing	17	obj	17:obj	ArgTem=arg1:pat
23	y	y	CCONJ	cc	_	24	cc	24:cc	_
24	acusado	acusado	ADJ	aq0msp	Gender=Masc|Number=Sing|VerbForm=Part	6	conj	6:conj	_
25	por	por	ADP	sps00	_	27	case	27:case	_
26	sus	su	DET	dp3cp0	Number=Plur|Person=3|Poss=Yes|PronType=Prs	27	det	27:det	_
27	detractores	detractor	NOUN	ncmp000	Gender=Masc|Number=Plur	24	obl:agent	24:obl:agent	ArgTem=arg0:agt
28	de	de	ADP	sps00	_	29	case	29:case	_
29	incontinencia	incontinencia	NOUN	ncfs000	Gender=Fem|Number=Sing	24	obl:arg	24:obl:arg	ArgTem=arg2:tem
30	verbal	verbal	ADJ	aq0cs0	Number=Sing	29	amod	29:amod	SpaceAfter=No
31	,	,	PUNCT	fc	PunctType=Comm	6	punct	6:punct	_
32	enmudeció	enmudecer	VERB	vmis3s0	Mood=Ind|Number=Sing|Person=3|Tense=Past|VerbForm=Fin	0	root	0:root	_
33	desde	desde	ADP	sps00	_	35	case	35:case	_
34	el	el	DET	da0ms0	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	35	det	35:det	_
35	momento	momento	NOUN	ncms000	Gender=Masc|Number=Sing	32	obl	32:obl	ArgTem=argM:tmp
36	en	en	ADP	sps00	_	38	case	38:case	_
37	el	el	DET	da0ms0	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	38	det	38:det	ArgTem=argM:tmp
38	que	que	PRON	pr0cn000	PronType=Rel	47	obl	47:obl	_
39	el	el	DET	da0ms0	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	40	det	40:det	Entity=(NOCOREF:Spec.organization-organization-2-gstype:spec
40	Tribunal	Tribunal	PROPN	np0000o	_	47	nsubj	47:nsubj	MWE=Tribunal_Supremo_de_Justicia|MWEPOS=PROPN|ArgTem=arg0:agt
41	Supremo	Supremo	PROPN	_	_	40	flat	40:flat	_
42	de	de	ADP	_	_	43	case	43:case	_
43	Justicia	Justicia	PROPN	_	_	40	flat	40:flat	_
44	(	(	PUNCT	fpa	PunctSide=Ini|PunctType=Brck	45	punct	45:punct	SpaceAfter=No|Entity=(NOCOREF:Spec.organization-organization-2-gstype:spec
45	TSJ	TSJ	PROPN	np0000o	_	40	flat	40:flat	SpaceAfter=No
46	)	)	PUNCT	fpt	PunctSide=Fin|PunctType=Brck	45	punct	45:punct	Entity=NOCOREF:Spec.organization)NOCOREF:Spec.organization)
47	decidió	decidir	VERB	vmis3s0	Mood=Ind|Number=Sing|Person=3|Tense=Past|VerbForm=Fin	35	acl	35:acl	_
48	suspender	suspender	VERB	vmn0000	VerbForm=Inf	47	xcomp	47:xcomp	ArgTem=arg1:pat
49	temporalmente	temporalmente	ADV	rg	_	48	advmod	48:advmod	ArgTem=argM:tmp
50	los	el	DET	da0mp0	Definite=Def|Gender=Masc|Number=Plur|PronType=Art	51	det	51:det	_
51	comicios	comicio	NOUN	ncmp000	Gender=Masc|Number=Plur	48	obj	48:obj	ArgTem=arg1:pat
52	múltiples	múltiple	ADJ	aq0cp0	Number=Plur	51	amod	51:amod	_
53	ante	ante	ADP	sps00	_	55	case	55:case	_
54	la	el	DET	da0fs0	Definite=Def|Gender=Fem|Number=Sing|PronType=Art	55	det	55:det	_
55	imposibilidad	imposibilidad	NOUN	ncfs000	Gender=Fem|Number=Sing	48	obl	48:obl	ArgTem=argM:adv
56	"	"	PUNCT	fe	PunctType=Quot	57	punct	57:punct	SpaceAfter=No
57	técnica	técnico	ADJ	aq0fs0	Gender=Fem|Number=Sing	55	amod	55:amod	SpaceAfter=No
58	"	"	PUNCT	fe	PunctType=Quot	57	punct	57:punct	_
59	de	de	ADP	sps00	_	60	mark	60:mark	_
60-61	celebrarlos	_	_	_	_	_	_	_	_
60	celebrar	celebrar	VERB	vmn0000	VerbForm=Inf	55	acl	55:acl	_
61	los	él	PRON	_	Case=Acc|Gender=Masc|Number=Plur|Person=3|PrepCase=Npr|PronType=Prs	60	obj	60:obj	_
62	el	el	DET	da0ms0	Definite=Def|Gender=Masc|Number=Sing|PronType=Art	63	det	63:det	Entity=(NOCOREF:Spec.date-time-2-gstype:spec
63	28	28	NUM	_	NumForm=Digit|NumType=Card	60	obl	60:obl	MWE=28_de_mayo|MWEPOS=NOUN|ArgTem=argM:tmp
64	de	de	ADP	_	_	65	case	65:case	_
65	mayo	mayo	NOUN	_	_	63	compound	63:compound	SpaceAfter=No|Entity=NOCOREF:Spec.date)
66	.	.	PUNCT	fp	PunctType=Peri	32	punct	32:punct	_
""".trimIndent()
