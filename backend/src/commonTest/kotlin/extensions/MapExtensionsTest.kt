package extensions

import kotlin.test.Test
import kotlin.test.assertEquals

class MapExtensionsTest {

    @Test
    fun toPrettyStringShouldReturnPrettyStringRepresentationOfMap() {
        // Arrange
        val map = mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3")
        val expected = "key1: value1\nkey2: value2\nkey3: value3"

        // Act
        val result = map.toPrettyString()

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun toPrettyStringShouldReturnEmptyStringForEmptyMap() {
        // Arrange
        val map = emptyMap<String, String>()
        val expected = ""

        // Act
        val result = map.toPrettyString()

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun toPrettyStringShouldHandleSpecialCharactersInKeysAndValues() {
        // Arrange
        val map = mapOf("key1" to "value1\n", "key2" to "value2\t", "key3" to "value3\"")
        val expected = "key1: value1\n\nkey2: value2\t\nkey3: value3\""

        // Act
        val result = map.toPrettyString()

        // Assert
        assertEquals(expected, result)
    }
}
