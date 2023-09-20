package models

import extensions.getConlluField

typealias FeatureExtractor = (String) -> Map<String, String>?

data class Token(
    val id: Int,
    val form: String,
    val lemma: String,
    val upos: String,
    val xpos: String,
    val feats: Map<String, String>?,
    val head: Int,
    val deprel: String,
    val deps: String?,
    val misc: Map<String,String>?
) {

    companion object {
        /**
         * Create a token from a CoNLL-U line
         *
         * @param line The CoNLL-U line as a string
         * @param extractFeatures A function to extract features from a string building a map
         * @param handleHeadRelation A function to handle the head relation
         * @param debug A boolean to enable debugging
         *
         * @return A token instance
         *
         */
        fun fromString(
            line: String,
            extractFeatures: FeatureExtractor,
            handleHeadRelation: (String) -> Int,
            debug: Boolean = false
        ): Token {
            val fields = line.split("\t")

            if (debug) debugLog(fields, extractFeatures, handleHeadRelation)

            validate(line, fields)


            return Token(
                id = fields.getConlluField(ConlluField.ID) { it.toInt() },
                form = fields.getConlluField(ConlluField.FORM),
                lemma = fields.getConlluField(ConlluField.LEMMA),
                upos = fields.getConlluField(ConlluField.UPOS),
                xpos = fields.getConlluField(ConlluField.XPOS),
                feats = fields.getConlluField(ConlluField.FEATS) { extractFeatures(it) },
                head = fields.getConlluField(ConlluField.HEAD) { handleHeadRelation(it) },
                deprel = fields.getConlluField(ConlluField.DEPREL),
                deps = fields.getConlluField(ConlluField.DEPS),
                misc = fields.getConlluField(ConlluField.MISC) { extractFeatures(it) }
            )
        }

        private fun validate(line: String, fields: List<String>) {
            require(fields.size == ConlluField.entries.size) {
                "Invalid CoNLL-U line: $line"
            }
        }

        /**
         * Debugging function to print out the fields of a token
         *
         * @param fields The fields of a token
         * @param extractFeatures A function to extract features from a string building a map
         * @param handleHeadRelation A function to handle the head relation
         *
         * @return Unit
         */
        private fun debugLog(fields: List<String>, extractFeatures: FeatureExtractor, handleHeadRelation: (String) -> Int) {
            println("FieldSize: " + fields.size + "\n")
            println("ID: " + fields.getConlluField(ConlluField.ID) + "\n")
            println("Form: " + fields.getConlluField(ConlluField.FORM) + "\n")
            println("Lemma: " + fields.getConlluField(ConlluField.LEMMA) + "\n")
            println("UPOS: " + fields.getConlluField(ConlluField.UPOS) + "\n")
            println("XPOS: " + fields.getConlluField(ConlluField.XPOS) + "\n")
            println("Feats: " + fields.getConlluField(ConlluField.FEATS) { extractFeatures(it) } + "\n")
            println("Head: " + fields.getConlluField(ConlluField.HEAD) { handleHeadRelation(it) } + "\n")
            println("Deprel: " + fields.getConlluField(ConlluField.DEPREL) + "\n")
            println("Deps: " + fields.getConlluField(ConlluField.DEPS) + "\n")
            println("Misc: " + fields.getConlluField(ConlluField.MISC) { extractFeatures(it) } + "\n")
        }

    }
}

