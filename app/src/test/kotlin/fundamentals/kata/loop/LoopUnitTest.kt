package fundamentals.kata.loop

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class LoopUnitTest {
    @Test
    fun `Given a inverseTriangleWithLoop when it is called then it should print a triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*****\n ****\n  ***\n   **\n    *\n"
        System.setOut(PrintStream(outputStream))

        Loop.inverseTriangleWithLoop()
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleWithAWhiteSpaceLoop when it is called then it should print a triangle pattern with white spaces`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*****\n\n ****\n\n  ***\n\n   **\n\n    *\n\n"
        System.setOut(PrintStream(outputStream))

        Loop.triangleWithAWhiteSpaceLoop(2)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleMirrorWithLoop when it is called then it should print a mirror triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*\n**\n***\n****\n*****\n****\n***\n**\n*\n"
        System.setOut(PrintStream(outputStream))

        Loop.triangleMirrorWithLoop(9)
        val output = outputStream.toString()
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleMirrorWithLoop when it is called with a pair param then it should print a mirror triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*\n**\n***\n***\n**\n*\n"
        System.setOut(PrintStream(outputStream))

        Loop.triangleMirrorWithLoop(6)
        val output = outputStream.toString()
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

        
}