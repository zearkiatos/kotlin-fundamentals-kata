package fundamentals.kata.loop

import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class NestedLoopUnitTest {
    @Test
    fun `Given a triangleForLoopNested when it is called then it should print a triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*\n**\n***\n****\n*****\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.triangleForLoopNested()
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleWithHeightParameter when it is called then it should print a triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.triangleWithHeightParameter(10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a downToTriangleForLoopNested when it is called then it should print a triangle pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*****\n****\n***\n**\n*\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.downToTriangleForLoopNested()
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a startForLoopNested when it is called then it should print a star pattern`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "*\n***\n*****\n***\n*\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.starForLoopNestedWithWidthPattern(5)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleInverseForLoopNested when it is called then it should print a trianle`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "    *\n   **\n  ***\n ****\n*****\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.triangleInverseForLoopNested()
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a triangleIsosceles when it is called then it should print an isosceles triangle`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "    *\n   ***\n  *****\n *******\n*********\n"
        System.setOut(PrintStream(outputStream))

        NestedLoop.triangleIsosceles(5)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }


}