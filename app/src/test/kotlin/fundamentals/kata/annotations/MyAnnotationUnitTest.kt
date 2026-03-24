package fundamentals.kata.annotations

import kotlin.reflect.full.findAnnotation
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MyAnnotationUnitTest {
    @Test
    fun `Given class A When checking annotation Then it should have MyAnnotation with correct description`() {
        // Obtener la anotación de la clase
        val classAnnotation = A::class.findAnnotation<MyAnnotation>()
        
        // Verificar que existe
        assertEquals("Class annotation", classAnnotation?.someDescription)
    }

    @Test
    fun `Given class A constructor property When checking annotation Then it should have MyAnnotation`() {
        // Acceder a las propiedades del constructor
        val constructorParam = A::class.constructors.first().parameters.first()
        val annotation = constructorParam.findAnnotation<MyAnnotation>()
        
        assertEquals("Constructor property annotation", annotation?.someDescription)
    }


    @Test
    fun `Given method b in class A When checking annotation Then it should have MyAnnotation`() {
        // Acceder a los métodos de la clase
        val methodB = A::class.members.first { it.name == "b" }
        val annotation = methodB.findAnnotation<MyAnnotation>()
        
        assertEquals("Method annotation", annotation?.someDescription)
    }

    @Test
    fun `Given all annotated elements When checking them Then all should have correct descriptions`() {
        val expectedAnnotations = mapOf(
            "class" to "Class annotation",
            "constructor property" to "Constructor property annotation",
            "method" to "Method annotation"
        )
        
        // Verificar clase
        assertEquals(
            expectedAnnotations["class"],
            A::class.findAnnotation<MyAnnotation>()?.someDescription
        )
        
        // Verificar propiedad del constructor
        assertEquals(
            expectedAnnotations["constructor property"],
            A::class.constructors.first().parameters.first()
                .findAnnotation<MyAnnotation>()?.someDescription
        )
        
        // Verificar método
        assertEquals(
            expectedAnnotations["method"],
            A::class.members.first { it.name == "b" }
                .findAnnotation<MyAnnotation>()?.someDescription
        )
    }
}