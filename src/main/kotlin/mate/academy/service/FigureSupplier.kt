package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.FigureShape
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random
import kotlin.random.nextInt

const val MAX_VALUE = 100
const val MIN_VALUE = 1

class FigureSupplier {

    fun getDefaultFigure(): Figure {
        return Circle()
    }
    fun getRandomFigure(): Figure {
        val color = ColorSupplier()
        val figure = FigureShape.values()[Random.nextInt(FigureShape.values().size - 1)]
        return when (figure) {
            FigureShape.CIRCLE -> Circle(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE))
            FigureShape.ISOSCELESTRAPEZOID -> IsoscelesTrapezoid(color.getRandomColor(),
                Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(
                MIN_VALUE..MAX_VALUE), Random.nextInt(MIN_VALUE..MAX_VALUE))
            FigureShape.RECTANGLE -> Rectangle(color.getRandomColor(),
                Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(MIN_VALUE..MAX_VALUE))
            FigureShape.RIGHTTRIANGLE -> RightTriangle(color.getRandomColor(),
                Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(MIN_VALUE..MAX_VALUE))
            FigureShape.SQUARE -> Square(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE))
        }
    }
}
