package fundamentals.kata.enums

enum class PizzaSizeWithCentimeters(
val sizeInCm: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSizeWithCentimeters) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}