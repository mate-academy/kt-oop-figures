package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

private const val RANDOM_FIGURE_ARRAY_MAX_SIZE = 2
private const val DEFAULT_FIGURE_ARRAY_MAX_SIZE = 4

fun main() {
    val figureSupplier = FigureSupplier(colorSupplier = ColorSupplier())

    val figuresArray = mutableListOf<Figure>()

    while (figuresArray.size < RANDOM_FIGURE_ARRAY_MAX_SIZE) {
        figuresArray.add(figureSupplier.getRandomFigure())
    }

    while (figuresArray.size < DEFAULT_FIGURE_ARRAY_MAX_SIZE) {
        figuresArray.add(figureSupplier.getDefaultFigure())
    }

    figuresArray.forEach { it.draw() }
}
