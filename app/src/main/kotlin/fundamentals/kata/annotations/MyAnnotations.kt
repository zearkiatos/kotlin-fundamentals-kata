package fundamentals.kata.annotations

annotation class MyAnnotation(val someDescription: String)

@MyAnnotation("Class annotation")
class A(
    @MyAnnotation("Constructor property annotation")
val a: Int
) {
    @MyAnnotation("Method annotation")
    fun b() {}
}
