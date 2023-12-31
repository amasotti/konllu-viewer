package svg.models

/**
 * The SVGPath element is used to draw lines and curves, connecting the [SVGRect]
 */
data class SVGPath(
    val id: String,
    val cssClass: String = "",
    val headpos: Int,
    val startX: Int,
    val endX: Int,
    val startY: Int,
    val endY: Int,
    val controlOffset: Int = 80
): SVGElement {

    override fun render(): String {
        return when {
            headpos <= 0 -> renderRootPath()
            else -> renderNormalPath()
        }
    }

    private fun renderNormalPath(): String =     """
            <path 
            id="$id"
            d="M$startX $startY 
            L$startX $controlOffset 
            L$endX $controlOffset
            L$endX $endY"
            style="stroke: $DEFAULT_STROKE_COLOR; stroke-width: $DEFAULT_STROKE_WIDTH; fill: $DEFAULT_FILL_COLOR;" />
        """.trimIndent()

    private fun renderRootPath(): String =
            """
        <path 
        id="$id" 
        class="$cssClass" 
        d="M$startX $startY L$startX $endY" 
        style="stroke: $DEFAULT_STROKE_COLOR; stroke-width: $DEFAULT_STROKE_WIDTH; fill: $DEFAULT_FILL_COLOR;" />
        """.trimIndent()
}
