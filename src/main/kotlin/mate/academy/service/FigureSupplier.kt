package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import java.util.Random

const val DEFAULT_RADIUS = 10.0
const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val RANDOM_NUMBER = 6

class FigureSupplier {
    val random = Random()
    val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val colorOfFigure = colorSupplier.getRandomColor()
        val numberOfFigure = random.nextInt(RANDOM_NUMBER)
        val result = when (numberOfFigure) {
            ZERO -> Circle(colorOfFigure, random.nextDouble())
            ONE -> IsoscelesTrapezoid(
                colorOfFigure, random.nextDouble(),
                random.nextDouble(), random.nextDouble()
            )
            TWO -> Rectangle(colorOfFigure, random.nextDouble(), random.nextDouble())
            THREE -> RightTriangle(colorOfFigure, random.nextDouble(), random.nextDouble())
            FOUR -> Square(colorOfFigure, random.nextDouble())
            else -> {getDefaultFigure()}
        }
        return result
    }
    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
