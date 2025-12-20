package mate.academy.figures

import kotlin.random.Random
import mate.academy.model.Color
import mate.academy.service.ColorSupplier

const val NUMBER_OF_FIGURES = 4
const val DEFAULT_NUMBER = 10
const val DEFAULT_RADIUS = 10
const val DEFAULT_COLOR_NUMBER = 3
const val CIRCLE = 0
const val SQUARE = 1
const val RECTANGLE = 2
const val RIGTH_TRIANGLE = 3

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val color = ColorSupplier().getRandomColor()
        val param = Random.nextInt(DEFAULT_NUMBER) + 1

        return when (Random.nextInt(NUMBER_OF_FIGURES)) {
            CIRCLE -> Circle(param, color)
            SQUARE -> Square(param, color)
            RECTANGLE -> Rectangle(param, param, color)
            RIGTH_TRIANGLE -> RightTriangle(param, param, color)
            else -> IsoscelesTrapezoid(param, param, color)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
