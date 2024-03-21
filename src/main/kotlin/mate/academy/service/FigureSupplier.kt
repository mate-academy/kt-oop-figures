package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.models.*
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    enum class FigureType {
        SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID
    }

    fun getRandomFigure(): Figure {
        val randomType = FigureType.values().random()
        return when (randomType) {
            FigureType.SQUARE -> Square(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )

            FigureType.RECTANGLE -> Rectangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )

            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )

            FigureType.CIRCLE -> Circle(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )

            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
