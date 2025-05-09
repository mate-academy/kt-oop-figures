package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.impl.Circle
import mate.academy.model.impl.IsoscelesTrapezoid
import mate.academy.model.impl.Rectangle
import mate.academy.model.impl.RightTriangle
import mate.academy.model.impl.Square

const val MAX_RANDOM_VALUE = 10
const val DEFAULT_RADIUS: Double = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(getRandomValue(), colorSupplier.getRandomColor())
            FigureType.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue()
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue()
            )

            FigureType.CIRCLE -> Circle(colorSupplier.getRandomColor(), getRandomValue())
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue(), getRandomValue()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    private fun getRandomValue(): Double {
        return (1..MAX_RANDOM_VALUE).random().toDouble()
    }
}
