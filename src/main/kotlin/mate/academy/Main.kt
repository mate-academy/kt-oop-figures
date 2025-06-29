package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

private const val TOTAL_FIGURES_COUNT = 6

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    val figures = Array<Figure>(TOTAL_FIGURES_COUNT) { index ->
        if (index < TOTAL_FIGURES_COUNT / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}
