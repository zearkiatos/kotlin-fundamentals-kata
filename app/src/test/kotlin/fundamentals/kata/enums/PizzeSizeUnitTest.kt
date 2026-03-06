package fundamentals.kata.enums

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PizzaSizeUnitTest {
    @Test
    fun `Given a PizzaSize when SMALL then it should return SMALL`() {
        val expectedValue = PizzaSize.SMALL

        val pizzaSize = PizzaSize.SMALL

        assertEquals(expectedValue, pizzaSize)
    }

    @Test
    fun `Given a PizzaSize when MEDIUM then it should return MEDIUM`() {
        val expectedValue = PizzaSize.MEDIUM

        val pizzaSize = PizzaSize.MEDIUM

        assertEquals(expectedValue, pizzaSize)
    }

    @Test
    fun `Given a PizzaSize when LARGE then it should return LARGE`() {
        val expectedValue = PizzaSize.LARGE
        
        val pizzaSize = PizzaSize.LARGE

        assertEquals(expectedValue, pizzaSize)
    }

    @Test
    fun `Given a PizzaSize when EXTRALARGE then it should return EXTRALARGE`() {
        val expectedValue = PizzaSize.EXTRALARGE
        
        val pizzaSize = PizzaSize.EXTRALARGE

        assertEquals(expectedValue, pizzaSize)
    }
}