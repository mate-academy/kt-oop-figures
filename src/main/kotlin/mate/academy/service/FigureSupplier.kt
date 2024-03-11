package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.figure.Circle
import mate.academy.model.figure.IsoscelesTrapezoid
import mate.academy.model.figure.Rectangle
import mate.academy.model.figure.RightTriangle
import mate.academy.model.figure.Square
import kotlin.random.Random

const val BOUND_FOR_RANDOM = 1000
const val DEFAULT_SIZE = 10

class FigureSupplier {

    fun getRandomFigure(): Figure {
        val color = ColorSupplier().getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(Random.nextInt(BOUND_FOR_RANDOM), color)
            FigureType.CIRCLE -> Circle(Random.nextInt(BOUND_FOR_RANDOM), color)
            FigureType.TRAPEZOID -> IsoscelesTrapezoid(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
            FigureType.RECTANGLE -> Rectangle(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                Random.nextInt(BOUND_FOR_RANDOM),
                Random.nextInt(BOUND_FOR_RANDOM),
                color
            )
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_SIZE, Color.WHITE)
}
