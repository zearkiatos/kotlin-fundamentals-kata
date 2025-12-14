package fundamentals.kata.math

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class MathOperatorsUnitTest {
    @Test
    fun `Given three numbers when sum number 1 and number 2 and multiply the third number then return the correct result`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val number1 = 123
        val number2 = 456
        val number3 = 789
        val expectedResult = 359907
        System.setOut(PrintStream(outputStream))
        val result = number1 + number2 * number3
        
        println(result)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a long math operation without parenthesis when sum and multiply nine numbers then return the correct result`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = 141
        
        System.setOut(PrintStream(outputStream))
        val result = 1+2*3+4*5+6*7+8*9
        
        println(result)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a long math operation with parenthesis when sum and multiply nine numbers then return the correct result`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = 839
        
        System.setOut(PrintStream(outputStream))
        val result = (1+2)*3+4*5+6*(7+8)*9
        
        println(result)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a two decimals when they divide then return the correct result`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val divided = 13530.0
        val divisor = 1.23
        val expectedResult = 11000
        
        System.setOut(PrintStream(outputStream))
        val result = divided / divisor
        
        println(result)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }
    
}