package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle;
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_RADIUS = 10.0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val SIX = 6

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(ONE, SIX)) {
            ONE -> Circle(colorSupplier.getRandomColor(), Random.nextDouble())
            TWO -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(), Random.nextDouble(),
                Random.nextDouble(), Random.nextDouble()
            )
            THREE -> Rectangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            FOUR -> RightTriangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            else -> Square(colorSupplier.getRandomColor(), Random.nextDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
