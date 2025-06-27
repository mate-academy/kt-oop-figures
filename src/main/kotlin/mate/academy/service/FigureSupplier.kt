package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val ZERO = 0
const val TWO = 2
const val THREE = 3
const val FIVE = 5
const val ONE = 1
const val DEFAULT_SIZE = 10
val colorSupplier = ColorSupplier()

class FigureSupplier {

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIVE)) {
            ZERO -> Circle(getRandomSize(), colorSupplier.getRandomColor())
            ONE -> IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                getRandomSize(), colorSupplier.getRandomColor())
            TWO -> Rectangle(getRandomSize(), getRandomSize(),
                colorSupplier.getRandomColor())
            THREE -> RightTriangle(getRandomSize(), getRandomSize(),
                colorSupplier.getRandomColor())
            else -> Square(getRandomSize(), colorSupplier.getRandomColor())
        }
    }

    fun getRandomSize(): Int = Random.nextInt(ONE, DEFAULT_SIZE)

    fun getDefaultFigure(): Figure = Circle(DEFAULT_SIZE, Color.WHITE)
}
