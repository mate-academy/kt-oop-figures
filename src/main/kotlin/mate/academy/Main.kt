package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val TOTAL_FIGURES = 6
private const val RANDOM_FIGURES_COUNT = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(TOTAL_FIGURES) { index ->
        if (index < RANDOM_FIGURES_COUNT) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it.draw() }
}
