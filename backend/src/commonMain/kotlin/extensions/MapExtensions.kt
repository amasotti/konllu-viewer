package extensions

fun Map<String,String>.toPrettyString(): String {
    return entries.joinToString("\n") { "${it.key}: ${it.value}" }
}
