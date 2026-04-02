package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    companion object {
        private const val FIGURE_TYPES_COUNT = 5
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_RADIUS = 10.0
    }

    private fun randomSize() = Random.nextDouble(MIN_SIZE, MAX_SIZE)

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()

        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            0 -> Square(color, randomSize())
            1 -> Rectangle(
                color,
                randomSize(),
                randomSize()
            )
            2 -> RightTriangle(
                color,
                randomSize(),
                randomSize()
            )
            3 -> Circle(color, randomSize())
            else -> IsoscelesTrapezoid(
                color,
                randomSize(),
                randomSize(),
                randomSize()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
