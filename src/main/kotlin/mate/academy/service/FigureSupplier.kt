package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureIndex
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random
import kotlin.random.nextInt

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    companion object {
        const val DEFAULT_RADIUS = 10.0
        const val MAX_RANDOM_VALUE = 8
    }

    fun getRandomFigure(): Figure {
        return when (FigureIndex.values().random()) {
            FigureIndex.CIRCLE -> Circle(colorSupplier.getRandomColor(), getNonZeroValue())
            FigureIndex.SQUARE -> Square(colorSupplier.getRandomColor(), getNonZeroValue())
            FigureIndex.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(), getNonZeroValue(), getNonZeroValue()
            )

            FigureIndex.RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(), getNonZeroValue(), getNonZeroValue()
            )

            FigureIndex.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(), getNonZeroValue(), getNonZeroValue(), getNonZeroValue()
            )
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    private fun getNonZeroValue(): Double {
        return return (1..MAX_RANDOM_VALUE).random().toDouble()
    }
}
