package fundamentals.kata.functions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CompareFunctionsUnitTest {
    @Test
    fun `Given two numbers when the first is bigger than the second one then it should return the first one`() {
        val firstNumber = 10
        val secondNumber = 5

        val biggerNumber = CompareFunctions.biggerOf(firstNumber, secondNumber)

        assertEquals(firstNumber, biggerNumber)
    }

    @Test
    fun `Given two numbers when the second is bigger than the first one then it should return the second one`() {
        val firstNumber = 5
        val secondNumber = 10
        
        val biggerNumber = CompareFunctions.biggerOf(firstNumber, secondNumber)

        assertEquals(secondNumber, biggerNumber)
    }

    @Test
    fun `Given two numbers when the first is bigger than the second one then it should return the first one with unit expression`() {
        val firstNumber = 10
        val secondNumber = 5

        val biggerNumber = CompareFunctions.biggerOfUniqueExpression(firstNumber, secondNumber)
        
        assertEquals(firstNumber, biggerNumber)
    }

    @Test
    fun `Given two numbers when the second is bigger than the first one then it should return the second one with unit expression`() {
        val firstNumber = 5
        val secondNumber = 10
        
        val biggerNumber = CompareFunctions.biggerOfUniqueExpression(firstNumber, secondNumber)
        
        assertEquals(secondNumber, biggerNumber)
    }

}
