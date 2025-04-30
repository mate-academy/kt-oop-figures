package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val ONE = 1
const val TEN = 10
const val ZERO = 0
const val FIVE = 5
const val THREE = 3
const val FOUR = 4

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure? {
        return when (Random.nextInt(ZERO, FIVE)) {
            0 -> Square(colorSupplier.getRandomColor(), Random.nextInt(ONE, TEN))
            1 -> Circle(colorSupplier.getRandomColor(), Random.nextInt(ONE, TEN))
            2 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(ONE, TEN), Random.nextInt(ONE, TEN), Random.nextInt(ONE, TEN)
            )
            THREE -> Rectangle(colorSupplier.getRandomColor(), Random.nextInt(ONE, TEN), Random.nextInt(ONE, TEN))
            FOUR -> RightTriangle(colorSupplier.getRandomColor(), Random.nextInt(ONE, TEN), Random.nextInt(ONE, TEN))
            else -> null
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(colorSupplier.getWhiteColor(), TEN)
    }
}
