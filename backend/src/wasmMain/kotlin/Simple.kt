import extensions.toPrettyString
//import kotlinx.browser.document
//import kotlinx.dom.appendText
//import org.w3c.dom.HTMLDivElement
import parser.ConlluParser
import svg.SVGGenerator

//fun main() {
//
//    document.createElement("div").apply {
//        appendText("Hello Kotlin.. here you are !")
//    }.let(document.body!!::appendChild)
//    val raw = getSampleText()
//    val parsed = ConlluParser.parseConlluFile(raw)
//
//    document.createElement("p").apply {
//        appendText("Hello, ${parsed.sentences[0]}!<br>")
//    }.let(document.body!!::appendChild)
//
//
//    val svgGenerator = SVGGenerator(parsed.sentences[0])
//    val svg = svgGenerator.render()
//
//    val divElement = document.createElement("div") as HTMLDivElement
//    divElement.innerHTML = svg
//
//    document.body!!.appendChild(divElement)
//
//}

@OptIn(ExperimentalJsExport::class)
@JsName("generateSvg")
@JsExport
@Deprecated("Use generateSvgFromConllu instead")
fun generateSvg(fileContent: String) : String {
    val parsed = ConlluParser.parseConlluFile(fileContent)
    val svgGenerator = SVGGenerator(parsed.sentences[0])
    return svgGenerator.render()
}

@OptIn(ExperimentalJsExport::class)
@JsName("serveSentenceText")
@JsExport
fun serveSentenceText(fileContent: String, sentenceIndex: Int) : String {
    val parsed = ConlluParser.parseConlluFile(fileContent)

    if (sentenceIndex >= parsed.sentences.size) {
        return "Sentence index out of bounds"
    }

    return parsed.sentences[sentenceIndex].tokens.joinToString(" ") { it.form }
}

@OptIn(ExperimentalJsExport::class)
@JsName("serveSentenceMetadata")
@JsExport
fun serveSentenceMetadata(fileContent: String, sentenceIndex: Int) : String {
    val parsed = ConlluParser.parseConlluFile(fileContent)

    if (sentenceIndex >= parsed.sentences.size) {
        return "Sentence index out of bounds"
    }

    return parsed.sentences[sentenceIndex].metadata.toPrettyString()
}

@OptIn(ExperimentalJsExport::class)
@JsName("serveSentenceRepresentation")
@JsExport
fun serveSentenceRepresentation(fileContent: String, sentenceIndex: Int) : String {
    val parsed = ConlluParser.parseConlluFile(fileContent)

    if (sentenceIndex >= parsed.sentences.size) {
        return "Sentence index out of bounds"
    }

    val svgGenerator = SVGGenerator(parsed.sentences[sentenceIndex])

    return svgGenerator.render()
}

@OptIn(ExperimentalJsExport::class)
@JsName("serveText")
@JsExport
fun serveText(rawText: String) : String {
    val parsed = ConlluParser.parseConlluFile(rawText)
    // Take all sentences, add indices before them, and join them with newlines
    return parsed.sentences
        .mapIndexed {
                    index, sentence -> "$index: ${sentence.tokens.joinToString(" ") { it.form }}" }
        .joinToString("\n\n")
}
