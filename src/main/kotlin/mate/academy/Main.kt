package mate.academy

import mate.academy.service.FigureSupplier

const val FIGURES_NUMBER_FOR_RENDER = 10

fun main() {
    val figureSupplier = FigureSupplier()
    val middleIndex = FIGURES_NUMBER_FOR_RENDER / 2
    for (i in 0 until FIGURES_NUMBER_FOR_RENDER) {
        val figure = if (i < middleIndex) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
    }
}
