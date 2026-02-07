package fundamentals.kata.score

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import fundamentals.kata.recursion.Recursion

class RecursionUnitTest {
    @Test
    fun `Given a number when it is an integer thet it should return the factorial`() {
        val number = 5
        val expectedFactorial = 120

        val factorial = Recursion.factorial(number)

        assertEquals(expectedFactorial, factorial)
    }
}