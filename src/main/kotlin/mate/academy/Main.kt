package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val NUMBER_OF_FIGURE = 6
private const val DIVIDER = 2

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = arrayOfNulls<Figure>(NUMBER_OF_FIGURE)
    for (i in 0 until figures.size / DIVIDER) {
        figures[i] = figureSupplier.getRandomFigure()
        figures[i]!!.draw()
    }
    for (k in figures.size / DIVIDER until figures.size) {
        figures[k] = figureSupplier.getDefaultFigure()
        figures[k]!!.draw()
    }
}

