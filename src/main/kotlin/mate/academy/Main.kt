package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

private const val FIGURE_ARRAY_MAX_SIZE = 4
private const val RANDOM_FIGURE_DIVIDER = 2

fun main() {
    val figureSupplier = FigureSupplier(colorSupplier = ColorSupplier())

    val figuresArray = mutableListOf<Figure>()

    generateFigures(figuresArray, figureSupplier)

    figuresArray.forEach { it.draw() }
}

private fun generateFigures(
    figuresArray: MutableList<Figure>,
    figureSupplier: FigureSupplier
) {
    while (figuresArray.size < FIGURE_ARRAY_MAX_SIZE / RANDOM_FIGURE_DIVIDER) {
        figuresArray.add(figureSupplier.getRandomFigure())
    }

    while (figuresArray.size < FIGURE_ARRAY_MAX_SIZE) {
        figuresArray.add(figureSupplier.getDefaultFigure())
    }
}
