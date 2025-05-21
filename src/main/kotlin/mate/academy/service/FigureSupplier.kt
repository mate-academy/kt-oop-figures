package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.random.Random

val DEFAULT_COLOR = Color.WHITE
const val DEFAULT_RADIUS = 10
const val FIGURE_TYPES_COUNT = 5
const val RANDOM_NUMBER_SIZE = 10
private const val SQUARE = 0
private const val RECTANGLE = 1
private const val RIGHT_TRIANGLE = 2
private const val CIRCLE = 3
private const val ISOSCELES_TRAPEZOID = 4

class FigureSupplier {

    fun getRandomFigure(): Figure {
        val figureType = Random.nextInt(FIGURE_TYPES_COUNT)
        val randomColor = ColorSupplier().getRandomColor()
        return when(figureType) {
            SQUARE -> Square(getRandomSize(), randomColor)
            RECTANGLE -> Rectangle(getRandomSize(), getRandomSize(), randomColor)
            RIGHT_TRIANGLE -> RightTriangle(getRandomSize(), getRandomSize(), getRandomSize(), randomColor)
            CIRCLE -> Circle(getRandomSize(), randomColor)
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(getRandomSize(), getRandomSize(), getRandomSize(), randomColor)
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure() : Figure = Circle(DEFAULT_RADIUS, DEFAULT_COLOR)

    fun getRandomSize(): Int = Random.nextInt(RANDOM_NUMBER_SIZE) + 1
}
