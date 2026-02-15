package fundamentals.kata.game

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class PlayerUnitTest {
    @Test
    fun `Given a Player when call the function fullname then it should return the fullname`() {
        val name = "Pedro"
        val lastname = "Capriles"
        val expectedValue = "$name $lastname"

        val player = Player(name, lastname)

        assertEquals(player.fullname(), expectedValue)
    }

    @Test
    fun `Given a Player when created then totalScore should be initialized to 0_0`() {
        val player = Player("Pedro", "Capriles")

        assertEquals(0.0, player.totalScore, 0.001)
    }

    @Test
    fun `Given a Player when created then highestScore should be initialized to 0_0`() {
        val player = Player("Pedro", "Capriles")

        assertEquals(0.0, player.highestScore, 0.001)
    }

    @Test
    fun `Given a Player when totalScore is updated then it should store the new value`() {
        val player = Player("Pedro", "Capriles")
        val newScore = 150.5

        player.totalScore = newScore

        assertEquals(newScore, player.totalScore, 0.001)
    }

    @Test
    fun `Given a Player when highestScore is updated then it should store the new value`() {
        val player = Player("Pedro", "Capriles")
        val newScore = 99.9

        player.highestScore = newScore

        assertEquals(newScore, player.highestScore, 0.001)
    }
}