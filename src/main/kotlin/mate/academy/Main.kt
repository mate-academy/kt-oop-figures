package mate.academy

import mate.academy.service.FigureSupplier

const val NUMBER_OF_FIGURES = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(NUMBER_OF_FIGURES) {
        if (it < NUMBER_OF_FIGURES / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }
    figures.forEach { it.draw() }
    // draw all figures here
}
