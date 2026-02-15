package fundamentals.kata.game

class Scores {
    fun whichIsBetter(best: Double, current: Double): Double {
        return if (best < current) {
            return current
        } else {
            return best
        }

    }
}