package svg

data class SVGPath(
    val id: String,
    val end: Int,
    val headpos: Int,
    val rel: Pair<String, String>,
    val dist: Int,
    val lvl: Int
): SVGElement {

    override fun render(): String {
        val x1 = 0
        val x2 = 0
        val y1 = 0
        val y2 = 0
        val edgeDrop = 80

        return if (headpos == 0) {
            """
             <path class="e${rel.first}${end} q${end}q${headpos}" d="M${x1} ${y1} L${x1} ${y2 + edgeDrop}" />
            """.trimIndent()
        } else {
            """
            <path
            class="e${rel.first}${end} e${rel.second}${headpos} q${end}q${headpos}" 
            d="M${x1} ${y1} L${x1} ${y2 + edgeDrop} C${x1} ${y2} ${x1} ${y2} ${(x1 + x2) / 2} ${y2} ${x2} ${y2} C${x2} ${y2} ${x2} ${y2} ${x2} ${y2 + edgeDrop} ${x2} ${y1}" 
            />
            """.trimIndent()

        }
    }
}
