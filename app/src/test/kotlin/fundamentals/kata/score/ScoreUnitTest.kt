package fundamentals.kata.score

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import fundamentals.kata.score.Score

class ScoreUnitTest {
    @Test
    fun `Given score when there are three scores then it should calculate the total score`() {
        val scoreLevel1 = 79
        val scoreLevel2 = 92
        val scoreLevel3 = 86
        val expectedTotalScore = 257

        val totalScore = Score.totalScore(scoreLevel1, scoreLevel2, scoreLevel3)

        assertEquals(expectedTotalScore, totalScore)
    }

    @Test
    fun `Given score when there are three scores then it should calculate the average score`() {
        val scoreLevel1 = 79
        val scoreLevel2 = 92
        val scoreLevel3 = 86
        val expectedAverageScore = 85.66666666666667

        val averageScore = Score.averageScore(scoreLevel1, scoreLevel2, scoreLevel3)

        assertEquals(expectedAverageScore, averageScore)
    }

    @Test
    fun `Given score when there are three scores then it should show total and average scores`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val scoreLevel1 = 79
        val scoreLevel2 = 92
        val scoreLevel3 = 86
        val expectedAverageScore = 85.66666666666667
        val expectedTotalScore = 257
        System.setOut(PrintStream(outputStream))

        Score.showTotalScore(scoreLevel1, scoreLevel2, scoreLevel3)
        Score.showAverageScore(scoreLevel1, scoreLevel2, scoreLevel3)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedTotalScore.toString()))
        assertTrue(output.contains(expectedAverageScore.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a score when there is a bootsmultiplier with four value then it sould return a final boosted score`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val scoreLevel1 = 79
        val scoreLevel2 = 92
        val scoreLevel3 = 86
        val expectedScoreBoost = 1028
        val expectedFinalScore = 1285
        System.setOut(PrintStream(outputStream))

        Score.showBoostedScore(scoreLevel1, scoreLevel2, scoreLevel3, boostMultiplier = 4)
        Score.showFinalBoostedScore(scoreLevel1, scoreLevel2, scoreLevel3, boostMultiplier = 4)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedScoreBoost.toString()))
        assertTrue(output.contains(expectedFinalScore.toString()))
        System.setOut(originalOut)
    }
}