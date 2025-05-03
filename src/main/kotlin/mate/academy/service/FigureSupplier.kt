package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val DEFAULT_RADIUS = 10
private const val LIMIT = 50

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val randomColor = ColorSupplier().getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(randomColor, getRandomInt())
            FigureType.SQUARE -> Square(randomColor, getRandomInt())
            FigureType.RECTANGLE -> Rectangle(randomColor, getRandomInt(), getRandomInt())
            FigureType.RIGHT_TRIANGLE -> RightTriangle(randomColor, getRandomInt(), getRandomInt())
            FigureType.ISOSCELES_TRAPEZOID ->
                IsoscelesTrapezoid(randomColor, getRandomInt(), getRandomInt(), getRandomInt())
        }
    }

    fun getDefaultFigure(): Figure = Circle(radius = DEFAULT_RADIUS)

    private fun getRandomInt() = Random.nextInt(LIMIT)

    private enum class FigureType {
        CIRCLE,
        ISOSCELES_TRAPEZOID,
        RIGHT_TRIANGLE,
        RECTANGLE,
        SQUARE
    }
}
