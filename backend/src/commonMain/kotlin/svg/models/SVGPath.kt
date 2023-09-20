package svg.models

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

        /**
         * Paths are rendered as Bezier curves
         * M startX startY C startX (startY + controlPointOffset) endX (endY + controlPointOffset) endX endY
         *
         * M (metà lunghezza rettangolo di partenza)
         * (y di partenza rettangolo di partenza)
         *
         * C - tree paia di coordinate
         *
         * Primo punto di controllo
         * (x come su, metà del lunghezza del rettangolo di partenza) = creerà la curva ad angolo retto
         * (y a tua scelta, più è alto, più bassa sarà la parabola)
         *
         * Secondo punto di controllo
         * (x del punto di arrivo, se vogliamo restare ad angolo retto)
         * (se vogliamo una parabola quadrateggiante, la stessa del primo punto di controllo, vale la stessa regola)
         *
         * Punto di arrivo
         * (metà lunghezza del rettangonolo di arrivo)
         * (stesso y di partenza)
         *
         * -----------------------------------------------------
         * Curva di Bezier a 4 punti di controllo
         * -----------------------------------------------------
         * M startX startY = rettangolo di partenza
         * L startX, (a tua scelta ma più è alto il valore, prima curverà la curva)
         * C (due valori simili o uguali) (x di arrivo, un valore a tua scelta) (x di arrivo, un valore a tua scelta)
         * L endX endY = rettangonolo di arrivo
         *
         *
         */
        return if (headpos == 0) {
            """
        <path id="$id" class="$cssClass" d="M$startX $startY L$startX ${startY + controlOffset}" style="stroke: black; stroke-width: 1px; fill: transparent;" />
        """.trimIndent()
        } else {
            """
            <path 
            d="M$startX $startY 
            L$startX $controlOffset 
            L$endX $controlOffset
            L$endX $endY"
            style="stroke: black; stroke-width: 1px; fill: transparent;" />
        """.trimIndent()
        }
    }
}
