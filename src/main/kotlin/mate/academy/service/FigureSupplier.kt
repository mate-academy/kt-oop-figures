package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

enum class FigureType {
    SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID
}

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        private const val MAX_RANDOM_VALUE = 10.0
        private const val MIN_RANDOM_VALUE = 1.0
        private const val DEFAULT_CIRCLE_RADIUS = 10.0
        private val DEFAULT_COLOR = Color.WHITE
    }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            FigureType.RECTANGLE -> Rectangle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            FigureType.RIGHT_TRIANGLE -> RightTriangle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            FigureType.CIRCLE -> Circle(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(color, Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE))
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS)
}
