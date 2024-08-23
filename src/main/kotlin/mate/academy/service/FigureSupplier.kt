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

const val BOUND_VALUE = 100.0
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()

        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())
            FigureType.SQUARE -> Square(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())
            FigureType.RECTANGLE -> Rectangle(
                Random.nextDouble(BOUND_VALUE)
                , Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor()
            )
            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                Random.nextDouble(BOUND_VALUE)
                , Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor()
            )
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                Random.nextDouble(BOUND_VALUE),
                Random.nextDouble(BOUND_VALUE),
                Random.nextDouble(BOUND_VALUE),
                colorSupplier.getRandomColor()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
