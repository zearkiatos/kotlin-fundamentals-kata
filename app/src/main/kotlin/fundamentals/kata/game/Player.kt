package fundamentals.kata.game

class Player(
    val name: String,
    val lastname: String
) {
    var totalScore: Double = 0.0
    var highestScore: Double = 0.0

    fun fullname(): String {
        return "$name $lastname"
    }
}