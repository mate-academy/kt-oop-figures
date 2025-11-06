@file:Suppress("MagicNumber")

package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIGURE_TYPES_COUNT = 5
const val MIN_SIZE = 1.0
const val MAX_SIZE = 10.0
const val DEFAULT_RADIUS_INT = 10
val DEFAULT_COLOR = Color.WHITE

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            0 -> Square(Random.nextDouble(MIN_SIZE, MAX_SIZE), randomColor)
            1 -> Rectangle(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                randomColor
            )
            2 -> RightTriangle(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                randomColor
            )
            3 -> Circle(Random.nextDouble(MIN_SIZE, MAX_SIZE), randomColor)
            else -> IsoscelesTrapezoid(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                randomColor
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS_INT.toDouble(), DEFAULT_COLOR)
    }
}
