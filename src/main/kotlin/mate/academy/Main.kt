package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val array = arrayOf(figureSupplier.getRandomFigure(),
        figureSupplier.getRandomFigure(),
        figureSupplier.getRandomFigure(),
        figureSupplier.getDefaultFigure(),
        figureSupplier.getDefaultFigure(),
        figureSupplier.getDefaultFigure())

    for (figure in array) {
        figure.draw()
    }
}
