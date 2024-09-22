package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

private const val CIRCLE_CASE = 1
private const val ISOSCELES_TRAPEZOID_CASE = 2
private const val RECTANGLE_CASE = 3
private const val RIGHT_TRIANGLE_CASE = 4
private const val FIGURE_COUNT = 5

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
        return Circle(colorSupplier.getRandomColor(), Random.nextDouble())
    }

    private fun getRandomIsoscelesTrapezoid() : Figure {
        return IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            Random.nextDouble(),
            Random.nextDouble(),
            Random.nextDouble())
    }

    private fun getRectangle() : Figure {
        return Rectangle(colorSupplier.getRandomColor(),
            Random.nextDouble(),
            Random.nextDouble())
    }

    private fun getRightTriangle() : Figure {
        return RightTriangle(colorSupplier.getRandomColor(),
            Random.nextDouble(),
            Random.nextDouble())
    }

    private fun getRandomSquare() : Figure {
        return Square(colorSupplier.getRandomColor(), Random.nextDouble())
    }

    fun getDefaultFigure() : Figure {
        return Circle(Color.WHITE, 10.0)
    }
}