package extensions

import svg.models.SVGElement

const val SVG_WIDTH_FACTOR = 75
const val SVG_HEIGHT = 500

/**
 * Custom extension fn for the StringBuilder
 *
 * It wraps the SVG elements in the SVG tag after rendering them
 */
fun StringBuilder.wrapSvg(elements: List<SVGElement>, action: StringBuilder.(SVGElement) -> String) {

    // -- COMPUTE THE WIDTH AND HEIGHT OF THE SVG ELEMENT
    val width = elements.size * SVG_WIDTH_FACTOR


    // -- START OF SVG TAG
    appendLine("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"$width\" height=\"$SVG_HEIGHT\">")

    // -- TRANSFORM THE ELEMENTS (typically you want to render them)

    elements.forEach { appendLine(action(it)) }


    // -- END OF SVG TAG
    append("</svg>")
}
