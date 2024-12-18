package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val MIN_SIZE = 1.0
const val MAX_SIZE = 10.0
const val DEFAULT_RADIUS = 10.0
val DEFAULT_COLOR = Color.WHITE
const val NUM_FIGURE_TYPES = 5

const val SQUARE = 0
const val RECTANGLE = 1
const val RIGHT_TRIANGLE = 2
const val CIRCLE = 3

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when (Random.nextInt(NUM_FIGURE_TYPES)) {
            SQUARE -> Square(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            RECTANGLE -> Rectangle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE))
            RIGHT_TRIANGLE -> RightTriangle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE))
            CIRCLE -> Circle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            else -> IsoscelesTrapezoid(color, Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE), Random.nextDouble(MIN_SIZE, MAX_SIZE))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
    }
}
