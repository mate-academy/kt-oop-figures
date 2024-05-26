package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        private const val RANDOM_MIN = 1
        private const val RANDOM_MAX = 6
        private const val MIN_SIDE_LENGTH = 1.0
        private const val MAX_SIDE_LENGTH = 10.0
        private const val DEFAULT_RADIUS = 10.0
        private const val RANDOM_ONE = 1
        private const val RANDOM_TWO = 2
        private const val RANDOM_THREE = 3
        private const val RANDOM_FOUR = 4

    }

    fun getRandomFigure(): Figure {
        val random = Random.nextInt(RANDOM_MIN, RANDOM_MAX)
        val color = colorSupplier.getRandomColor()
        return when (random) {
            RANDOM_ONE -> Square(Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH), color)
            RANDOM_TWO -> Rectangle(Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH),
                Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH), color)
            RANDOM_THREE -> RightTriangle(Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH),
                Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH), color)
            RANDOM_FOUR -> Circle(Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH), color)
            else -> IsoscelesTrapezoid(Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH),
                Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH),
                Random.nextDouble(MIN_SIDE_LENGTH, MAX_SIDE_LENGTH), color)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
