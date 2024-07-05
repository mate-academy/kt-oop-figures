package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.figures.Circle
import mate.academy.model.figures.IsoscelesTrapezoid
import mate.academy.model.figures.Rectangle
import mate.academy.model.figures.RightTriangle
import mate.academy.model.figures.Square
import kotlin.random.Random

private const val RANGE = 100.0
private const val DEFAULT_RADIUS = 10.0
private const val FIGURES_AMOUNT = 5
private const val CIRCLE_INDEX = 0
private const val ISOSCELES_TRAPEZOID_INDEX = 1
private const val RECTANGLE_INDEX = 2
private const val RIGHT_TRIANGLE_INDEX = 3
private const val SQUARE_INDEX = 4

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomFigureIndex = Random.nextInt(FIGURES_AMOUNT)
        return when (randomFigureIndex) {
            CIRCLE_INDEX -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            )

            ISOSCELES_TRAPEZOID_INDEX -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE),
                Random.nextDouble(RANGE)
            )

            RECTANGLE_INDEX -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE),
                Random.nextDouble(RANGE)
            )

            RIGHT_TRIANGLE_INDEX -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            )

            SQUARE_INDEX -> Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            )

            else -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
