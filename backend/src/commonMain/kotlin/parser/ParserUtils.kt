package parser

object ParserUtils {

    private const val MISSING_INFO_PLACEHOLDER = "_"
    private const val FEATURE_DELIMITER = "|"
    private const val FEATURE_MAP_DELIMITER = "="

    fun extractFeatures(feats: String): Map<String, String>? {
        return if (feats == MISSING_INFO_PLACEHOLDER || feats.isBlank()) null
        else feats
            .split(FEATURE_DELIMITER)
            .map { it.split(FEATURE_MAP_DELIMITER) }
            .associate { it.first() to it.last() }
    }

    fun handleHeadRelation(headDep: String): Int {
        return if (headDep == MISSING_INFO_PLACEHOLDER) -1 else headDep.toInt()
    }

    fun extractMetadata(line: String, prefix: String, delimiter: String): Pair<String, String> {
        val key = line.substringAfter(prefix).substringBefore(delimiter)
        val value = line.substringAfter(delimiter)
        return key.trim() to value.trim()
    }
}
