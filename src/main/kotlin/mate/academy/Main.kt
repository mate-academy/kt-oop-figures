package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier
import javax.management.Query.TIMES

private const val FIGURE_COUNT = TIMES * 2

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(FIGURE_COUNT) { figureSupplier.getDefaultFigure() }
    for (i in 0 until FIGURE_COUNT / 2) {
        figures[i] = figureSupplier.getRandomFigure()
    }
    for (i in FIGURE_COUNT / 2 until FIGURE_COUNT) {
        figures[i] = figureSupplier.getDefaultFigure()
    }
    for (figure in figures) {
        figure.draw()
    }
}
