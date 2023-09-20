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
                id = fields.getConlluField(ConlluFieldsEnum.ID) { it.toInt() },
                form = fields.getConlluField(ConlluFieldsEnum.FORM),
                lemma = fields.getConlluField(ConlluFieldsEnum.LEMMA),
                upos = fields.getConlluField(ConlluFieldsEnum.UPOS),
                xpos = fields.getConlluField(ConlluFieldsEnum.XPOS),
                feats = fields.getConlluField(ConlluFieldsEnum.FEATS) { extractFeatures(it) },
                head = fields.getConlluField(ConlluFieldsEnum.HEAD) { handleHeadRelation(it) },
                deprel = fields.getConlluField(ConlluFieldsEnum.DEPREL),
                deps = fields.getConlluField(ConlluFieldsEnum.DEPS),
                misc = fields.getConlluField(ConlluFieldsEnum.MISC) { extractFeatures(it) }
            )
        }

        private fun validate(line: String, fields: List<String>) {
            require(fields.size == ConlluFieldsEnum.entries.size) {
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
        private fun debugLog(
            fields: List<String>,
            extractFeatures: FeatureExtractor,
            handleHeadRelation: (String) -> Int)
        {
            println("FieldSize: " + fields.size + "\n")
            println("ID: " + fields.getConlluField(ConlluFieldsEnum.ID) + "\n")
            println("Form: " + fields.getConlluField(ConlluFieldsEnum.FORM) + "\n")
            println("Lemma: " + fields.getConlluField(ConlluFieldsEnum.LEMMA) + "\n")
            println("UPOS: " + fields.getConlluField(ConlluFieldsEnum.UPOS) + "\n")
            println("XPOS: " + fields.getConlluField(ConlluFieldsEnum.XPOS) + "\n")
            println("Feats: " + fields.getConlluField(ConlluFieldsEnum.FEATS) { extractFeatures(it) } + "\n")
            println("Head: " + fields.getConlluField(ConlluFieldsEnum.HEAD) { handleHeadRelation(it) } + "\n")
            println("Deprel: " + fields.getConlluField(ConlluFieldsEnum.DEPREL) + "\n")
            println("Deps: " + fields.getConlluField(ConlluFieldsEnum.DEPS) + "\n")
            println("Misc: " + fields.getConlluField(ConlluFieldsEnum.MISC) { extractFeatures(it) } + "\n")
        }

    }
}

