package extensions

import models.ConlluFieldsEnum

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
