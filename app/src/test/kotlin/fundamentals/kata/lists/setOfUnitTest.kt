package fundamentals.kata.lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.collections.setOf

class SetOfUnitTest {
    @Test
    fun `Given a setOf list When it is instance with three values Then it should save the information with specific order`() {
        val setList = setOf("A", "B", "C")
        val expectedElement = "A"

        assertEquals(setList.size, setList.size)
        assertTrue(setList.contains(expectedElement))
    }

    @Test
    fun `Given a setOf list with an specific type When it is instance with three element Then it should be evaluate the type`() {
        val setListChar: Set<Char> = setOf('A', 'B', 'C')
        val setListLong: Set<Long> = setOf(1L, 2L, 3L)

        assertTrue(setListChar.toList()[0] is Char)
        assertTrue(setListLong.toList()[0] is Long)
    }

    @Test
    fun `Given a setOf list When it is joining an element with plus symbol Then it should add an element`() {
        var setList = setOf("A", "B")
        
        assertEquals(setList.size, 2)

        setList = setList + "C"
        setList = setList + setOf("C", "D")
        setList = setOf("Z") + setList

        assertEquals(setList.size, 5)
    }

    @Test
    fun `Given a setOf list When it is evaluate the content Then it should return the size and if it is empty or not`() {
        var setListEmpty = setOf<Int>()
        var setList = setOf('A', 'B', 'C')

        assertEquals(setListEmpty.size, 0)
        assertTrue(setListEmpty.isEmpty())
        assertEquals(setList.size, 3)
        assertFalse(setList.isEmpty())
    }

    @Test
    fun `Given a setOf list When it is instance with a repeated element Then it should ignore this element`() {
        var setList = setOf('A', 'B', 'A')

        assertEquals(setList.size, 2)
        assertTrue(setList.contains('A'))
        assertTrue(setList.contains('B'))
        assertTrue('A' in setList)
        assertTrue('B' in setList)
    }

    @Test
    fun `Given a setOf list Whet it is tour it with for loop Then it should return all elements`() {
        val setList = setOf('A', 'B', 'C')
        val expectedList = listOf('A', 'B', 'C')
        var index = 0

        for (element in setList) {
            assertEquals(element, expectedList[index])
            index++
        }
    }

    @Test
    fun `Given a mutable setOf list When it is called with add a new element Then it should add a new element`() {
        val setList = mutableSetOf('A', 'B')
        val expectedElement = 'C'

        assertEquals(setList.size, 2)

        setList.add(expectedElement)

        assertEquals(setList.size, 3)
        assertTrue(setList.contains(expectedElement))
    }

    @Test
    fun `Given a mutable setOf list When it is called with remove a new element Then it should remove the element`() {
        val setList = mutableSetOf('A', 'B')
        val expectedElement = 'A'

        assertEquals(setList.size, 2)

        setList.remove(expectedElement)

        assertEquals(setList.size, 1)
        assertFalse(setList.contains(expectedElement))
    }
}