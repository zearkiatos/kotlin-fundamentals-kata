package fundamentals.kata.functions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class DefaultArgumentsUnitTest {
    @Test
    fun `Given a web when it is opened without any incognito configuration then it should open in normal mode by default`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val url = "www.google.com"
        val expectedResult = "Opening $url"
        System.setOut(PrintStream(outputStream))

        DefaultArguments.openBrowser(url)

        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a web when it is opened with incognito configuration then it should open as incognito`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val url = "www.google.com"
        val expectedResult = "Opening $url in incognito mode"
        System.setOut(PrintStream(outputStream))

        DefaultArguments.openBrowser(url, true)

        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }
}