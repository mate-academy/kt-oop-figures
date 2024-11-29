package mate.academy.service

import mate.academy.model.Color
import mate.academy.Circle
import mate.academy.Figure
import mate.academy.IsoscelesTrapezoid
import mate.academy.Rectangle
import mate.academy.RightTriangle
import mate.academy.Square
import kotlin.random.Random

const val MIN_RANDOM_VALUE = 1
const val MAX_RANDOM_VALUE = 10
const val NUM_FIGURE_TYPES = 5

class FigureSupplier {

    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        return when (Random.nextInt(NUM_FIGURE_TYPES)) {
            0 -> Square((MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                colorSupplier.getRandomColor())
            1 -> Rectangle((MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                (MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                colorSupplier.getRandomColor())
            2 -> RightTriangle((MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                (MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                colorSupplier.getRandomColor())
            3 -> Circle((MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                colorSupplier.getRandomColor())
            4 -> IsoscelesTrapezoid((MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                (MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                (MIN_RANDOM_VALUE..MAX_RANDOM_VALUE).random().toDouble(),
                colorSupplier.getRandomColor())
            else -> throw IllegalArgumentException("Invalid figure type")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
