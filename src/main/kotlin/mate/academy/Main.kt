package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val figures: Array<Figure> = Array(ARRAY_SIZE) { figureSupplier.getDefaultFigure() }
    for (i in 0..2) {
        figures[i] = figureSupplier.getRandomFigure()
    }

    for (figure in figures) {
        figure.draw()
    }
}
