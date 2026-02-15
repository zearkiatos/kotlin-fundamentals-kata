package fundamentals.kata.game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ScoresUnitTest {
    @Test
    fun `Given current and best scores when current is better than best then it should return current scores`() {
        val scores = Scores()
        val best = 100.0
        val current = 150.0

        val result = scores.whichIsBetter(best, current)

        assertEquals(current, result)
    }

        @Test
    fun `Given current and best scores when best is better than current then it should return best scores`() {
        val scores = Scores()
        val best = 150.0
        val current = 100.0

        val result = scores.whichIsBetter(best, current)

        assertEquals(best, result)
    }
}