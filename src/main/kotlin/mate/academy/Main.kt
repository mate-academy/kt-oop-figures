package mate.academy

import mate.academy.service.FigureSupplier

private const val FIGURE_COUNT = 6
private const val RANDOM_FIGURES_COUNT = 3

fun main() {
    val supplier = FigureSupplier()

    val figures = Array(FIGURE_COUNT) { index ->
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
