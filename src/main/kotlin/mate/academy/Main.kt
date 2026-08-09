package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val FIGURES_COUNT = 6
private const val RANDOM_FIGURES_COUNT = 3

fun main() {
    val supplier = FigureSupplier()

    val figures = Array<Figure>(FIGURES_COUNT) { index ->
        if (index < RANDOM_FIGURES_COUNT) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }

    figures.forEach {
        it.draw()
    }
}
