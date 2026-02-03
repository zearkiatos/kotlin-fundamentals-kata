package fundamentals.kata.game

object Game {
    @JvmStatic
    fun getPoints(basePoint: Int, boost: Int): Int {
        return basePoint * boost
    }
}
