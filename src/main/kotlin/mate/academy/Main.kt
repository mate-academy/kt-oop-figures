package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val NUMBER = 3
fun main() {
    val figures = mutableListOf<Figure>()
    val figureSupplier = FigureSupplier()

    repeat(NUMBER) {
        figures.add(figureSupplier.getRandomFigure())
    }

    repeat(NUMBER) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { it.draw() }
}
