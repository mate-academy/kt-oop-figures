package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val TEN_DOUBLE  = 10.0
const val ONE_DOUBLE = 1.0
const val ONE_INT  = 1
const val TWO_INT  = 2
const val THREE_INT  = 3
const val FOUR_INT  = 4
const val SIX_INT  = 6

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        fun getRandomDouble(): Double {
            return Random.nextDouble(ONE_DOUBLE, TEN_DOUBLE)
        }
        val color = colorSupplier.getRandomColor()
        val randomNum = Random.nextInt(ONE_INT, SIX_INT)
        return when (randomNum) {
            ONE_INT -> Square(color, getRandomDouble())
            TWO_INT -> Circle(color, getRandomDouble())
            THREE_INT -> IsoscelesTrapezoid(color, getRandomDouble(),
                getRandomDouble(), getRandomDouble())
            FOUR_INT -> RightTriangle(color, getRandomDouble(), getRandomDouble())
            else -> Rectangle(color, getRandomDouble(), getRandomDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, TEN_DOUBLE)
    }
}
