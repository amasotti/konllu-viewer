package svg.models

/**
 * A text element is a SVGElement that represents a text element
 * and is used to print text either inside a [SVGRect] or on the [SVGPath]
 */
data class SVGText(val text: String, val x: Int, val y: Int, val cssClass: String = "") : SVGElement {

    override fun render(): String {
        return """
            <text 
                x="$x" 
                y="$y" 
                class="$cssClass"
                fill="$DEFAULT_STROKE_COLOR" 
                stroke-width="$DEFAULT_STROKE_WIDTH" 
            >$text</text>
        """.trimIndent()
    }
}
