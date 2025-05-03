package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val SIZE = 6
private const val NUM_OF_FIGURES = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(SIZE) {
        if (it < NUM_OF_FIGURES) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
