package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURES = 30
private val figureSupplier = FigureSupplier()

fun main() {
    val figures = mutableListOf<Figure>()
    for (i in 0 until FIGURES) {
        figures.add(if (i < FIGURES / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        })
        figures[i].draw()
    }
}
