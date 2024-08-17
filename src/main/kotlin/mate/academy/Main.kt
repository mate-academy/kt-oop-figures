package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 10

fun main() {
    val figures : Array<Figure?> = arrayOfNulls(ARRAY_SIZE)
    val figureSupplier = FigureSupplier()

    for (i in 0 until ARRAY_SIZE) {
        figures[i] = if (i < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it?.draw() }
}
