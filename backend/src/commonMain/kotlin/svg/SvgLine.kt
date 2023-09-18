package svg

data class SVGLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) : SVGElement {
    override fun render(): String {
        return "<line " +
                "x1=\"$x1\" " +
                "y1=\"$y1\" " +
                "x2=\"$x2\" " +
                "y2=\"$y2\" " +
                "stroke=\"black\" " +
                "stroke-width=\"3\" " +
                "/>"
    }
}
