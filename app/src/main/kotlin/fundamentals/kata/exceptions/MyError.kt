package fundamentals.kata.exceptions

class MyError: Throwable("Some Message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun executionSomeFunction() {
    try {
        someFunction()
        println("Will not be printed")
    } catch (e: Throwable) {
        println("Caught ${e}")
    }
}