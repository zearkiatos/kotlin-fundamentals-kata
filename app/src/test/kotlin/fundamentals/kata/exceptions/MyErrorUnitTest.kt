package fundamentals.kata.exceptions

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MyErrorUnitTest {
    @Test
    fun `Given someFunction when it called then it should throw an exception`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Some Message"
        System.setOut(PrintStream(outputStream))

        try {
            executionSomeFunction()
        } finally {
            val output = outputStream.toString()
            assertTrue(output.contains(expectedResult))
            System.setOut(originalOut)
        }
    }
}
