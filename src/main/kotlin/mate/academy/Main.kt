package mate.academy

import mate.academy.model.figure.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 50
private val figureSupplier: FigureSupplier = FigureSupplier()

fun main() {
    val figures: Array<Figure?> = Array(ARRAY_SIZE) { null }
    for (i in 0 until ARRAY_SIZE) {
        figures[i] = if (i < ARRAY_SIZE / 2) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }
    for (figure in figures) {
        figure?.draw()
    }
}
