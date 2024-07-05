package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.figures.Circle
import mate.academy.model.figures.IsoscelesTrapezoid
import mate.academy.model.figures.Rectangle
import mate.academy.model.figures.RightTriangle
import mate.academy.model.figures.Square
import kotlin.random.Random

private const val RANGE = 100.0
private const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val figures: Array<Figure> = arrayOf(
            Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            ),
            IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE),
                Random.nextDouble(RANGE)
            ),
            Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE),
                Random.nextDouble(RANGE)
            ),
            RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            ),
            Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble(RANGE)
            )
        )
        return figures[Random.nextInt(figures.size)]
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
