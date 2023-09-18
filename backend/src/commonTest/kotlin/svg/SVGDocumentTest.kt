package svg

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SVGDocumentTest {

    @Test
    fun testAddElementWhenElementAddedThenSizeIncreases() {
        // Arrange
        val svgBlock = SVGBlock()
        val svgElement = FakeSVGElement()

        // Act
        svgBlock.addElement(svgElement)

        // Assert
        assertEquals(1, svgBlock.elements.size)
    }


    @Test
    fun testRemoveElementFromDocument() {
        // Arrange
        val svgBlock = SVGBlock()
        val svgElement = FakeSVGElement()
        svgBlock.addElement(svgElement)

        // Act
        svgBlock.removeElement(svgElement)

        // Assert
        assertEquals(0, svgBlock.elements.size)
    }

    @Test
    fun testRenderWholeDocumentWithWrapFunction() {
        // Arrange
        val svgBlock = SVGBlock()
        val svgElement = FakeSVGElement()
        svgBlock.addElement(svgElement)

        // Act
        val result = svgBlock.render()

        // Assert
        assertTrue(result.contains("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">"))
        assertTrue(result.contains("</svg>"))
        assertTrue(result.contains("<fake-element />"))
        assertEquals(3, result.lines().size)
    }

}
