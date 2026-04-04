package kotlinfundamentals.kata.smartCast

class SmartCast {
    fun consume(a: Any) {
        if (a is String) {
            println(a.length)
        }
        if (a is Int) {
            println(a * 10)
        }
    }

    fun consumeNullableString(a: String?) {
        if (a != null) {
            println(a.length)
        } else {
            println("The string is null")
        }
    }

    fun consumeA(a: String?) {
        if (a == null || a.length == 0) return
        println(a.length)
    }
}