package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random
import mate.academy.service.FigureType.SQUARE
import mate.academy.service.FigureType.RECTANGLE
import mate.academy.service.FigureType.RIGHT_TRIANGLE
import mate.academy.service.FigureType.CIRCLE
import mate.academy.service.FigureType.ISOSCELES_TRAPEZOID

const val MIN_RANDOM_SIZE = 1.0
const val MAX_RANDOM_SIZE = 10.0

class FigureSupplier {

    private val colorSupplier = ColorSupplier()

    private val figureTypes = FigureType.values()

    fun getRandomFigure(): Figure {
        return when (figureTypes.random()) {
            SQUARE -> Square(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            RECTANGLE -> Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            RIGHT_TRIANGLE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            CIRCLE -> Circle(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
            ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, MAX_RANDOM_SIZE)
    }
}
