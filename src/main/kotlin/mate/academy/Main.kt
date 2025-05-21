package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val NUMBER_OF_FIGURES = 6
const val THREE = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(NUMBER_OF_FIGURES) { index ->
        if (index < THREE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}
