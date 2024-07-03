package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

import kotlin.random.Random

const val MAX_RANDOM_NUMBER = 100.0
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> getRandomCircle()
            FigureType.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
            FigureType.RECTANGLE -> getRandomRectangle()
            FigureType.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureType.SQUARE -> getRandomSquare()
        }
    }

    fun getDefaultFigure() = Circle(Color.WHITE, DEFAULT_RADIUS)

    private fun getRandomCircle() = Circle(
        colorSupplier.getRandomColor(),
        Random.nextDouble(MAX_RANDOM_NUMBER)
    )

    private fun getRandomIsoscelesTrapezoid() = IsoscelesTrapezoid(
        colorSupplier.getRandomColor(),
        Random.nextDouble(MAX_RANDOM_NUMBER),
        Random.nextDouble(MAX_RANDOM_NUMBER),
        Random.nextDouble(MAX_RANDOM_NUMBER),
    )


    private fun getRandomRectangle() = Rectangle(
        colorSupplier.getRandomColor(),
        Random.nextDouble(MAX_RANDOM_NUMBER),
        Random.nextDouble(MAX_RANDOM_NUMBER),
    )

    private fun getRandomRightTriangle() = RightTriangle(
        colorSupplier.getRandomColor(),
        Random.nextDouble(MAX_RANDOM_NUMBER),
        Random.nextDouble(MAX_RANDOM_NUMBER),
    )

    private fun getRandomSquare() = Square(
        colorSupplier.getRandomColor(),
        Random.nextDouble(MAX_RANDOM_NUMBER))
}
