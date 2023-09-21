import parser.ConlluParser
import svg.SVGGenerator

fun main() {
    // PoC to check if the parser works
    val parsed = ConlluParser.parseConlluFile(SAMPLE_SPANISH)
    val svgGenerator = SVGGenerator(parsed.sentences[0])

    println(svgGenerator.render())
}
