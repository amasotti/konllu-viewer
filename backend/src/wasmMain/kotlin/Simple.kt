import kotlinx.browser.document
import kotlinx.dom.appendText
import org.w3c.dom.HTMLDivElement
import parser.ConlluParser
import svg.SVGGenerator

fun main() {

    document.createElement("div").apply {
        appendText("Hello Kotlin.. here you are !")
    }.let(document.body!!::appendChild)
    val raw = getSampleText()
    val parsed = ConlluParser.parseConlluFile(raw)

    document.createElement("p").apply {
        appendText("Hello, ${parsed.sentences[1]}!<br>")
    }.let(document.body!!::appendChild)


    val svgGenerator = SVGGenerator(parsed.sentences[1])
    val svg = svgGenerator.render()

    val divElement = document.createElement("div") as HTMLDivElement
    divElement.innerHTML = svg

    document.body!!.appendChild(divElement)

}

@OptIn(ExperimentalJsExport::class)
@JsName("generateSvg")
@JsExport
fun generateSvg(fileContent: String) : String {
    val parsed = ConlluParser.parseConlluFile(fileContent)
    val svgGenerator = SVGGenerator(parsed.sentences[1])
    return svgGenerator.render()
}
