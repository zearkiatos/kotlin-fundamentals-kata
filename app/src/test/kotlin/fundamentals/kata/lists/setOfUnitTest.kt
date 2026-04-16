package fundamentals.kata.lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals

class SetOfUnitTest {
    @Test
    fun `Given a setOf list When it is instance with three values Then it should save the information with specific order`() {
        val setList = setOf("A", "B", "C")
        val expectedElement = "A"

        assertEquals(setList.size, setList.size)
        assertTrue(setList.contains(expectedElement))
    }
}