package svg.models

data class SVGText(val text: String, val x: Int, val y: Int, val cssClass: String = "") : SVGElement {

    override fun render(): String {
        return """
            <text 
                x="$x" 
                y="$y" 
                class="$cssClass"
                fill="black" 
                stroke-width="1" 
            >$text</text>
        """.trimIndent()
    }
}
