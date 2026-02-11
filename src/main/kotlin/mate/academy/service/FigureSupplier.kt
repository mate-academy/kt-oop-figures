package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIGURE_COUNT = 5
const val FROM = 1.0
const val TO = 10.0
const val FROM_TRAPEZOID = 5.0
const val TO_TRAPEZOID = 15.5
const val DEFAULT_RADIUS = 10.0
const val CIRCLE_INDEX = 0
const val RECTANGLE_INDEX = 1
const val RIGHT_TRIANGLE_INDEX = 2
const val SQUARE_INDEX = 3

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(FIGURE_COUNT)) {
            CIRCLE_INDEX -> Circle(Random.nextDouble(FROM, TO), color)
            RECTANGLE_INDEX -> Rectangle(color, Random.nextDouble(FROM, TO), Random.nextDouble(FROM, TO))
            RIGHT_TRIANGLE_INDEX -> RightTriangle(color, Random.nextDouble(FROM, TO), Random.nextDouble(FROM, TO))
            SQUARE_INDEX -> Square(color, Random.nextDouble(FROM, TO))
            else -> IsoscelesTrapezoid(
                color,
                Random.nextDouble(FROM, TO),
                Random.nextDouble(FROM_TRAPEZOID, TO_TRAPEZOID),
                Random.nextDouble(FROM, TO)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
