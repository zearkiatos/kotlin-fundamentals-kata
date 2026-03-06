package fundamentals.kata.enums

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class DifficultyUnitTest {
    @Test
    fun `Given a Difficulty when EASY then it should return EASY`() {
        val expectedValue = Difficulty.EASY

        val difficulty = Difficulty.EASY

        assertEquals(expectedValue, difficulty)
    }

    @Test
    fun `Given a Difficulty when MEDIUM then it should return MEDIUM`() {
        val expectedValue = Difficulty.MEDIUM

        val difficulty = Difficulty.MEDIUM

        assertEquals(expectedValue, difficulty)
    }

    @Test
    fun `Given a Difficulty when HIGH then it should return HIGH`() {
        val expectedValue = Difficulty.HIGH
        
        val difficulty = Difficulty.HIGH

        assertEquals(expectedValue, difficulty)
    }

    @Test
    fun `Given Difficulty values when calling values() then it should return all difficulty levels`() {
        val expectedValues = arrayOf(Difficulty.EASY, Difficulty.MEDIUM, Difficulty.HIGH)

        val difficulties = Difficulty.values()

        assertEquals(expectedValues.size, difficulties.size)
        assertEquals(expectedValues[0], difficulties[0])
        assertEquals(expectedValues[1], difficulties[1])
        assertEquals(expectedValues[2], difficulties[2])
    }

    @Test
    fun `Given Difficulty when calling valueOf with EASY then it should return EASY`() {
        val expectedValue = Difficulty.EASY

        val difficulty = Difficulty.valueOf("EASY")

        assertEquals(expectedValue, difficulty)
    }

    @Test
    fun `Given Difficulty when calling valueOf with MEDIUM then it should return MEDIUM`() {
        val expectedValue = Difficulty.MEDIUM

        val difficulty = Difficulty.valueOf("MEDIUM")

        assertEquals(expectedValue, difficulty)
    }

    @Test
    fun `Given Difficulty when calling valueOf with HIGH then it should return HIGH`() {
        val expectedValue = Difficulty.HIGH

        val difficulty = Difficulty.valueOf("HIGH")

        assertEquals(expectedValue, difficulty)
    }
}
