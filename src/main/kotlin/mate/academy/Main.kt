package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE: Int = 6

fun main() {
    val figureSupplier: FigureSupplier = FigureSupplier()
    val figures: Array<Figure> = Array(ARRAY_SIZE) {
        if (it < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }
    for (figure in figures) {
        figure.draw()
    }
}
