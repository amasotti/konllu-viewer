package svg

import kotlin.test.Test
import kotlin.test.assertEquals

class SVGPathTest {

    @Test
    fun testSvgLineInitialization() {
        val svgPath = SVGPath(
            id = "e0",
            end = 0,
            headpos = 0,
            rel = Pair("q", "q"),
            dist = 0,
            lvl = 0
        )
        assertEquals("e0", svgPath.id)
        assertEquals(0, svgPath.end)
        assertEquals(0, svgPath.headpos)
        assertEquals(Pair("q", "q"), svgPath.rel)
        assertEquals(0, svgPath.dist)
        assertEquals(0, svgPath.lvl)
    }

    @Test
    fun testLineRenderingWithHeadPosZero() {
        val svgPath = SVGPath(
            id = "e0",
            end = 0,
            headpos = 0,
            rel = Pair("q", "q"),
            dist = 0,
            lvl = 0
        )
        assertEquals(
            """
            <path class="eq0 q0q0" d="M0 0 L0 80" />
        """.trimIndent(), svgPath.render()
        )
    }

    @Test
    fun testRenderPathWithHeadPosNonZero() {
        val svgPath = SVGPath(
            id = "e0",
            end = 0,
            headpos = 1,
            rel = Pair("q", "q"),
            dist = 0,
            lvl = 0
        )

        assertEquals(
            """
            <path
            class="eq0 eq1 q0q1" 
            d="M0 0 L0 80 C0 0 0 0 0 0 0 0 C0 0 0 0 0 80 0 0" 
            />
            """.trimIndent(), svgPath.render()
        )
    }
}
