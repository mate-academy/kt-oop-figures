package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

object Main {
    const val TOTAL_FIGURES = 6
    const val RANDOM_FIGURE_COUNT = 3
}

fun main() {
    val colorProvider = ColorSupplier()
    val figureSupplier = FigureSupplier(colorProvider)

    val figures = Array(Main.TOTAL_FIGURES) { index ->
        if (index < Main.RANDOM_FIGURE_COUNT) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
