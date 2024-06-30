package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Figure
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.model.Color
import kotlin.random.Random
import kotlin.random.nextInt

private const val TEN = 10.0

private const val TWO = 2

private const val THREE = 3

private const val FOUR = 4

private const val FIVE = 5

private const val DOUBLE_20 = 20.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure() : Figure {
        val randomColor = colorSupplier.getRandomColor()

        fun randomUnit() = Random.nextDouble(DOUBLE_20)

        return when(Random.nextInt(1..FIVE)) {
            TWO -> IsoscelesTrapezoid(randomColor, randomUnit(), randomUnit(), randomUnit())
            THREE -> Rectangle(randomColor, randomUnit(), randomUnit())
            FOUR -> RightTriangle(randomColor, randomUnit(), randomUnit())
            FIVE -> Square(randomColor, randomUnit())
            else -> Circle(randomColor, randomUnit())
        }
    }

    fun getDefaultFigure() = Circle(Color.WHITE, TEN)
}
