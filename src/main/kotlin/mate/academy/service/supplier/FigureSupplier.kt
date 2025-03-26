package mate.academy.service.supplier

import mate.academy.model.Color
import mate.academy.service.figure.Circle
import mate.academy.service.figure.Figure
import mate.academy.service.figure.IsoscelesTrapezoid
import mate.academy.service.figure.Rectangle
import mate.academy.service.figure.RightTriangle
import mate.academy.service.figure.Square
import kotlin.random.Random

private const val MIN_RANDOM_SIZE = 1.0
private const val MAX_RANDOM_SIZE = 10.0
private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val FIGURE_TYPES_COUNT = 5

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            0 -> Square(
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                colorSupplier.getRandomColor())
            1 -> Rectangle(
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                colorSupplier.getRandomColor())
            2 -> RightTriangle(
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                Random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE),
                colorSupplier.getRandomColor())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE)
    }
}
