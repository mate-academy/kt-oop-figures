package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Square
import kotlin.random.Random

private const val TRAPEZOID_CASE = 1
private const val SQUARE_CASE = 2
private const val RECTANGLE_CASE = 3
private const val TRIANGLE_CASE = 4
private const val FIGURE_TYPE_COUNT = 5
private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val MAX_DOUBLE = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_TYPE_COUNT)) {
            TRAPEZOID_CASE -> getRandomTrapezoid()
            SQUARE_CASE -> getRandomSquare()
            RECTANGLE_CASE -> getRandomRectangle()
            TRIANGLE_CASE -> getRandomTriangle()
            else -> getRandomCircle()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }

    private fun getRandomCircle(): Circle {
        return Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_DOUBLE))
    }

    private fun getRandomSquare(): Square {
        return Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_DOUBLE))
    }

    private fun getRandomRectangle(): Rectangle {
        return Rectangle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_DOUBLE), Random.nextDouble(MAX_DOUBLE))
    }

    private fun getRandomTriangle(): RightTriangle {
        return RightTriangle(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_DOUBLE),
            Random.nextDouble(MAX_DOUBLE)
        )
    }

    private fun getRandomTrapezoid(): IsoscelesTrapezoid {
        return IsoscelesTrapezoid(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_DOUBLE),
            Random.nextDouble(MAX_DOUBLE)
        )
    }
}
