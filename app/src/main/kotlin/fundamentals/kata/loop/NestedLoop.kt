package fundamentals.kata.loop

object NestedLoop {
    @JvmStatic
    fun triangleForLoopNested() {
        for (i in 1..5) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    @JvmStatic
    fun triangleWithHeightParameter(height: Int) {
        for (i in 1..height) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    @JvmStatic
    fun downToTriangleForLoopNested() {
        for (i in 5 downTo 1) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    @JvmStatic
    fun starForLoopNestedWithWidthPattern(width: Int) {
        for (i in 1..width step 2) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
        for (i in width - 2 downTo 1 step 2) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    @JvmStatic
    fun triangleInverseForLoopNested() {
        for (i in 5 downTo 1) {
            for (j in 1..5) {
                if (j >= i) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }

    @JvmStatic
    fun triangleIsosceles(height: Int) {
        for (i in 1..height) {
            for (j in 1..(height - i)) {
                print(" ")
            }
            for (j in 1..(2 * i - 1)) {
                print("*")
            }
            println()
        }
    }
}
