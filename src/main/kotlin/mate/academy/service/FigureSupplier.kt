package mate.academy.service


import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import mate.academy.model.Color
import kotlin.random.Random

private const val CIRCLE_CASE = 1
private const val ISOSCELES_TRAPEZOID_CASE = 2
private const val RECTANGLE_CASE = 3
private const val RIGHT_TRIANGLE_CASE = 4
private const val FIGURE_COUNT = 5
private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val MAX_RANDOM_VALUE = 50.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        return when(Random.nextInt(FIGURE_COUNT)) {
            CIRCLE_CASE -> getRandomCircle()
            ISOSCELES_TRAPEZOID_CASE -> getRandomIsoscelesTrapezoid()
            RECTANGLE_CASE -> getRectangle()
            RIGHT_TRIANGLE_CASE -> getRightTriangle()
            else -> getRandomSquare()
        }
    }

    private fun getRandomCircle() : Figure {
        return Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
    }

    private fun getRandomIsoscelesTrapezoid() : Figure {
        return IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE))
    }

    private fun getRectangle() : Figure {
        return Rectangle(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE))
    }

    private fun getRightTriangle() : Figure {
        return RightTriangle(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE))
    }

    private fun getRandomSquare() : Figure {
        return Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
    }

    fun getDefaultFigure() : Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }
}
