import kotlinx.browser.document
import kotlinx.dom.appendText
import org.w3c.dom.HTMLElement

fun main() {
    val element = document.createElement("div").apply {
        appendText("Hello, ${greet()}!<br>")
        appendText("Hello Kotlin.. here you are !")
    }.let(document.body!!::appendChild)

    (element as HTMLElement).style.color = "red"
    element.style.fontSize = "2em"
}

fun greet() = "world"

@OptIn(ExperimentalJsExport::class)
@JsExport
fun add(a: Int, b: Int) = a + b
