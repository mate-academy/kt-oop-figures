package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val TOTAL_FIGURES = 6
    val halfOfFigures = TOTAL_FIGURES / 2

    repeat(TOTAL_FIGURES) { index ->
        val figure = if (index < halfOfFigures) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
    }
}
