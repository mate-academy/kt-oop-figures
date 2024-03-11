package mate.academy.service

import kotlin.random.Random
import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

private const val ZERO_INDEX = 0
private const val FIRST_INDEX = 1
private const val SECOND_INDEX = 2
private const val THIRD_INDEX = 3
private const val MIN_LENGTH: Double = 1.0
private const val MAX_LENGTH: Double = 100.0
private const val DEFAULT_RADIUS: Double = 10.0
private const val NUMBER_OF_FIGURES = 5
private val DEFAULT_COLOR = Color.WHITE

class FigureSupplier {
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        return when (Random.nextInt(NUMBER_OF_FIGURES)) {
            ZERO_INDEX -> getRandomSquare(randomColor)
            FIRST_INDEX -> getRandomRectangle(randomColor)
            SECOND_INDEX -> getRandomRightTriangle(randomColor)
            THIRD_INDEX -> getRandomIsoscelesTrapezoid(randomColor)
            else -> getRandomCircle(randomColor)
        }
    }

    private fun getRandomSquare(randomColor: Color): Figure = Square(
        randomColor, Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
    )

    private fun getRandomRectangle(randomColor: Color): Figure = Rectangle(
        randomColor,
        Random.nextDouble(MIN_LENGTH, MAX_LENGTH),
        Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
    )

    private fun getRandomRightTriangle(randomColor: Color): Figure = RightTriangle(
        randomColor,
        Random.nextDouble(MIN_LENGTH, MAX_LENGTH),
        Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
    )

    private fun getRandomIsoscelesTrapezoid(randomColor: Color): Figure {
        val leg = Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
        val shortSide = Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
        var longSide = Random.nextDouble(MIN_LENGTH, MAX_LENGTH)

        while (longSide < shortSide) {
            longSide = Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
        }

        return IsoscelesTrapezoid(randomColor, shortSide, longSide, leg)
    }

    private fun getRandomCircle(randomColor: Color): Figure = Circle(
        randomColor,
        Random.nextDouble(MIN_LENGTH, MAX_LENGTH)
    )

    fun getDefaultFigure(): Figure = Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
}
