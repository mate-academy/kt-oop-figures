package mate.academy.service

import mate.academy.figures.Circle
import mate.academy.figures.Square
import mate.academy.figures.Rectangle
import mate.academy.figures.IsoscelesTrapezoid
import mate.academy.figures.RightTriangle
import mate.academy.model.Figure
import mate.academy.model.Color
import kotlin.random.Random

private const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    private enum class FigureType { SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        val type = FigureType.values().random()

        fun randomValue() = Random.nextDouble(from = 1.0, until = 10.0)

        return when (type) {
            FigureType.SQUARE -> Square(randomValue(), color)
            FigureType.RECTANGLE -> Rectangle(randomValue(), randomValue(), color)
            FigureType.RIGHT_TRIANGLE -> RightTriangle(randomValue(), randomValue(), color)
            FigureType.CIRCLE -> Circle(randomValue(), color)
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(randomValue(), randomValue(), randomValue(), color)
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_RADIUS, Color.WHITE)
}
