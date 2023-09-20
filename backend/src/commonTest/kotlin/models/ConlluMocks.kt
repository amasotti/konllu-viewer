package models

val tokenMock1 = Token(
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

val tokenMock2 = Token(
    id = 2,
    form = "is",
    lemma = "be",
    upos = "VERB",
    xpos = "VB",
    feats = mapOf("Tense" to "Pres"),
    head = 0,
    deprel = "root",
    deps = null,
    misc = mapOf("SomeKey" to "SomeValue")
)
