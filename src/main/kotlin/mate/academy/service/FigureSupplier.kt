package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    companion object {
        private const val FIGURE_TYPES_COUNT = 5
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_RADIUS = 10.0

        private const val SQUARE = 0
        private const val RECTANGLE = 1
        private const val RIGHT_TRIANGLE = 2
        private const val CIRCLE = 3
    }

    private fun randomSize() = Random.nextDouble(MIN_SIZE, MAX_SIZE)

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE -> Square(color, randomSize())
            RECTANGLE -> Rectangle(
                color,
                randomSize(),
                randomSize()
            )
            RIGHT_TRIANGLE -> RightTriangle(
                color,
                randomSize(),
                randomSize()
            )
            CIRCLE -> Circle(color, randomSize())
            else -> IsoscelesTrapezoid(
                color,
                randomSize(),
                randomSize(),
                randomSize()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
