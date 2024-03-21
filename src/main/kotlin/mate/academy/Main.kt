package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()
    val numOfRandomFigures = 3
    val numOfDefaultFigures = 3

    repeat(numOfRandomFigures) {
        figures.add(figureSupplier.getRandomFigure())
    }

    repeat(numOfDefaultFigures) {
        figures.add(figureSupplier.getDefaultFigure())
    }



    figures.forEach { it.draw() }
}
