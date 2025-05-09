package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_RADIUS_OF_CIRCLE = 10.0
const val MAX_SIDE_LENGTH = 100.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getDefaultFigure() = Circle(color = Color.WHITE, radius = DEFAULT_RADIUS_OF_CIRCLE)

    fun getRandomFigure() = getFigure()

    private fun getFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(
                color = colorSupplier.getRandomColor(),
                radius = getRandomSize()
            )

            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                color = colorSupplier.getRandomColor(),
                baseSide = getRandomSize(),
                topSide = getRandomSize(),
                height = getRandomSize()
            )

            FigureType.RECTANGLE -> Rectangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )

            FigureType.SQUARE -> Square(
                color = colorSupplier.getRandomColor(),
                side = getRandomSize(),
            )
        }
    }

    private fun getRandomSize() = Random.nextDouble(MAX_SIDE_LENGTH)
}
