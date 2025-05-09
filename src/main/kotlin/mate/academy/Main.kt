package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURE_COUNT = 30
private val figureSupplier = FigureSupplier()

fun main() {
    val figures = mutableListOf<Figure>()
    for (i in 0 until FIGURE_COUNT) {
        figures.add(if (i < FIGURE_COUNT / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        })
        figures[i].draw()
    }
}
