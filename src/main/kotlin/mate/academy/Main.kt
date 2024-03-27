package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier
import mate.academy.service.RandomFigureSupplier

private const val NUMBER_OF_FIGURE = 6
private const val DIVIDER = 2

fun main() {
    val figureSupplier = FigureSupplier()
    val randomFigureSupplier =RandomFigureSupplier()
    val figures = arrayOfNulls<Figure>(NUMBER_OF_FIGURE)

    figures.forEachIndexed { index, _ ->
        val figure = if (index < figures.size / DIVIDER) {
            randomFigureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figures[index] = figure
        figure?.draw()
    }
}

