package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURES_TOTAL = 6
const val RANDOM_FIGURES_COUNT = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array<Figure>(FIGURES_TOTAL) {
        figure -> if (figure < RANDOM_FIGURES_COUNT)
            figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
