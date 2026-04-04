package kotlinfundamentals.kata.smartCast

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class SmartCastUnitTest {
    @Test
    fun `Given a consume When it is a String Then print its length`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: Any = "ABC"
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consume(consume)
        val output = outputStream.toString()
        
        assertTrue(output.contains("3"))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a consume When it is a int Then print the result of the number per ten`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: Any = 10
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consume(consume)
        val output = outputStream.toString()
        
        assertTrue(output.contains("100"))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a consumeNullableString When it is a String Then print its length`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: String? = "ABC"
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consumeNullableString(consume)
        val output = outputStream.toString()
        
        assertTrue(output.contains("3"))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a consumeNullableString When it is null Then print The string is null`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: String? = null
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consumeNullableString(consume)
        val output = outputStream.toString()
        
        assertTrue(output.contains("The string is null"))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a consumeA When it is null Then it should not print anything`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: String? = null
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consumeA(consume)
        val output = outputStream.toString()

        assertFalse(output.contains("The string is null"))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a consumeA When it is a string Then it should print the string length`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val consume: String? = "Hello"
        System.setOut(PrintStream(outputStream))
        val smartCast = SmartCast()

        smartCast.consumeA(consume)
        val output = outputStream.toString()

        assertTrue(output.contains("5"))
        System.setOut(originalOut)
    }
}