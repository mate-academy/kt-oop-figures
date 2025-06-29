package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIVE = 5
const val ONE = 1.0
const val TEN = 10.0
const val THREE = 3

class FigureSupplier(private val colorSupplier: ColorSupplier) {

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(FIVE)) {
            0 -> Square(Random.nextDouble(ONE,TEN), color)
            1 -> Rectangle(Random.nextDouble(ONE,TEN), Random.nextDouble(ONE, TEN), color)
            2 -> RightTriangle(Random.nextDouble(ONE,TEN), Random.nextDouble(ONE, TEN), color)
            THREE -> Circle(Random.nextDouble(ONE, TEN), color)
            else -> IsoscelesTrapezoid(
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                color
            )

        }
    }
    fun getDefaultFigure(): Figure {
        return Circle(TEN, Color.WHITE)
    }
}
