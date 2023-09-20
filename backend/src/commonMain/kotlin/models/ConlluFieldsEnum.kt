package models

/**
 * The fields of a CoNLL-U formatted sentence
 *
 * ```
 * Token(
 *  id=1,
 *  form=askambhane,
 *  lemma=askambhana,
 *  upos=NOUN,
 *  xpos=_,
 *  feats={Case=Loc, Gender=Neut, Number=Sing},
 *  head=4,
 *  deprel=obl:loc,
 *  deps=, misc=null
 *  )
 *  ```
 */
enum class ConlluFieldsEnum(val index: Int) {
    // The index of the field in the CoNLL-U formatted sentence
    ID(0),

    // The form of the token
    FORM(1),

    // The base lemma of the token
    LEMMA(2),

    // Universal POS tag
    UPOS(3),

    // Language-specific POS tag
    XPOS(4),

    // Morphological features as Map<String, String>
    FEATS(5),

    // Head of the current token
    HEAD(6),

    // Dependency relation to the HEAD
    DEPREL(7),

    // Enhanced dependency graph in the form of a list of head-deprel pairs
    DEPS(8),

    // Any other annotation
    MISC(9)
}
