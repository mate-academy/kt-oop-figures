package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    for (i in 1..3) {
        figures.add(figureSupplier.getRandomFigure())
    }

    for (i in 1..3) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { it.draw() }
}
