package svg

/**
 * Custom extension fn for the StringBuilder
 *
 * It wraps the SVG elements in the SVG tag after rendering them
 */
fun StringBuilder.wrapSvg(elements: List<SVGElement>, action: StringBuilder.(SVGElement) -> String) {

    // -- COMPUTE THE WIDTH AND HEIGHT OF THE SVG ELEMENT
    val width = elements.size * 150 / 2 // Each elements contains 2 SVG elements
    val height = 500

    // -- START OF SVG TAG
    appendLine("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"$width\" height=\"$height\">")

    // -- TRANSFORM THE ELEMENTS (typically you want to render them)

    elements.forEach { appendLine(action(it)) }


    // -- END OF SVG TAG
    append("</svg>")
}
