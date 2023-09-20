package extensions

import models.ConlluFieldsEnum
import parser.ConlluParser

/**
 * Retrieves a specific field from a CoNLL-U formatted line represented as a list of strings.
 *
 * This function uses Kotlin's reified type parameters to automatically cast the field to the expected type.
 * The `reified` keyword allows for type checking and casting at runtime, which is normally not possible with
 * generic types due to type erasure.
 *
 * @param T The expected return type of the field. This type is reified, meaning it will be available at runtime.
 * @param field The enum representing the CoNLL-U field to retrieve.
 * @param transform An optional lambda function to transform the field value.
 *  By default, the field value is returned as is.
 * @return The field value, transformed and cast to the expected type T.
 */
inline fun <reified T> List<String>.getConlluField(
    field: ConlluFieldsEnum,
    transform: (String) -> T = { it as T }): T
{
    return transform(this[field.index])
}


/**
 * Checks if a line is a valid CoNLL-U token line.
 *
 *
 * @return True if the line is a valid CoNLL-U token line, false otherwise.
 *
 * **Checks**:
 *
 * - The line is not blank (nothing to parse).
 * - The line does not start with a sentence metadata prefix (e.g. "# sent_id = 1").
 *   In that case, the line is a comment and not a token.
 * - The line does not contain the multiword token delimiter (e.g. "1-2").
 *   Used to represent multiword tokens.
 */
fun String.isValidConlluToken(): Boolean {
    return isNotBlank() &&
            !startsWith(ConlluParser.SENTENCE_METADATA_PREFIX) &&
            !contains(ConlluParser.MULTIWORD_TOKEN_DELIMITER)
}
