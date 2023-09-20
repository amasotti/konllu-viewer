package svg.models

const val RECT_FILL_COLOR = "#98FF98"

/**
 * The SVGRect class represents a rectangle that will be rendered
 * containing each a token with some text
 */
data class SVGRect(val x: Int, val y: Int, val width: Int, val height: Int, val text: String) : SVGElement {
    override fun render(): String {
        return """
            <rect 
                x="$x" 
                y="$y" 
                width="$width" 
                height="$height" 
                fill="$RECT_FILL_COLOR" 
                stroke="$DEFAULT_STROKE_COLOR" 
                stroke-width="$DEFAULT_STROKE_WIDTH" 
            />
        """.trimIndent()
    }
}
