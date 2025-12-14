package fundamentals.kata.score

object Score {
    @JvmStatic
    fun totalScore(vararg scores: Int): Int {
        return scores.sum()
    }

    @JvmStatic
    fun averageScore(vararg scores: Int): Double {
        return scores.takeIf { it.isNotEmpty() }?.average() ?: 0.0
    }

    @JvmStatic
    fun showTotalScore(vararg scores: Int) {
        val total = totalScore(*scores)
        println(total)
    }

    @JvmStatic
    fun showAverageScore(vararg scores: Int) {
        val average = averageScore(*scores)
        println(average)
    }

    @JvmStatic
    fun scoreBoost(vararg scores: Int, boostMultiplier: Int): Int {
        val total = totalScore(*scores)
        return total * boostMultiplier
    }

        @JvmStatic
    fun scoreBoost(totalScore: Int, boostMultiplier: Int): Int {
        return totalScore * boostMultiplier
    }

    @JvmStatic
    fun showBoostedScore(vararg scores: Int, boostMultiplier: Int) {
        val boostedScore = scoreBoost(*scores, boostMultiplier = boostMultiplier)
        println(boostedScore)
    }

    @JvmStatic
    fun finalBoostedScore(vararg scores: Int, boostMultiplier: Int): Int {
        val total = totalScore(*scores)
        val boost = scoreBoost(total, boostMultiplier)

        return boost + total
    }

    @JvmStatic
    fun showFinalBoostedScore(vararg scores: Int, boostMultiplier: Int) {
        val finalBoostedScore = finalBoostedScore(*scores, boostMultiplier = boostMultiplier)
        println(finalBoostedScore)
    }
}