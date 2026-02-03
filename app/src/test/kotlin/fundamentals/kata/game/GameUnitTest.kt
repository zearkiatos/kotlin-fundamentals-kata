package fundamentals.kata.game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class GameUnitTest {
    @Test
    fun `Given a base point when boosted then it should return the multiplied points`() {
        val basePoint = 10
        val boost = 5
        val expectedPoint = 50

        val points = Game.getPoints(basePoint, boost)

        assertEquals(expectedPoint, points)
    }
}