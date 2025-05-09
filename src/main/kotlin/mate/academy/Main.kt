package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 4

fun main() {
    // draw all figures here
    val figureSupplier = FigureSupplier()
    val arrayMedian = ARRAY_SIZE / 2
    val figures: Array<Figure> = Array(ARRAY_SIZE) { i ->
        if (i < arrayMedian) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { figure -> figure.draw() }
}
