package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val GET_FIGURES = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    repeat(GET_FIGURES) {
        figures.add(figureSupplier.getRandomFigure())
    }

    repeat(GET_FIGURES) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { it.draw() }
}
