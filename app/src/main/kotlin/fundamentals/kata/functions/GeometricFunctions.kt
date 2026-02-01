package fundamentals.kata.functions

object GeometricFunctions {
    @JvmStatic
    fun triangleArea(width: Double, height: Double): Double {
        return width * height / 2
    }

    @JvmStatic
    fun triangleAreaUniqueExpression(width: Double, height: Double): Double = width * height / 2

}