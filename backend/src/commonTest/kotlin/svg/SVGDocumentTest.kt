package svg

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SVGDocumentTest {

    @Test
    fun testAddElementWhenElementAddedThenSizeIncreases() {
        // Arrange
        val svgDocument = SVGDocument()
        val svgElement = FakeSVGElement()

        // Act
        svgDocument.addElement(svgElement)

        // Assert
        assertEquals(1, svgDocument.elements.size)
    }


    @Test
    fun testRemoveElementFromDocument() {
        // Arrange
        val svgDocument = SVGDocument()
        val svgElement = FakeSVGElement()
        svgDocument.addElement(svgElement)

        // Act
        svgDocument.removeElement(svgElement)

        // Assert
        assertEquals(0, svgDocument.elements.size)
    }

    @Test
    fun testRenderWholeDocumentWithWrapFunction() {
        // Arrange
        val svgDocument = SVGDocument()
        val svgElement = FakeSVGElement()
        svgDocument.addElement(svgElement)

        // Act
        val result = svgDocument.render()

        // Assert
        assertTrue(result.contains("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">"))
        assertTrue(result.contains("</svg>"))
        assertTrue(result.contains("<fake-element />"))
        assertEquals(3, result.lines().size)
    }

}
