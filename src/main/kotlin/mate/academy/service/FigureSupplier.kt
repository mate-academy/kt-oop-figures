package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

import kotlin.random.Random

const val MAX_RANDOM_NUMBER = 100.0
const val NUMBER_OF_FIGURES = 4
const val CIRCLE_NUMBER = 0
const val ISOSCELES_TRAPEZOID_NUMBER = 1
const val RECTANGLE_NUMBER = 2
const val RIGHT_TRIANGLE_NUMBER = 3
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(NUMBER_OF_FIGURES)) {
            CIRCLE_NUMBER -> getRandomCircle()
            ISOSCELES_TRAPEZOID_NUMBER -> getRandomIsoscelesTrapezoid()
            RECTANGLE_NUMBER -> getRandomRectangle()
            RIGHT_TRIANGLE_NUMBER -> getRandomRightTriangle()
            else -> getRandomSquare()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    private fun getRandomCircle(): Figure {
        return Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_NUMBER))
    }

    private fun getRandomIsoscelesTrapezoid(): Figure {
        return IsoscelesTrapezoid(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_NUMBER),
            Random.nextDouble(MAX_RANDOM_NUMBER),
            Random.nextDouble(MAX_RANDOM_NUMBER),
            )
    }

    private fun getRandomRectangle(): Figure {
        return Rectangle(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_NUMBER),
            Random.nextDouble(MAX_RANDOM_NUMBER),
        )
    }

    private fun getRandomRightTriangle(): Figure {
        return RightTriangle(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_NUMBER),
            Random.nextDouble(MAX_RANDOM_NUMBER),
        )
    }

    private fun getRandomSquare(): Figure {
        return Square(
            colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_NUMBER),
        )
    }
}
