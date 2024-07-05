package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val NUMBER_OF_FIGURES = 5
const val DEFAULT_RADIUS_OF_CIRCLE = 10.0
const val MAX_SIDE_LENGTH = 100.0

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure {
        return Circle(color = Color.WHITE, radius = DEFAULT_RADIUS_OF_CIRCLE)
    }

    fun getRandomFigure(): Figure {
        return createFigures()[Random.nextInt(NUMBER_OF_FIGURES)]
    }

    private fun createFigures(): List<Figure> {
        val figures = mutableListOf<Figure>()
        figures.add(
            Circle(
                color = colorSupplier.getRandomColor(),
                radius = getRandomSize()
            )
        )
        figures.add(
            IsoscelesTrapezoid(
                color = colorSupplier.getRandomColor(),
                baseSide = getRandomSize(),
                topSide = getRandomSize(),
                height = getRandomSize()
            )
        )
        figures.add(
            Rectangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )
        )
        figures.add(
            RightTriangle(
                color = colorSupplier.getRandomColor(),
                oneSide = getRandomSize(),
                secondSide = getRandomSize()
            )
        )
        figures.add(
            Square(
                color = colorSupplier.getRandomColor(),
                side = getRandomSize(),
            )
        )
        return figures
    }

    private fun getRandomSize(): Double {
        return Random.nextDouble(MAX_SIDE_LENGTH)
    }
}
