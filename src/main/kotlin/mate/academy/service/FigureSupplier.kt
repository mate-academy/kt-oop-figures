package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random


private const val SQUARE_CASE: Int = 0
private const val RECTANGLE_CASE: Int = 1
private const val RIGHTTRIANGLE_CASE: Int = 2
private const val CIRCLE_CASE: Int = 3

private const val ONE: Double = 1.0
private const val FIVE: Int = 5
private const val TEN: Double = 10.0

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIVE)) {
            SQUARE_CASE -> Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble(ONE, TEN))
            RECTANGLE_CASE -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN)
            )
            RIGHTTRIANGLE_CASE -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN)
            )
            CIRCLE_CASE -> Circle(Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN)

            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(TEN, Color.WHITE)
    }
}