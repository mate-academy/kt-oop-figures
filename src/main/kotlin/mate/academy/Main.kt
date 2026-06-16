package mate.academy

import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6
private const val INDEX_SIZE = ARRAY_SIZE / 2
fun main() {

    val figureSupplier = FigureSupplier()

    val figures = Array(ARRAY_SIZE) { index ->

        if (index < INDEX_SIZE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { figure -> figure.draw() }
}
