package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val NUMBER_OF_FIGURES = 6

fun main() {
    val figureSupplier: FigureSupplier = FigureSupplier()
    val figures: Array<Figure> = Array(NUMBER_OF_FIGURES) {
        if (it < NUMBER_OF_FIGURES / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    for (figure in figures) {
        figure.draw()
    }
}
