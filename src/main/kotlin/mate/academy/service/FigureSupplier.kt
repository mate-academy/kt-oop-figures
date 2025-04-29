package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.model.Color
import kotlin.random.Random

private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val MAX_SIZE = 50.0
private val colorSupplier = ColorSupplier()

class FigureSupplier {
    fun getRandomFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE))

            FigureType.SQUARE -> Square(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE))

            FigureType.RECTANGLE -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))

            FigureType.RIGHT_TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))

            FigureType.TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }
}

private enum class FigureType {
    RIGHT_TRIANGLE,
    TRAPEZOID,
    RECTANGLE,
    CIRCLE,
    SQUARE,
}
