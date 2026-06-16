package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Circle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Color
import kotlin.random.Random

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    private fun randomSize(): Double {

        return Random.nextDouble(MIN_SIZE, MAX_SIZE)
    }

    fun getRandomFigure(): Figure {

        val color = colorSupplier.getRandomColor()

        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE -> Square(color, randomSize())
            RECTANGLE -> Rectangle(color, randomSize(), randomSize())
            RIGHT_TRIANGLE -> RightTriangle(color, randomSize(), randomSize())
            CIRCLE -> Circle(color, randomSize())
            else -> IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize())
        }
    }

    fun getDefaultFigure(): Figure {

        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    private companion object {
        const val MIN_SIZE = 1.0
        const val MAX_SIZE = 10.0

        const val FIGURE_TYPES_COUNT = 5

        const val SQUARE = 0
        const val RECTANGLE = 1
        const val RIGHT_TRIANGLE = 2
        const val CIRCLE = 3

        const val DEFAULT_RADIUS = 10.0
    }
}
