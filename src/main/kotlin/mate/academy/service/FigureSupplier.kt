package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        private const val MAX_RANDOM_VALUE = 10.0
        private const val MIN_RANDOM_VALUE = 1.0
        private const val DEFAULT_CIRCLE_RADIUS = 10.0
        private const val NUM_FIGURE_TYPES = 5
    }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(NUM_FIGURE_TYPES)) {
            0 -> Square(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            1 -> Rectangle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                           Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            2 -> RightTriangle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                               Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            3 -> Circle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            else -> IsoscelesTrapezoid(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                                       Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                                       Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
}
