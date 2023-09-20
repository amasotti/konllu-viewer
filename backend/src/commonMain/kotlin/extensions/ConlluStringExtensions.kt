package extensions

import models.ConlluField

inline fun <reified T> List<String>.getConlluField(field: ConlluField, transform: (String) -> T = { it as T }): T {
    return transform(this[field.index])
}
