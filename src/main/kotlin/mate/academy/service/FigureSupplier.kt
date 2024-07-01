package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.model.Color

private const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure() = RandomFigureType.values().random().createFigure(colorSupplier)

    fun getDefaultFigure() = Circle(Color.WHITE, DEFAULT_RADIUS)
}
