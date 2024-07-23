package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.model.Color
import kotlin.random.Random

private const val CIRCLE = 1
private const val SQUARE = 2
private const val RECTANGLE = 3
private const val TRIANGLE = 4
private const val TRAPEZOID = 5
private const val NUMBER_OF_FIGURES = 5
private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val MAX_SIZE = 50.0
private val colorSupplier = ColorSupplier()

class FigureSupplier {
    fun getRandomFigure(): Figure {
        return when (Random.nextInt(NUMBER_OF_FIGURES)) {
            CIRCLE -> Circle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE))

            SQUARE -> Square(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE))

            RECTANGLE -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))

            TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))

            TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE),
                Random.nextDouble(MAX_SIZE))

            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }
}
