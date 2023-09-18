package svg

data class SVGRect(val x: Int, val y: Int, val width: Int, val height: Int, val text: String) : SVGElement {
    override fun render(): String {
        return """
            <rect 
                x="$x" 
                y="$y" 
                width="$width" 
                height="$height" 
                fill="#98FF98" 
                stroke="black" 
                stroke-width="1" 
            />
        """.trimIndent()
    }
}
