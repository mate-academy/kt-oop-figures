package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

enum class FigureType {
    SQUARE,
    RECTANGLE,
    RIGHT_TRIANGLE,
    CIRCLE,
    ISOSCELES_TRAPEZOID
}

class FigureSupplier(private val colorSupplier: ColorSupplier = ColorSupplier()) {
    companion object {
        private const val DEFAULT_RADIUS = 10.0
        private const val MIN_RANDOM_VALUE = 1.0
        private const val MAX_RANDOM_VALUE = 10.0
    }

    fun getRandomFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE)
            )

            FigureType.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE)
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE)
            )

            FigureType.CIRCLE -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE)
            )

            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
