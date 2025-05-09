package mate.academy

import mate.academy.model.figure.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 10

fun main() {
    val figureSupplier = FigureSupplier()
    val figures : Array<Figure> = Array(ARRAY_SIZE) { figureSupplier.getDefaultFigure() }
    for (i in 0 until ARRAY_SIZE / 2) {
        figures[i] = figureSupplier.getRandomFigure()
    }
    figures.forEach { it.draw()}
}
