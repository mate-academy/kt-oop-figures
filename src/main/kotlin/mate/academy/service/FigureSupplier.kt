package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.impl.Circle
import mate.academy.model.impl.IsoscelesTrapezoid
import mate.academy.model.impl.Rectangle
import mate.academy.model.impl.RightTriangle
import mate.academy.model.impl.Square
import kotlin.random.Random

private const val MIN_SIZE: Double = 5.0
private const val MAX_SIZE: Double = 15.0
private const val DEFAULT_SIZE: Double = 10.0

class FigureSupplier {
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure = Circle(radius = DEFAULT_SIZE, color = Color.WHITE)
    fun getRandomFigure(): Figure {
        val randomColor: Color = colorSupplier.getRandomColor()
        val randomFigureType: FigureType = FigureType.values().random()

        return when (randomFigureType) {
            FigureType.SQUARE -> generateRandomSquare(randomColor)
            FigureType.RECTANGLE -> generateRandomRectangle(randomColor)
            FigureType.RIGHT_TRIANGLE -> generateRandomRightTriangle(randomColor)
            FigureType.CIRCLE -> generateRandomCircle(randomColor)
            FigureType.ISOSCELES_TRAPEZOID -> generateRandomIsoscelesTrapezoid(randomColor)
        }
    }

    private fun generateRandomSquare(color: Color): Figure = Square(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))

    private fun generateRandomCircle(color: Color): Figure = Circle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))

    private fun generateRandomIsoscelesTrapezoid(color: Color): Figure {
        return IsoscelesTrapezoid(
            color,
            Random.nextDouble(MIN_SIZE, MAX_SIZE),
            Random.nextDouble(MIN_SIZE, MAX_SIZE),
            Random.nextDouble(MIN_SIZE, MAX_SIZE)
        )
    }

    private fun generateRandomRectangle(color: Color): Figure {
        return Rectangle(
            color,
            Random.nextDouble(MIN_SIZE, MAX_SIZE),
            Random.nextDouble(MIN_SIZE, MAX_SIZE)
        )
    }

    private fun generateRandomRightTriangle(color: Color): Figure {
        return RightTriangle(
            color,
            Random.nextDouble(MIN_SIZE, MAX_SIZE),
            Random.nextDouble(MIN_SIZE, MAX_SIZE),
            Random.nextDouble(MIN_SIZE, MAX_SIZE)
        )
    }
}
