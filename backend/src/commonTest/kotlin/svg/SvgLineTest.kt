package svg

import kotlin.test.Test
import kotlin.test.assertEquals

class SvgLineTest {

    @Test
    fun testSvgLineInitialization() {
        val svgPath = SVGPath(0, 0, 100, 100)
        assertEquals(0, svgPath.x1)
        assertEquals(0, svgPath.y1)
        assertEquals(100, svgPath.x2)
        assertEquals(100, svgPath.y2)
    }

    @Test
    fun testLineRendering() {
        val svgPath = SVGPath(0, 0, 100, 100)
        assertEquals(
            """
            <path d="M0 0 L100 100" stroke="black" stroke-width="3" fill="none" />
        """.trimIndent(), svgPath.render()
        )
    }
}
