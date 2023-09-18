package svg

import kotlin.test.Test
import kotlin.test.assertEquals

class SVGPathTest {

    @Test
    fun testSvgLineInitialization() {
        val svgPath = SVGPath(
            id = "e0",
            headpos = 0,
            startX = 0,
            endX = 0,
            startY = 0,
            endY = 0,
            controlOffset = 0,
            cssClass = "q0q0"
        )
        assertEquals("e0", svgPath.id)
        assertEquals(0, svgPath.headpos)
        assertEquals(0, svgPath.startX)
        assertEquals(0, svgPath.endX)
        assertEquals(0, svgPath.startY)
        assertEquals(0, svgPath.endY)
        assertEquals(0, svgPath.controlOffset)
        assertEquals("q0q0", svgPath.cssClass)
    }

    @Test
    fun testLineRenderingWithHeadPosZero() {
        val svgPath = SVGPath(
            id = "e0",
            headpos = 0,
            startX = 0,
            endX = 0,
            startY = 0,
            endY = 0,
            controlOffset = 0,
            cssClass = "q0q0"
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
            headpos = 1,
            startX = 0,
            endX = 0,
            startY = 0,
            endY = 0,
            controlOffset = 0,
            cssClass = "q0q0"
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
