package fundamentals.kata.functions

object CompareFunctions {
    @JvmStatic
    fun biggerOf(firstNumber: Int, secondNumber: Int): Int {
        return if (firstNumber > secondNumber) firstNumber else secondNumber
    }

    @JvmStatic
    fun biggerOfUniqueExpression(firstNumber: Int, secondNumber: Int): Int = if (firstNumber > secondNumber) firstNumber else secondNumber

}