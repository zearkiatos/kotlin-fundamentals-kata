package fundamentals.kata.functions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class GeometricFunctionsUnitTest {
    @Test
    fun `Given a height and width when the figure is a triangle then it should return the triangle's area`() {
        val height = 10.0
        val width = 5.0
        val expectedArea = 25.0

        val area = GeometricFunctions.triangleArea(width, height)

        assertEquals(expectedArea, area)
    }

    @Test
    fun `Given a height and width when the figure is a triangle then it should return the triangle's area with unique expression`() {
        val height = 10.0
        val width = 5.0
        val expectedArea = 25.0

        val area = GeometricFunctions.triangleAreaUniqueExpression(width, height)

        assertEquals(expectedArea, area)
    }
}