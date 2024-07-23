package mate.academy

import mate.academy.service.FigureSupplier

private const val NUMBER_OF_FIGURES = 6
private val figureSupplier = FigureSupplier()

fun main() {
    val figures = Array(NUMBER_OF_FIGURES) {
        if (it < NUMBER_OF_FIGURES / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
