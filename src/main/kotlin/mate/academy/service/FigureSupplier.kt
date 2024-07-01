package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val CIRCLE = 0
private const val ISOSCELES_TRAPEZOID = 1
private const val RECTANGLE = 2
private const val RIGHT_TRIANGLE = 3
private const val SQUARE = 4
private const val FIGURE_COUNT = 5
private const val DEFAULT_RADIUS = 10
private const val LIMIT = 50

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val randomColor = ColorSupplier().getRandomColor()
        return when (Random.nextInt(FIGURE_COUNT)) {
            CIRCLE -> Circle(randomColor, getRandomInt())
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(randomColor, getRandomInt(), getRandomInt(), getRandomInt())
            RECTANGLE -> Rectangle(randomColor, getRandomInt(), getRandomInt())
            RIGHT_TRIANGLE -> RightTriangle(randomColor, getRandomInt(), getRandomInt())
            SQUARE -> Square(randomColor, getRandomInt())
            else -> throw IllegalArgumentException("Invalid supplied random figure")
        }
    }

    fun getDefaultFigure(): Figure = Circle(radius = DEFAULT_RADIUS)

    private fun getRandomInt() = Random.nextInt(LIMIT)
}
