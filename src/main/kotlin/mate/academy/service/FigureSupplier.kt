package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

const val MAX_VALUE = 10
const val MIN_VALUE = 1
const val DEFAULT_RADIUS = 10.0
const val NUMBER_OF_FIGURES = 5
const val SQUARE = 1
const val RECTANGLE = 2
const val RIGHT_TRIANGLE = 3
const val CIRCLE = 4
const val ISOSCELES_TRAPEZOID = 5

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        fun getRandomValue(): Double {
            return (MIN_VALUE..MAX_VALUE).random().toDouble()
        }

        return when((1..NUMBER_OF_FIGURES).random()) {
            SQUARE -> Square(color, getRandomValue())
            RECTANGLE -> Rectangle(color, getRandomValue(),
                getRandomValue())
            RIGHT_TRIANGLE -> RightTriangle(color, getRandomValue(),
                getRandomValue())
            CIRCLE -> Circle(color, getRandomValue())
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(color, getRandomValue(),
                getRandomValue(), getRandomValue())
            else -> error("Ooops! Incorrect value");
        }
    }
}
