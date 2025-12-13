package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val FIGURE_TYPES_COUNT = 5
private const val MIN_SIZE = 1.0
private const val MAX_SIZE = 20.0
private const val DEFAULT_RADIUS = 10.0

private const val SQUARE = 0
private const val RECTANGLE = 1
private const val TRIANGLE = 2
private const val CIRCLE = 3

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE -> Square(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            RECTANGLE -> Rectangle(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            TRIANGLE -> RightTriangle(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            CIRCLE -> Circle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            else -> IsoscelesTrapezoid(
                color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
