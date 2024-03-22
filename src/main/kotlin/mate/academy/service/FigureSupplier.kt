package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.models.Square
import mate.academy.model.models.Rectangle
import mate.academy.model.models.RightTriangle
import mate.academy.model.models.Circle
import mate.academy.model.models.IsoscelesTrapezoid
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    companion object {
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_CIRCLE_RADIUS = 10.0
    }

    enum class FigureType {
        SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID
    }

    fun getRandomFigure(): Figure {
        val randomType = FigureType.values().random()
        return when (randomType) {
            FigureType.SQUARE -> Square(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorSupplier.getRandomColor()
            )

            FigureType.RECTANGLE -> Rectangle(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorSupplier.getRandomColor()
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorSupplier.getRandomColor()
            )

            FigureType.CIRCLE -> Circle(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorSupplier.getRandomColor()
            )

            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                colorSupplier.getRandomColor()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE)
    }
}
