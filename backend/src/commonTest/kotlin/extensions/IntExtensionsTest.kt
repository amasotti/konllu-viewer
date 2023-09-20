package extensions

import kotlin.test.Test
import kotlin.test.assertEquals

class IntExtensionsTest {
        @Test
        fun halfShouldReturnHalfOfTheNumber() {
            assertEquals(5, 10.half())
        }

        @Test
        fun halfShouldReturnHalfOfNegativeNumber() {
            assertEquals(-5, (-10).half())
        }

        @Test
        fun halfOfZeroIsZero() {
            assertEquals(0, 0.half())
        }
}
