package mate.academy

import mate.academy.figures.Figure
import mate.academy.service.FigureSupplier


const val TIMES_TO_CREATE = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = mutableListOf<Figure>()

    repeat(TIMES_TO_CREATE) {
        figures.add(figureSupplier.getRandomFigure())
    }
    repeat(TIMES_TO_CREATE) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { figure ->
        figure.draw()
    }
}
