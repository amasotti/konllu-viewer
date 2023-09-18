package svg

data class SVGPath(val x1: Int, val y1: Int, val x2: Int, val y2: Int) : SVGElement {
    override fun render(): String {
        val d = "M$x1 $y1 L$x2 $y2"
        return """<path d="$d" stroke="black" stroke-width="3" fill="none" />"""
    }
}
