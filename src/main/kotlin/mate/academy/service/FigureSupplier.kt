package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIGURE_COUNTER = 4
const val DEFAULT_FIGURE_RADIUS = 10
const val TYPE_FIGURE_0 = 0
const val TYPE_FIGURE_1 = 1
const val TYPE_FIGURE_2 = 2
const val TYPE_FIGURE_3 = 3

class FigureSupplier {

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_COUNTER)) {
            TYPE_FIGURE_0 -> Square.getRandomSquare()
            TYPE_FIGURE_1 -> RightTriangle.getRandomRightTriangle()
            TYPE_FIGURE_2 -> Rectangle.getRandomRectangle()
            TYPE_FIGURE_3 -> IsoscelesTrapezoid.getRandomIsoscelesTrapezoid()
            else -> Circle.getRandomCircle()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(color = Color.WHITE, radius = DEFAULT_FIGURE_RADIUS)
    }
}
