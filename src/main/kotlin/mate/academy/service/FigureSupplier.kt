package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.FigureList
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
        val figure = FigureList.values()[Random.nextInt(FigureList.values().size - 1)]
        return when (figure) {
            FigureList.Circle -> Circle(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE))
            FigureList.IsoscelesTrapezoid -> IsoscelesTrapezoid(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(
                MIN_VALUE..MAX_VALUE), Random.nextInt(MIN_VALUE..MAX_VALUE))

            FigureList.Rectangle -> Rectangle(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(
                MIN_VALUE..MAX_VALUE))

            FigureList.RightTriangle -> RightTriangle(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE), Random.nextInt(
                MIN_VALUE..MAX_VALUE))

            FigureList.Square -> Square(color.getRandomColor(), Random.nextInt(MIN_VALUE..MAX_VALUE))
        }
    }
}
