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

    private val colorSupplier = ColorSupplier()

    private fun getRandomSize() = Random.nextInt(BOUND_FOR_RANDOM)

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        val size = getRandomSize()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(size, color)
            FigureType.CIRCLE -> Circle(size, color)
            FigureType.TRAPEZOID -> IsoscelesTrapezoid(size, size, size, color)
            FigureType.RECTANGLE -> Rectangle(size, size, color)
            FigureType.RIGHT_TRIANGLE -> RightTriangle(size, size, color)
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEFAULT_SIZE, Color.WHITE)
}
