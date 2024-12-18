package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val MAX_INDEX = 3
const val FIGURES_SIZE = 6


fun main() {
    val figureSupplier = FigureSupplier()

    val figures: Array<Figure> = Array(FIGURES_SIZE) { index ->
        if (index < MAX_INDEX) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
