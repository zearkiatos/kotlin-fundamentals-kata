package fundamentals.kata.game

object Game {
    @JvmStatic
    fun getPoints(basePoint: Int, boost: Int): Int {
        return basePoint * boost
    }

    @JvmStatic
    fun calculateTotalScore(vararg lvlScores: Double): Double {
        return lvlScores.sum()
    }

    @JvmStatic
    fun findHighestScore(vararg lvlScores: Double): Double {
        return lvlScores.maxOrNull() ?: 0.0
    }

    @JvmStatic
    fun determineWinner(player1: Player, player2: Player): Player {
        return if (player1.totalScore > player2.totalScore) player1 else player2
    }

    @JvmStatic
    fun formatWinnerMessage(winner: Player): String {
        return "Winner ${winner.fullname()} with a combined score of ${winner.totalScore.toInt()} and a personal level score of ${winner.highestScore.toInt()}"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // Create two players
        val player1 = Player("Nicola", "Tesla")
        val player2 = Player("Thomas", "Edison")

        // Level scores for player1
        val player1Lvl1Score = 20.0
        val player1Lvl2Score = 35.0
        val player1Lvl3Score = 25.0

        // Level scores for player2
        val player2Lvl1Score = 15.0
        val player2Lvl2Score = 30.0
        val player2Lvl3Score = 20.0

        // Calculate total scores
        player1.totalScore = calculateTotalScore(player1Lvl1Score, player1Lvl2Score, player1Lvl3Score)
        player2.totalScore = calculateTotalScore(player2Lvl1Score, player2Lvl2Score, player2Lvl3Score)

        // Find highest score for each player
        player1.highestScore = findHighestScore(player1Lvl1Score, player1Lvl2Score, player1Lvl3Score)
        player2.highestScore = findHighestScore(player2Lvl1Score, player2Lvl2Score, player2Lvl3Score)

        // Determine winner
        val winner = determineWinner(player1, player2)

        // Print result
        println(formatWinnerMessage(winner))
    }
}
