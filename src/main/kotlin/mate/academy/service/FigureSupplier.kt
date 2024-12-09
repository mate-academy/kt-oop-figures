package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import mate.academy.model.Rectangle
import kotlin.random.Random

class FigureSupplier(private val colorProvider: ColorProvider) {
    companion object {
        private const val RANDOM_FIGURE_TYPES = 5
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_CIRCLE_RADIUS = 10.0
        private const val SQUARE_INDEX = 0
        private const val RECTANGLE_INDEX = 1
        private const val RIGHT_TRIANGLE_INDEX = 2
        private const val CIRCLE_INDEX = 3
    }

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(RANDOM_FIGURE_TYPES)) {
            SQUARE_INDEX -> Square(Random.nextDouble(
                MIN_SIZE, MAX_SIZE), colorProvider)
            RECTANGLE_INDEX -> Rectangle(Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE), colorProvider)
            RIGHT_TRIANGLE_INDEX -> RightTriangle(Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE), colorProvider)
            CIRCLE_INDEX -> Circle(Random.nextDouble(MIN_SIZE, MAX_SIZE), colorProvider)
            else -> IsoscelesTrapezoid(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorProvider
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_CIRCLE_RADIUS, FixedColorProvider(Color.WHITE))
    }
}
