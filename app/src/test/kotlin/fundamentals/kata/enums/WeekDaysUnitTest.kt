package fundamentals.kata.enums

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class WeekDaysUnitTest {
    @Test
    fun `Given a WeekDay when SUNDAY then it should return SUNDAY`() {
        val expectedValue = WeekDay.SUNDAY

        val weekDay = WeekDay.SUNDAY

        assertEquals(expectedValue, weekDay)
    }

    @Test
    fun `Given a WeekDay when MONDAY then it should return MONDAY`() {
        val expectedValue = WeekDay.MONDAY

        val weekDay = WeekDay.MONDAY

        assertEquals(expectedValue, weekDay)
    }


    @Test
    fun `Given a WeekDay when TUESDAY then it should return TUESDAY`() {
        val expectedValue = WeekDay.TUESDAY
        
        val weekDay = WeekDay.TUESDAY

        assertEquals(expectedValue, weekDay)
    }

    @Test
    fun `Given a WeekDay when WEDNESDAY then it should return WEDNESDAY`() {
        val expectedValue = WeekDay.WEDNESDAY
        
        val weekDay = WeekDay.WEDNESDAY

        assertEquals(expectedValue, weekDay)
    }

    @Test
    fun `Given a WeekDay when THURSDAY then it should return THURSDAY`() {
        val expectedValue = WeekDay.THURSDAY
        
        val weekDay = WeekDay.THURSDAY

        assertEquals(expectedValue, weekDay)
    }
    
    @Test
    fun `Given a WeekDay when FRIDAY then it should return FRIDAY`() {
        val expectedValue = WeekDay.FRIDAY
        
        val weekDay = WeekDay.FRIDAY

        assertEquals(expectedValue, weekDay)
    }

    @Test
    fun `Given a WeekDay when SATURDAY then it should return SATURDAY`() {
        val expectedValue = WeekDay.SATURDAY
        
        val weekDay = WeekDay.SATURDAY

        assertEquals(expectedValue, weekDay)
    }
}