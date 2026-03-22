package fundamentals.kata.sealedClasses

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue


class SealedClassesUnitTest {
    @Test
    fun `Given a role When it is a CEO Then it should return The boss`() {
        val role = "ceo"
        val name = "John Doe"
        val expectedLabel = "The boss"

        val label = constructLabel(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a manager Then it should return the manager and its name`() {
        val role = "manager"
        val name = "John Doe"
        val expectedLabel = "Manager $name"

        val label = constructLabel(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a worker Then it should return just the worker's name`() {
        val role = "worker"
        val name = "John Doe"
        val expectedLabel = "John Doe"

        val label = constructLabel(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is an unknown role Then it should return Unknown role`() {
        val role = "unknown"
        val name = "John Doe"
        val expectedLabel = "Unknown role"

        val label = constructLabel(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a CEO Then it should return The boss with enum`() {
        val role = Role.CEO
        val name = "John Doe"
        val expectedLabel = "The boss"

        val label = constructLabelWithEnum(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a manager Then it should return the manager and its name with enum`() {
        val role = Role.MANAGER
        val name = "John Doe"
        val expectedLabel = "Manager $name"

        val label = constructLabelWithEnum(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a worker Then it should return just the worker's name with enum`() {
        val role = Role.WORKER
        val name = "John Doe"
        val expectedLabel = "John Doe"

        val label = constructLabelWithEnum(role, name)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a CEO Then it should return The boss with sealed`() {
        val role = CeoRole()
        val expectedLabel = "The boss"

        val label = constructLabelWithSealed(role)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a manager Then it should return the manager and its name with sealed`() {
        val role = ManagerRole("John Doe")
        val expectedLabel = "Manager John Doe"

        val label = constructLabelWithSealed(role)

        assertEquals(expectedLabel, label)
    }

    @Test
    fun `Given a role When it is a worker Then it should return just the worker's name with sealed`() {
        val role = WorkerRole("John Doe")
        val expectedLabel = "John Doe"

        val label = constructLabelWithSealed(role)

        assertEquals(expectedLabel, label)
    }
}