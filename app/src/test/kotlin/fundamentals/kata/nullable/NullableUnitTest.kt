package fundamentals.kata.nullable

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertThrows

class NullableUnitTest {
    @Test
    fun `Given a nullable string when it is not null then it should return the correct value`() {
        val nullableString: String? = "Hello, World!"
        val expectedResult = "Hello, World!"
        
        assertEquals(expectedResult, nullableString)
    }

    @Test
    fun `Given a nullable string when it is null then it should return a null value without an exception`() {
        val nullableString: String? = null
        
        assertNull(nullableString)
    }

    @Test
    fun `Given a nullable message when forcing non-null access after assigning null then it should throw NPE`() {
        var message: String? = "Hello World"
        message = null

        assertThrows(NullPointerException::class.java) {
            val length = message!!.length
            length
        }
    }

    @Test
    fun `Given a nullable message when using safe call after assigning null then it should return null length`() {
        var message: String? = "Hello World"
        message = null

        val length = message?.length

        assertNull(length)
    }

    @Test
    fun `Given a nullable message string When it has an string Then it should return null and work property with safe call`() {
        val message: String? = "Hello World"
        val expectedLength = 11

        assertEquals(expectedLength, message?.length)
    }

    @Test
    fun `Given a nullable message string When it is null Then it should return null and work property with safe call`() {
        val message: String? = null

        assertNull(message?.length)
        assertNull(message?.uppercase())
    }
}