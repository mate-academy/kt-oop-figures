package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_RADIUS = 10
const val MAX_FIGURE_BASE_SIZE = 100

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    private val factories: List<(ColorSupplier) -> Figure> = listOf(
        { Circle(it.getRandomColor(), Random.nextInt(1, MAX_FIGURE_BASE_SIZE)) },
        {
            IsoscelesTrapezoid(
                it.getRandomColor(), Random.nextInt(1, MAX_FIGURE_BASE_SIZE),
                Random.nextInt(1, MAX_FIGURE_BASE_SIZE), Random.nextInt(1, MAX_FIGURE_BASE_SIZE)
            )
        },
        {
            Rectangle(
                it.getRandomColor(), Random.nextInt(1, MAX_FIGURE_BASE_SIZE),
                Random.nextInt(1, MAX_FIGURE_BASE_SIZE)
            )
        },
        {
            RightTriangle(
                it.getRandomColor(), Random.nextInt(1, MAX_FIGURE_BASE_SIZE),
                Random.nextInt(1, MAX_FIGURE_BASE_SIZE)
            )
        },
        { Square(it.getRandomColor(), Random.nextInt(1, MAX_FIGURE_BASE_SIZE)) }
    )

    fun getRandomFigure(): Figure {
        return factories[Random.nextInt(factories.size)].invoke(colorSupplier)
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
