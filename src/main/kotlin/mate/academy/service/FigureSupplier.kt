package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.figure.Circle
import mate.academy.model.figure.Rectangle
import mate.academy.model.figure.Figure
import mate.academy.model.figure.IsoscelesTrapezoid
import mate.academy.model.figure.RightTriangle
import mate.academy.model.figure.Square

const val MIN : Int = 1
const val SQUARE : Int = 1
const val ISOSCELES_TRAPEZOID : Int = 2
const val CIRCLE : Int = 3
const val RIGHT_TRIANGLE : Int = 4
const val RECTANGLE : Int = 5
const val MIDDLE : Int = 25
const val MAX : Int = 50
const val FIGURE_NUMBERS : Int = 5

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        return when (val random = (MIN..FIGURE_NUMBERS).random()) {
            SQUARE -> Square(colorSupplier.getRandomColor(), (MIN..MAX).random().toDouble())
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                (MIDDLE..MAX).random().toDouble(),
                (MIN..MIDDLE).random().toDouble(),
                (MIN..MIDDLE).random().toDouble()
            )
            CIRCLE -> Circle(colorSupplier.getRandomColor(), (MIN..MAX).random().toDouble())
            RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                (MIN..MAX).random().toDouble(),
                (MIN..MAX).random().toDouble()
            )
            RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                (MIN..MAX).random().toDouble(),
                (MIN..MAX).random().toDouble()
            )
            else -> throw IllegalArgumentException("Invalid random value: $random")
        }
    }

    fun getDefaultFigure(): Figure {
        return Square(Color.BLACK, MIDDLE.toDouble())
    }
}
