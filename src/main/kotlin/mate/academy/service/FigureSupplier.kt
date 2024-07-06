package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val NUMBER_OF_FIGURES = 5
const val DEFAULT_RADIUS_OF_CIRCLE = 10.0
const val MAX_SIDE_LENGTH = 100.0
const val FIGURE_CIRCLE = 0
const val FIGURE_ISOSCELES_TRAPEZOID = 1
const val FIGURE_RECTANGLE = 2
const val FIGURE_RIGHT_TRIANGLE = 3
const val FIGURE_SQUARE = 4

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getDefaultFigure() = Circle(color = Color.WHITE, radius = DEFAULT_RADIUS_OF_CIRCLE)


    fun getRandomFigure() = getFigure()

    private fun getFigure(): Figure {
        return when (Random.nextInt(NUMBER_OF_FIGURES)) {
            FIGURE_CIRCLE -> Circle(
                color = colorSupplier.getRandomColor(),
                radius = getRandomSize()
            )

            FIGURE_ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                color = colorSupplier.getRandomColor(),
                baseSide = getRandomSize(),
                topSide = getRandomSize(),
                height = getRandomSize()
            )

            FIGURE_RECTANGLE -> Rectangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )

            FIGURE_RIGHT_TRIANGLE -> RightTriangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )

            FIGURE_SQUARE -> Square(
                color = colorSupplier.getRandomColor(),
                side = getRandomSize(),
            )

            else -> throw NoSuchElementException()
        }
    }

    private fun getRandomSize() = Random.nextDouble(MAX_SIDE_LENGTH)
}

