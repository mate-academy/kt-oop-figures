package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import java.lang.IllegalArgumentException
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier = ColorSupplier()) {
    companion object {
        private const val DEFAULT_RADIUS = 10.0
        private const val MIN_RANDOM_VALUE = 1.0
        private const val MAX_RANDOM_VALUE = 10.0
        private const val FIGURE_TYPES_COUNT = 5
        private const val SQUARE_INDEX = 0
        private const val RECTANGLE_INDEX = 1
        private const val RIGHT_TRIANGLE_INDEX = 2
        private const val CIRCLE_INDEX = 3
        private const val ISOSCELES_TRAPEZOID_INDEX = 4
    }

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE_INDEX -> Square(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            RECTANGLE_INDEX -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            RIGHT_TRIANGLE_INDEX -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            CIRCLE_INDEX -> Circle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            ISOSCELES_TRAPEZOID_INDEX -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            else -> throw IllegalArgumentException("Unknown figure type")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
