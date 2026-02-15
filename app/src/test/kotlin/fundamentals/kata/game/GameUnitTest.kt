package fundamentals.kata.game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class GameUnitTest {
    @Test
    fun `Given a base point when boosted then it should return the multiplied points`() {
        val basePoint = 10
        val boost = 5
        val expectedPoint = 50

        val points = Game.getPoints(basePoint, boost)

        assertEquals(expectedPoint, points)
    }

    @Test
    fun `Given level scores when calculating total score then it should return the sum`() {
        val lvl1Score = 20.0
        val lvl2Score = 35.0
        val lvl3Score = 25.0
        val expectedTotal = 80.0

        val total = Game.calculateTotalScore(lvl1Score, lvl2Score, lvl3Score)

        assertEquals(expectedTotal, total, 0.001)
    }

    @Test
    fun `Given level scores when finding highest score then it should return the maximum`() {
        val lvl1Score = 20.0
        val lvl2Score = 35.0
        val lvl3Score = 25.0
        val expectedHighest = 35.0

        val highest = Game.findHighestScore(lvl1Score, lvl2Score, lvl3Score)

        assertEquals(expectedHighest, highest, 0.001)
    }

    @Test
    fun `Given two players when player1 has higher score then player1 should win`() {
        val player1 = Player("Nicola", "Tesla")
        val player2 = Player("Thomas", "Edison")
        player1.totalScore = 80.0
        player2.totalScore = 65.0

        val winner = Game.determineWinner(player1, player2)

        assertEquals(player1, winner)
    }

    @Test
    fun `Given two players when player2 has higher score then player2 should win`() {
        val player1 = Player("Nicola", "Tesla")
        val player2 = Player("Thomas", "Edison")
        player1.totalScore = 60.0
        player2.totalScore = 75.0

        val winner = Game.determineWinner(player1, player2)

        assertEquals(player2, winner)
    }

    @Test
    fun `Given a winner when formatting message then it should return correct format`() {
        val winner = Player("Nicola", "Tesla")
        winner.totalScore = 80.0
        winner.highestScore = 35.0
        val expectedMessage = "Winner Nicola Tesla with a combined score of 80 and a personal level score of 35"

        val message = Game.formatWinnerMessage(winner)

        assertEquals(expectedMessage, message)
    }

    @Test
    fun `Given empty level scores when calculating total then it should return 0`() {
        val total = Game.calculateTotalScore()

        assertEquals(0.0, total, 0.001)
    }

    @Test
    fun `Given empty level scores when finding highest then it should return 0`() {
        val highest = Game.findHighestScore()

        assertEquals(0.0, highest, 0.001)
    }
}