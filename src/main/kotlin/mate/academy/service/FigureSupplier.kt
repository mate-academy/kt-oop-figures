package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

const val FROM = 1
const val TO = 5
const val DEFAULT = 10.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val value = (FROM..TO).random().toDouble()
        val secondValue = (FROM..TO).random().toDouble()
        val color = ColorSupplier().getRandomColor()
        val random = listOf<Figure>(
            Circle(color = color, radius = value),
            RightTriangle(color = color, sideA = value, sideB = secondValue),
            Rectangle(color = color, sideA = value, sideB = secondValue),
            Square(color = color, side = value),
            IsoscelesTrapezoid(color = color, baseA = value, baseB = secondValue, baseC = value)
        ).random()
        return random
    }

    fun getDefaultFigure(): Figure = Circle(color = Color.WHITE, radius = DEFAULT)
}
