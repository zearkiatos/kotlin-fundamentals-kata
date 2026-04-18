package fundamentals.kata.lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull

class MapOfUnitTest {
    @Test
    fun `Given a mapOf When it is called Then it should return a map of elements`() {
        val map =  mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
        val expectedElement = "Washington"
        val expectedSize = 3

        assertEquals(map.size, expectedSize)
        assertEquals(expectedElement, map["USA"])
    }

    @Test
    fun `Given a mapOf When it is declare with specific type value and type for key Then it should return a map of elements`() {
        val map: Map<String, String> =  mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
        val alphabet:Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
        val expectedElement = "Washington"
        val expectedSize = 3
        val expectedAlphabetElement = 1


        assertEquals(map.size, expectedSize)
        assertEquals(expectedElement, map["USA"])
        assertEquals(alphabet.size, expectedSize)
        assertEquals(expectedAlphabetElement, alphabet['A'])
    }

    @Test
    fun `Given a mapOf When it is join with another with plus symbol Then it should return a new map with a new set of elements`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")
        val expectedSize = 2
        val map2 = mapOf('C' to "Celina")
        val newExpectedSize = 3
        val expectedElement = "Celina"

        assertEquals(map.size, expectedSize)
        val newMap = map + map2

        assertEquals(newMap.size, newExpectedSize)
        assertEquals(expectedElement, newMap['C'])
    }

    @Test
    fun `Given a mapOf When it is join with another with plus symbol with a same key Then it should edit the old key value`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")
        val expectedSize = 2
        val map2 = mapOf('B' to "Celina")
        val newExpectedSize = 2
        val expectedElement = "Celina"

        assertEquals(map.size, expectedSize)
        val newMap = map + map2

        assertEquals(newMap.size, newExpectedSize)
        assertEquals(expectedElement, newMap['B'])
    }

    @Test
    fun `Given a mapOf When it is join with another with minus symbol with a same key Then it should remove the key and value`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")
        val expectedSize = 2
        val newExpectedSize = 1

        assertEquals(map.size, expectedSize)
        val newMap = map - 'B'

        assertEquals(newMap.size, newExpectedSize)
        assertNull(newMap['B'])
    }

    @Test
    fun `Given a mapOf When it is search a key with in Then it should return true it is present`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")

        assertTrue('A' in map)
    }

    @Test
    fun `Given a mapOf When it is search a key with in Then it should return false it is present`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")

        assertFalse('C' in map)
    }

    @Test
    fun `Given a mapOf When it is iterate with for Then it should return a value and key`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")
        val expectedKeys = listOf('A', 'B')
        val expectedValues = listOf("Alex", "Bob")
        var index = 0
        for (entry in map) {
            assertEquals(expectedKeys[index], entry.key)
            assertEquals(expectedValues[index], entry.value)
            index++
        }
    }

    @Test
    fun `Given a mapOf When it is iterate with for Then it should return a value and key with a destructuring`() {
        val map = mapOf('A' to "Alex", 'B' to "Bob")
        val expectedKeys = listOf('A', 'B')
        val expectedValues = listOf("Alex", "Bob")
        var index = 0
        for ((key, value) in map) {
            assertEquals(expectedKeys[index], key)
            assertEquals(expectedValues[index], value)
            index++
        }
    }

    @Test
    fun `Given a mutableMap When it is call with put Then it should add a new key and value pair`() {
        val map = mutableMapOf('A' to "Alex", 'B' to "Bob")
        val expectedSize = 2
        val expectedElement = "Celina"
        assertEquals(map.size, expectedSize)

        map.put('C', expectedElement)

        assertEquals(map.size, expectedSize + 1)
        assertEquals(expectedElement, map['C'])
    }

    @Test
    fun `Given a mutableMap When it is call with remove Then it should remove the key and value`() {
        val map = mutableMapOf('A' to "Alex", 'B' to "Bob")
        val expectedSize = 2
        assertEquals(map.size, expectedSize)

        map.remove('B')

        assertEquals(map.size, expectedSize - 1)
        assertNull(map['B'])
    }
}