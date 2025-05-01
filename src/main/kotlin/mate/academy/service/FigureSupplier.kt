package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val DEFAULT_CIRCLE_RADIUS = 10
private const val RANDOM_MIN_INT = 1
private const val RANDOM_MAX_INT = Int.MAX_VALUE


class FigureSupplier(val colorSupplier: ColorSupplier) {
    private val figureList = listOf(
        ::createRandomCircle,
        ::createRandomSquare,
        ::createRandomRectangle,
        ::createRandomIsoscelesTrapezoid,
        ::createRandomRightTriangle
    )

    fun getRandomFigure(): Figure {
        return figureList.random().invoke()
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }

    private fun createRandomCircle(): Circle {
        return Circle(colorSupplier.getRandomColor(), getRandomInt())
    }

    private fun createRandomSquare(): Square {
        return Square(colorSupplier.getRandomColor(), getRandomInt())
    }

    private fun createRandomRectangle(): Rectangle {
        return Rectangle(
            colorSupplier.getRandomColor(), getRandomInt(), getRandomInt()
        )
    }

    private fun createRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
        return IsoscelesTrapezoid(
            colorSupplier.getRandomColor(), getRandomInt(), getRandomInt(), getRandomInt()
        )
    }

    private fun createRandomRightTriangle(): RightTriangle {
        return RightTriangle(
            colorSupplier.getRandomColor(), getRandomInt(), getRandomInt()
        )
    }

    private fun getRandomInt(): Int = Random.nextInt(RANDOM_MIN_INT, RANDOM_MAX_INT)
}
