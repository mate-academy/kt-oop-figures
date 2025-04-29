package mate.academy.service

import mate.academy.figures.Circle
import mate.academy.figures.Figure
import mate.academy.figures.IsoscelesTrapezoid
import mate.academy.figures.Rectangle
import mate.academy.figures.Square
import mate.academy.figures.RightTriangle
import mate.academy.model.Color
import kotlin.random.Random

const val MIN = 1.0
const val MAX = 10.0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {

        val randomColor = colorSupplier.getRandomColor()

        return when ((ONE..FIVE).random()) {
            ONE -> Circle(randomColor, Random.nextDouble(MIN, MAX))
            TWO -> IsoscelesTrapezoid(
                randomColor,
                Random.nextDouble(MIN, MAX),
                Random.nextDouble(MIN, MAX),
                Random.nextDouble(MIN, MAX)
            )
            THREE -> Rectangle(randomColor, Random.nextDouble(MIN, MAX), Random.nextDouble(MIN, MAX))
            FOUR -> Square(randomColor, Random.nextDouble(MIN, MAX))
            FIVE -> RightTriangle(randomColor, Random.nextDouble(MIN, MAX), Random.nextDouble(MIN, MAX))
            else -> error("Some error occurred")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
