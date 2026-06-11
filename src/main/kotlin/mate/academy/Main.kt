package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6
private const val DIVIDER = 2

fun main() {
    val figureSupplier = FigureSupplier()
    val arraySize = ARRAY_SIZE

    val figures = Array<Figure>(arraySize) { index ->
        if (index < arraySize / DIVIDER) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}
