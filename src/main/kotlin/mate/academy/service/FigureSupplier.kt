package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.figure.Circle
import mate.academy.model.figure.IsoscelesTrapezoid
import mate.academy.model.figure.Rectangle
import mate.academy.model.figure.RightTriangle
import mate.academy.model.figure.Square
import kotlin.random.Random

const val TOTAL_FIGURES_QUANTITY = 5
const val BOUND_FOR_RANDOM = 1000
const val DEFAULT_SIZE = 10
const val SQUARE_INDEX = 0
const val CIRCLE_INDEX = 1
const val TRAPEZOID_INDEX = 2
const val RECTANGLE_INDEX = 3
const val RIGHT_TRIANGLE_INDEX = 4

class FigureSupplier {

/*
    Question for mentors: Is it better to declare const's like this??

    companion object {
        const val TOTAL_FIGURES_QUANTITY = 5
        const val BOUND_FOR_RANDOM = 1000
        const val DEFAULT_SIZE = 10
    }
*/

    fun getRandomFigure(): Figure {
        val color = ColorSupplier().getRandomColor()
        return when (Random.nextInt(TOTAL_FIGURES_QUANTITY)) {
            SQUARE_INDEX -> Square(Random.nextInt(BOUND_FOR_RANDOM), color)
            CIRCLE_INDEX -> Circle(Random.nextInt(BOUND_FOR_RANDOM), color)
            TRAPEZOID_INDEX -> IsoscelesTrapezoid(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
            RECTANGLE_INDEX -> Rectangle(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
            RIGHT_TRIANGLE_INDEX -> RightTriangle(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
            else -> throw IllegalArgumentException("Invalid figure type!")
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_SIZE, Color.WHITE)
}
