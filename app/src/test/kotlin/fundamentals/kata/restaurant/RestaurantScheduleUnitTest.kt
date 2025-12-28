package fundamentals.kata.restaurant

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import fundamentals.kata.restaurant.RestaurantSchedule

class RestaurantScheduleUnitTest {
    @Test
    fun `Given a day of the week when asking if the restaurant is open then return it should return if the restaurant is open and the schedule`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "On Friday, the opening hours are:"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isRestaurantOpen("Friday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is monday then it should print 8 AM to 12 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 12 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Monday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is tuesday then it should print 8 AM to 6 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Tuesday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }


    @Test
    fun `Given a day of the week when it is Wednesday then it should print 8 AM to 6 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Wednesday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Thursday then it should print 8 AM to 6 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Thursday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Friday then it should print 8 AM to 9 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 9 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Friday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Saturday then it should print 9 AM to 4 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "9 AM to 4 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Saturday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Sunday then it should print 8 AM to 4 PM`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 4 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Sunday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is a bad string then it should print invalid day`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Invalid day"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithIf("Fakeday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is monday then it should print 8 AM to 12 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 12 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Monday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is tuesday then it should print 8 AM to 6 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Tuesday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Wednesday then it should print 8 AM to 6 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Wednesday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Thursday then it should print 8 AM to 6 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 6 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Thursday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Friday then it should print 8 AM to 9 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 9 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Friday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Saturday then it should print 9 AM to 4 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "9 AM to 4 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Saturday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is Sunday then it should print 8 AM to 4 PM with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "8 AM to 4 PM"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Sunday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day of the week when it is a bad string then it should print invalid day with when`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Invalid day"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.getScheduleByDayWithWhen("Fakeday")
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Monday and hour is between 8 and 12 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Monday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Monday and hour is outside 8 and 12 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Monday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Tuesday and hour is between 8 and 18 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Tuesday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Tuesday and hour is outside 8 and 18 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Tuesday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Wednesday and hour is between 8 and 18 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Wednesday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Wednesday and hour is outside 8 and 18 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Wednesday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Thursday and hour is between 8 and 18 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Thursday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Thursday and hour is outside 8 and 18 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Thursday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Friday and hour is between 8 and 21 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Friday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Friday and hour is outside 8 and 21 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Friday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Saturday and hour is between 9 and 16 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Saturday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Saturday and hour is outside 9 and 16 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Saturday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Sunday and hour is between 8 and 16 then it should print Little Lemon is open now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "Little Lemon is open now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Sunday", 10)
        val output = outputStream.toString()
        
        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }

    @Test
    fun `Given a day and hour when it is Sunday and hour is outside 8 and 16 then it should print The restaurant is closed now`() {
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        val expectedResult = "The restaurant is closed now"
        System.setOut(PrintStream(outputStream))

        RestaurantSchedule.isLittleLemonOpen("Sunday", 7)
        val output = outputStream.toString()

        assertTrue(output.contains(expectedResult.toString()))
        System.setOut(originalOut)
    }





}