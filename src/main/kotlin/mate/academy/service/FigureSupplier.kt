package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

val DEFAULT_COLOR = Color.WHITE
const val DEFAULT_SIZE = 10.0
const val FIGURE_COUNT = 5
const val SQUARE = 1
const val RECTANGLE = 2
const val TRIANGLE = 3
const val CIRCLE = 4
const val TRAPEZOID = 5
const val LOWER_BOUND = 1.0
const val UPPER_BOUND = 10.0

class FigureSupplier(val colorSupplier: ColorSupplier = ColorSupplier()) {
    fun getRandomFigure() : Figure {
        fun getRandomSize() : Double = Random.nextDouble(LOWER_BOUND, UPPER_BOUND)

        return when (Random.nextInt(FIGURE_COUNT)) {
            SQUARE -> Square(colorSupplier.getRandomColor(), getRandomSize())
            RECTANGLE -> Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize())
            TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize())
            CIRCLE -> Circle(colorSupplier.getRandomColor(), getRandomSize())
            TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                getRandomSize(), getRandomSize())
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure() : Figure = Circle(DEFAULT_COLOR, DEFAULT_SIZE)
}
