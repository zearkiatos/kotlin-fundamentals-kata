package fundamentals.kata.sealedClasses

sealed class Result

class Success(val data:String) : Result()

class Failure(val exception: Throwable): Result()

fun constructLabel(role: String, name: String): String {
    return when (role) {
        "ceo" -> "The boss"
        "manager" -> "Manager $name"
        "worker" -> name
        else -> "Unknown role"
    }
}

enum class Role {
    CEO,
    MANAGER,
    WORKER
}

fun constructLabelWithEnum(role: Role, name: String): String {
    return when (role) {
        Role.CEO -> "The boss"
        Role.MANAGER -> "Manager $name"
        Role.WORKER -> name
    }
}

sealed class WorkRole
class CeoRole(): WorkRole()
class ManagerRole(val name: String): WorkRole()
class WorkerRole(val name: String): WorkRole()

fun constructLabelWithSealed(role: WorkRole): String {
    return when (role) {
        is CeoRole -> "The boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}