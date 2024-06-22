package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_COLOR = "WHITE"
const val DEFAULT_RADIUS = 10.0
const val MAX_RANDOM_VALUE = 10.0
const val FIGURE_COUNT = 5
const val CIRCLE_INDEX = 0
const val SQUARE_INDEX = 1
const val RECTANGLE_INDEX = 2
const val RIGHT_TRIANGLE_INDEX = 3
const val ISOSCELES_TRAPEZOID_INDEX = 4

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_COUNT)) {
            CIRCLE_INDEX -> Circle(colorSupplier.getRandomColor(), getNonZeroValue())
            SQUARE_INDEX -> Square(colorSupplier.getRandomColor(), getNonZeroValue())
            RECTANGLE_INDEX -> Rectangle(colorSupplier.getRandomColor(), getNonZeroValue(), getNonZeroValue())
            RIGHT_TRIANGLE_INDEX -> RightTriangle(colorSupplier.getRandomColor(), getNonZeroValue(), getNonZeroValue())
            ISOSCELES_TRAPEZOID_INDEX -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getNonZeroValue(),
                getNonZeroValue(),
                getNonZeroValue()
            )

            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.valueOf(DEFAULT_COLOR), DEFAULT_RADIUS)
    }

    private fun getNonZeroValue(): Double {
        return Random.nextDouble(MAX_RANDOM_VALUE) + 1
    }
}
