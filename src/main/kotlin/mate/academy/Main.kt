package mate.academy

import mate.academy.figures.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    repeat(3) {
        figures.add(figureSupplier.getRandomFigure())
    }
    repeat(3) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { figure ->
        figure.draw()
    }
}
