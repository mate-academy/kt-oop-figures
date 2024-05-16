package mate.academy

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = arrayOfNulls<Figure>(6)

    for (i in 0 until figures.size / 2) {
        figures[i] = figureSupplier.getRandomFigure()
    }

    for (i in figures.size / 2 until figures.size) {
        figures[i] = figureSupplier.getDefaultFigure()
    }

    figures.forEach { it?.draw() }
}
