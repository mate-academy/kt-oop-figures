package mate.academy.service

import mate.academy.model.Color
import mate.academy.Circle
import mate.academy.Figure
import mate.academy.IsoscelesTrapezoid
import mate.academy.Rectangle
import mate.academy.RightTriangle
import mate.academy.Square
import kotlin.random.Random

// Constants for random dimension range
const val MIN_RANDOM_DIMENSION = 1
const val MAX_RANDOM_DIMENSION = 10
const val NUM_FIGURE_TYPES = 5
const val VALUE_CIRCLE_RADIUS = 10.0
const val VALUE_IN_RANDOM_FOUR = 4
const val VALUE_IN_RANDOM_THREE = 3
val DIMENSION_RANGE = MIN_RANDOM_DIMENSION..MAX_RANDOM_DIMENSION  // Use 'val' instead of 'const'

class FigureSupplier {

    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        return when (Random.nextInt(NUM_FIGURE_TYPES)) {
            0 -> Square(DIMENSION_RANGE.random().toDouble(), colorSupplier.getRandomColor())
            1 -> Rectangle(DIMENSION_RANGE.random().toDouble(), DIMENSION_RANGE.random().toDouble(),
                colorSupplier.getRandomColor())
            2 -> RightTriangle(DIMENSION_RANGE.random().toDouble(), DIMENSION_RANGE.random().toDouble(),
                colorSupplier.getRandomColor())
            VALUE_IN_RANDOM_THREE -> Circle(DIMENSION_RANGE.random().toDouble(),
                colorSupplier.getRandomColor())
            VALUE_IN_RANDOM_FOUR -> IsoscelesTrapezoid(DIMENSION_RANGE.random().toDouble(),
                DIMENSION_RANGE.random().toDouble(),
                DIMENSION_RANGE.random().toDouble(), colorSupplier.getRandomColor())
            else -> throw IllegalArgumentException("Invalid figure type")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(VALUE_CIRCLE_RADIUS, Color.WHITE)
    }
}
