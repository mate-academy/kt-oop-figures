package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import java.time.chrono.HijrahEra

const val START = 1
const val FIGURE_SIZE = 5
const val END = 10
const val SQUARE = 1
const val RECTANGLE = 2
const val RIGHT_TRIANGLE = 3
const val CIRCLE = 4
const val ISOSCELES_TRAPEZOID = 5
const val SIDE = 5.0
const val WIDTH = 5.0
const val HEIGHT_RECTANGLE = 4.0
const val FIRST_LEG = 5.0
const val SECOND_LEG = 4.0
const val RADIUS = 10.0
const val BASE1 = 4.0
const val BASE2 = 5.0
const val HEIGHT_ISOSCELES_TRAPEZOID = 3.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val figureType = (START..FIGURE_SIZE).random()
        val color = ColorSupplier().getRandomColor()

        return when (figureType) {
            SQUARE -> Square(color, (START..END).random().toDouble())

            RECTANGLE -> Rectangle(
                color, (START..END).random().toDouble(),
                (START..END).random().toDouble()
            )

            RIGHT_TRIANGLE -> RightTriangle(
                color,
                (START..END).random().toDouble(),
                (START..END).random().toDouble()
            )

            CIRCLE -> Circle(color, (START..END).random().toDouble())

            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                color,
                (START..END).random().toDouble(),
                (START..END).random().toDouble(),
                (START..END).random().toDouble()
            )

            else -> error("Unexpected figure type: $figureType")
        }
    }

    fun getDefaultFigure(): Figure {
        return when (val figureType = (START..FIGURE_SIZE).random()) {
            SQUARE -> Square(Color.BLACK, SIDE)
            RECTANGLE -> Rectangle(Color.YELLOW, WIDTH, HEIGHT_RECTANGLE)
            RIGHT_TRIANGLE -> RightTriangle(Color.BLUE, FIRST_LEG, SECOND_LEG)
            CIRCLE -> Circle(Color.WHITE, RADIUS)
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(Color.GREEN, BASE1, BASE2, HEIGHT_ISOSCELES_TRAPEZOID)
            else -> error("Unexpected figure type: $figureType")
        }
    }
}
