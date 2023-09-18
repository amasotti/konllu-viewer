package svg

/**
 * Custom extension fn for the StringBuilder
 *
 * It wraps the SVG elements in the SVG tag after rendering them
 */
fun StringBuilder.wrapSvg(elements: List<SVGElement>, action: StringBuilder.(SVGElement) -> String) {
    // -- START OF SVG TAG
    appendLine("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">")

    // -- TRANSFORM THE ELEMENTS (typically you want to render them)

    elements.forEach { appendLine(action(it)) }


    // -- END OF SVG TAG
    append("</svg>")
}
