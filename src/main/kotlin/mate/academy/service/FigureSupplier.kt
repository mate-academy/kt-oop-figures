package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    companion object {
        private const val MIN_SIZE = 1.0
        private const val MAX_SIZE = 10.0
        private const val DEFAULT_RADIUS = 10.0
    }
    fun getRandomFigure() : Figure {
        val color = colorSupplier.getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            FigureType.CIRCLE -> Circle(color, Random.nextDouble(MIN_SIZE, MAX_SIZE))
            FigureType.RECTANGLE -> Rectangle(color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE))
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE))
            FigureType.RIGHT_TRIANGLE -> RightTriangle(color,
                Random.nextDouble(MIN_SIZE, MAX_SIZE),
                Random.nextDouble(MIN_SIZE, MAX_SIZE))
        }
    }

    fun getDefaultFigure() : Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
