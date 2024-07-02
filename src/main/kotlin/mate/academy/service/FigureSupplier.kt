package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.model.Color
import kotlin.random.Random

private const val DEFAULT_RADIUS = 10.0

private const val MAX_RANDOM_VALUE = 20.0


class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure() : Figure {
        return when(FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE),
                Random.nextDouble(MAX_RANDOM_VALUE))
            FigureType.RECTANGLE -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
            FigureType.RIGHT_TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
            FigureType.SQUARE -> Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
        }
    }

    fun getDefaultFigure() = Circle(Color.WHITE, DEFAULT_RADIUS)
}
