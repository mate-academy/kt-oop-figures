package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.Color
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.Circle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        const val MIN_SIZE = 1.0
        const val MAX_SIZE = 10.0
        const val DEFAULT_RADIUS = 10.0
        const val FIGURE_TYPES_COUNT = 5

        const val SQUARE_INDEX = 0
        const val RECTANGLE_INDEX = 1
        const val CIRCLE_INDEX = 2
        const val RIGHT_TRIANGLE_INDEX = 3
        const val ISOSCELES_TRAPEZOID_INDEX = 4

        val DEFAULT_COLOR = Color.WHITE
    }

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE_INDEX -> Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            RECTANGLE_INDEX -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            CIRCLE_INDEX -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            RIGHT_TRIANGLE_INDEX -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            ISOSCELES_TRAPEZOID_INDEX -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE)
            )
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
    }
}
