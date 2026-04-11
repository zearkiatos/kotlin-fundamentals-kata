package fundamentals.kata.lists

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertEquals

class ListOfUnitTest {
    @Test
    fun `Given a listOf When it is called Then it should return a list of elements`() {
        val list = listOf("A", "B", "C")
        val expectedElement = "A"

        assertEquals(list.size, list.size)
        assertEquals(expectedElement, list[0])
    }

    @Test
    fun `Given a listOf When it is use with plus symbol Then it should add a new element`() {
        val list = listOf("A", "B")
        val expectedElement = "C"
        val currentExpectedSize = 2

        assertEquals(list.size, currentExpectedSize)

        val newList = list + "C"

        assertEquals(newList.size, currentExpectedSize + 1)
        assertEquals(expectedElement, newList[2])
    }

    @Test
    fun `Given an empty listOf When it is call with isEmpty Then it should return true`() {
        val list = listOf<String>()

        assertTrue(list.isEmpty())
    }

    @Test
    fun `Given an empty set list When it is call with isEmpty Then it should return true`() {
        val setList = setOf<String>()

        assertTrue(setList.isEmpty())
    }

    @Test
    fun `Given a list When it calls with contains Then it should return true if the elemenet exists`() {
        val list = listOf("A", "B", "C")

        assertTrue(list.contains("A"))
    }

    @Test
    fun `Given a list When it calls with contains an the element doesn't exist Then it should return false`() {
        val list = listOf("A", "B", "C")

        assertFalse(list.contains("D"))
    }

    @Test
    fun `Given a list When it use in to ask for an element that it doesn't exist Then it should return false`() {
        val list = listOf("A", "B", "C")

        assertFalse("D" in list)
    }

    @Test
    fun `Given a list When it use in to ask for an element with a negation that it exists Then it should return false`() {
        val list = listOf("A", "B", "C")

        assertFalse("A" !in list)
    }


    @Test
    fun `Given a list When it is called with a for cycle Then it should iterate over all elements`() {
        val elements = listOf("A", "B", "C")
        val expectedElements = listOf("A", "B", "C")
        var count = 0

        for (element in elements) {
            assertEquals(element, expectedElements[count])
            count++
        }
    }

    @Test
    fun `Given a mutable list When it adds an element Then it should be part of the list`() {
        val elements = mutableListOf("A", "B", "C")
        val newElementExpected = "D"

        elements.add(newElementExpected)

        assertTrue(elements.contains(newElementExpected))
    }

    @Test
    fun `Given a mutable list When it removes an element Then it should not be part of the list`() {
        val elements = mutableListOf("A", "B", "C")
        val elementToRemove = "B"

        elements.remove(elementToRemove)

        assertFalse(elements.contains(elementToRemove))
    }

    @Test
    fun `Given a mutable list When it changes an element from a specific index Then it should be updated`() {
        val elements = mutableListOf("A", "B", "C")
        val newElement = "Z"

        elements[1] = newElement

        assertTrue(elements.contains(newElement))
        assertEquals(newElement, elements[1])
    }

    
}