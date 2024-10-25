package mate.academy

import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    // draw all figures here
    val figureSupplier = FigureSupplier()
    val figures = Array(ARRAY_SIZE) {
        if (it < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    // Display each figure
    figures.forEach { it.draw() }
}
