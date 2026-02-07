package fundamentals.kata.recursion

import kotlin.math.ceil

object Recursion {
    @JvmStatic
    fun factorial(number: Int): Int {
        var accumulator = 1
        
        for(i in 1..number) {
            accumulator = accumulator * i
        }

        return accumulator
    }
}