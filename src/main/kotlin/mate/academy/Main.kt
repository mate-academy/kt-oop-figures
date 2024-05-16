package mate.academy

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    const val NUM_FIGURES = 6
    val figures = arrayOfNulls<Figure>(NUM_FIGURES)

    for (i in 0 until figures.size / 2) {
        figures[i] = figureSupplier.getRandomFigure()
    }

    for (i in figures.size / 2 until figures.size) {
        figures[i] = figureSupplier.getDefaultFigure()
    }

    figures.forEach { it?.draw() }
}
