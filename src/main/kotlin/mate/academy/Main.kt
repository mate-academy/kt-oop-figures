package mate.academy

import mate.academy.figures.Figure
import mate.academy.service.FigureSupplier

const val ARRAYSIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()

    val figures: Array<Figure> = Array(ARRAYSIZE) { index ->
        if (index < ARRAYSIZE / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it.print() }
}
