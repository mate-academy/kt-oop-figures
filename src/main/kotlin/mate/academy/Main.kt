package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

const val ARRAY_LENGTH = 6

fun main() {
    val figureSupplier = FigureSupplier(ColorSupplier())
    val figures = Array(ARRAY_LENGTH){figureSupplier.getDefaultFigure()}
    for (i in 0 until figures.size / 2) {
        figures[i] = figureSupplier.getRandomFigure()
    }
    figures.forEach { figure -> figure.draw()}
}
