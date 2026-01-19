package fundamentals.kata.loop

import kotlin.math.ceil

object Loop {
    @JvmStatic
    fun inverseTriangleWithLoop() {
        for (i in 1..5) {
            val numberOfSpaces = i - 1
            for (j in 1..numberOfSpaces) {
                print(" ")
            }
            val numberOfStars = 6 - i
            for (k in 1..numberOfStars) {
                print("*")
            }
            println()
        }
    }

    @JvmStatic
    fun triangleWithAWhiteSpaceLoop(numberOfLine: Int) {
           for (i in 1..5) {
            val numberOfSpaces = i - 1
            for (j in 1..numberOfSpaces) {
                print(" ")
            }
            val numberOfStars = 6 - i
            for (k in 1..numberOfStars) {
                print("*")
            }
            for (y in 1..numberOfLine) {
                println()
            }
        }
    }

   @JvmStatic
    fun triangleMirrorWithLoop(numberOfLine: Int) {
        val middle = ceil(numberOfLine / 2.0).toInt()
        for (line in 1..numberOfLine) {
            if (line <= middle) {
                for (star in 1..line) {
                    print("*")
                }
            }
            else {
                val starsInLine = numberOfLine - line + 1
                for (star in 1..starsInLine) {
                    print("*")
                }
            }
            println()
        }
    }
}