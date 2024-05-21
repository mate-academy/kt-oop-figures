package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val NUM_FIGURES = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = arrayOfNulls<Figure>(NUM_FIGURES)

    figures.forEachIndexed { index, _ ->
        figures[index] = if (index < NUM_FIGURES / 2) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it?.draw() }
}
