package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURE_ARRAY_SIZE = 6
const val HALF_ARRAY_SIZE = FIGURE_ARRAY_SIZE / 2

fun main() {
    val figureSupplier = FigureSupplier()

    val figures = Array<Figure>(FIGURE_ARRAY_SIZE) { i ->
        if (i < HALF_ARRAY_SIZE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it.drawFigure(it) }
}
