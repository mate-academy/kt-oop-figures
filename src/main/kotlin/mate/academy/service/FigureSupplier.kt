package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Square
import kotlin.random.Random

private const val MIN_SIDE: Int = 10
private const val MAX_SIDE: Int = 100
private const val DEFAULT_RADIUS: Int = 10

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomFigureType = FigureType.values().random()
        return when (randomFigureType) {
            FigureType.SQUARE -> generateRandomSquare(randomColor)
            FigureType.CIRCLE -> generateRandomCircle(randomColor)
            FigureType.RECTANGLE -> generateRandomRectangle(randomColor)
            FigureType.RIGHT_TRIANGLE -> generateRandomRightTriangle(randomColor)
            FigureType.ISOSCELES_TRAPEZOID -> generateRandomIsoscelesTrapezoid(randomColor)
        }
    }

    private fun generateRandomSquare(color: Color): Figure = Square(
        color,
        Random.nextInt(MIN_SIDE, MAX_SIDE)
    )

    private fun generateRandomCircle(color: Color): Figure = Circle(
        color,
        Random.nextInt(MIN_SIDE, MAX_SIDE)
    )

    private fun generateRandomIsoscelesTrapezoid(color: Color): Figure = IsoscelesTrapezoid(
        color,
        Random.nextInt(MIN_SIDE, MAX_SIDE),
        Random.nextInt(MIN_SIDE, MAX_SIDE),
        Random.nextInt(MIN_SIDE, MAX_SIDE)
    )

    private fun generateRandomRectangle(color: Color): Figure = Rectangle(
        color,
        Random.nextInt(MIN_SIDE, MAX_SIDE),
        Random.nextInt(MIN_SIDE, MAX_SIDE)
    )

    private fun generateRandomRightTriangle(color: Color): Figure = RightTriangle(
        color,
        Random.nextInt(MIN_SIDE, MAX_SIDE),
        Random.nextInt(MIN_SIDE, MAX_SIDE)
    )

    fun getDefaultFigure(): Figure = Circle(radius = DEFAULT_RADIUS, color = Color.WHITE)
}
