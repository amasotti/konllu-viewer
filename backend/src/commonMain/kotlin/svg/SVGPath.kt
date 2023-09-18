package svg

data class SVGPath(
    val id: String,
    val end: Int,
    val headpos: Int,
    val rel: Pair<String, String>,
    val dist: Int,
    val lvl: Int
): SVGElement {

    // Relationship between the two nodes
    private var x1 = 0
    private var x2 = 0
    private var y1 = 0
    private var y2 = 0
    private var edgeDrop = 80

    fun setRelations(
        x1: Int = 0,
        x2: Int = 0,
        y1: Int = 0,
        y2: Int = 0,
        edgeDrop: Int = 0) {
        this.x1 = x1
        this.x2 = x2
        this.y1 = y1
        this.y2 = y2
        this.edgeDrop = edgeDrop
    }

    override fun render(): String {

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
