import kotlinx.browser.document
import kotlinx.dom.appendText
import kotlinx.dom.createElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.svg.SVGSVGElement
import parser.ConlluParser
import svg.SVGCreator
import svg.generateSVG

fun main() {

    document.createElement("div").apply {
        appendText("Hello, ${greet()}!<br>")
        appendText("Hello Kotlin.. here you are !")
    }.let(document.body!!::appendChild)
    val raw = getSampleText()
    val parsed = ConlluParser.parseConlluFile(raw)

    document.createElement("p").apply {
        appendText("Hello, ${parsed.sentences[1]}!<br>")
    }.let(document.body!!::appendChild)

//    parsed.sentences.forEach {
//
//        document.createElement("p").apply {
//            appendText("${it.metadata}!<br>")
//        }.let(document.body!!::appendChild)
//
//        val svgNS = "http://www.w3.org/2000/svg"
//        val svgElement = document.createElementNS(svgNS, "svg") as SVGSVGElement
//        svgElement.innerHTML = generateSVG(it)
//        svgElement.setAttribute("width", "100%")
//        svgElement.setAttribute("height", "100%")
//        svgElement.setAttribute("id", "svg1")
//        document.body!!.appendChild(svgElement)
//    }

    val svgGenerator = SVGCreator(parsed.sentences[0])
    val svg = svgGenerator.render()

    val divElement = document.createElement("div") as HTMLDivElement
    divElement.innerHTML = svg
//    divElement.style.width = "100%"
//    divElement.style.height = "100%"

    document.body!!.appendChild(divElement)



}

fun greet() = "world"

