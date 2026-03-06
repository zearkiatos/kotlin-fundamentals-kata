package fundamentals.kata.enums

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PizzaShopUnitTest {

    private fun captureOutput(action: () -> Unit): String {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        return try {
            action()
            outputStream.toString().trim()
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun `Given pizza sizes with centimeters when reading values then each size has expected centimeters`() {
        val expected = mapOf(
            PizzaSizeWithCentimeters.SMALL to 15,
            PizzaSizeWithCentimeters.MEDIUM to 20,
            PizzaSizeWithCentimeters.LARGE to 25,
            PizzaSizeWithCentimeters.EXTRALARGE to 30
        )

        val result = PizzaSizeWithCentimeters.entries.associateWith { it.sizeInCm }

        assertEquals(expected, result)
    }

    @Test
    fun `Given SMALL size when printing then output should match size in centimeters`() {
        val result = captureOutput {
            printSize(PizzaSizeWithCentimeters.SMALL)
        }

        assertEquals("SMALL is 15 cm", result)
    }

    @Test
    fun `Given MEDIUM size when printing then output should match size in centimeters`() {
        val result = captureOutput {
            printSize(PizzaSizeWithCentimeters.MEDIUM)
        }

        assertEquals("MEDIUM is 20 cm", result)
    }

    @Test
    fun `Given LARGE size when printing then output should match size in centimeters`() {
        val result = captureOutput {
            printSize(PizzaSizeWithCentimeters.LARGE)
        }

        assertEquals("LARGE is 25 cm", result)
    }

    @Test
    fun `Given EXTRALARGE size when printing then output should match size in centimeters`() {
        val result = captureOutput {
            printSize(PizzaSizeWithCentimeters.EXTRALARGE)
        }

        assertEquals("EXTRALARGE is 30 cm", result)
    }
}
