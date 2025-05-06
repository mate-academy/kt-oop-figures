package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURE_COUNT = 6
const val RANDOM_FIGURE_COUNT = FIGURE_COUNT / 2

fun main() {
    val figureSupplier = FigureSupplier()

    val figures: Array<Figure> = Array(FIGURE_COUNT) {
        if (it < RANDOM_FIGURE_COUNT) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
