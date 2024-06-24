package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

const val FIGURE_ARRAY_SIZE = 6
const val HALF_ARRAY_SIZE = FIGURE_ARRAY_SIZE / 2

fun main() {
    val figureSupplier = FigureSupplier(ColorSupplier())

    val figures = Array<Figure>(FIGURE_ARRAY_SIZE) { i ->
        if (i < HALF_ARRAY_SIZE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    for (figure in figures) {
        figure.drawFigure(figure)
    }
}
