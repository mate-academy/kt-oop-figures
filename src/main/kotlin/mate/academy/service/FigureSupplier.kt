package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureEnum
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val MAX_RANDOM_VALUE = 50.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {

        return when(FigureEnum.values().random()) {
            FigureEnum.CIRCLE -> getRandomCircle()
            FigureEnum.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
            FigureEnum.RECTANGLE -> getRandomRectangle()
            FigureEnum.RIGHT_TRIANGLE -> getRandomRightTriangle()
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

    private fun getRandomRectangle() : Figure {
        return Rectangle(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE))
    }

    private fun getRandomRightTriangle() : Figure {
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
