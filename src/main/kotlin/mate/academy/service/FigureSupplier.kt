package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val MIN_RANDOM_SIZE = 1.0
const val MAX_RANDOM_SIZE = 10.0

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    private fun getRandomFigureType(): FigureType {
        return FigureType.values().random()
    }

    fun getRandomFigure(): Figure {
        return when (getRandomFigureType()) {
            FigureType.SQUARE -> Square(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            FigureType.RECTANGLE -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            FigureType.RIGHT_TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            FigureType.CIRCLE -> Circle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, MAX_RANDOM_SIZE)
    }
}
