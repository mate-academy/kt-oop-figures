package mate.academy

import mate.academy.service.supplier.ColorSupplier
import mate.academy.service.supplier.FigureSupplier

private const val TOTAL_FIGURES = 6
private const val RANDOM_FIGURES_COUNT = 3

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    val figures = Array(TOTAL_FIGURES) {
        if (it < RANDOM_FIGURES_COUNT) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure() }

    figures.forEach { it.draw() }
}
