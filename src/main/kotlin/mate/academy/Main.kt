package mate.academy

import mate.academy.service.FigureSupplier

const val NUM_FIGURES = 6
const val FIGURE_THRESHOLD = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(NUM_FIGURES) { i ->
        if (i < FIGURE_THRESHOLD) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
