package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(ARRAY_SIZE) {
        if (it < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
