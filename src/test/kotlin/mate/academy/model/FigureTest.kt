package mate.academy.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.PI

class FigureTest {

    @Test
    fun squareArea_ShouldReturnCorrectValue() {
        val square = Square(5.0, Color.BLUE)
        assertEquals(25.0, square.getArea(), 0.0001)
    }

    @Test
    fun rectangleArea_ShouldReturnCorrectValue() {
        val rect = Rectangle(4.0, 6.0, Color.GREEN)
        assertEquals(24.0, rect.getArea(), 0.0001)
    }

    @Test
    fun rightTriangleArea_ShouldReturnCorrectValue() {
        val triangle = RightTriangle(8.0, 4.0, Color.BLACK)
        assertEquals(16.0, triangle.getArea(), 0.0001)
    }

    @Test
    fun circleArea_ShouldReturnCorrectValue() {
        val circle = Circle(3.0, Color.YELLOW)
        assertEquals(PI * 9, circle.getArea(), 0.0001)
    }

    @Test
    fun trapezoidArea_ShouldReturnCorrectValue() {
        val trapezoid = IsoscelesTrapezoid(4.0, 6.0, 5.0, Color.WHITE)
        assertEquals(25.0, trapezoid.getArea(), 0.0001)
    }
}
