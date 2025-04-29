package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.Color
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Circle
import mate.academy.model.IsoscelesTrapezoid
import kotlin.random.Random

const val FIGURE_COUNT = 5
val DEFAULT_COLOR = Color.WHITE.name
const val DEFAULT_RADIUS = 10.0
const val MAX_VALUE = 10
const val SQUARE = 0
const val RECTANGLE = 1
const val RIGHT_TRIANGLE = 2
const val CIRCLE = 3

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor().name
        return when(Random.nextInt(FIGURE_COUNT)) {
            SQUARE -> Square(color, getRandomValue())
            RECTANGLE -> Rectangle(color, getRandomValue(), getRandomValue())
            RIGHT_TRIANGLE -> RightTriangle(color, getRandomValue(), getRandomValue())
            CIRCLE -> Circle(color, getRandomValue())
            else -> IsoscelesTrapezoid(color, getRandomValue(), getRandomValue(), getRandomValue())
        }
    }

    fun getDefaultFigure() : Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
    }

    private fun getRandomValue(): Double = Random.nextDouble() * MAX_VALUE
}
