package mate.academy

import mate.academy.figures.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()

    val figures: Array<Figure> = Array(ARRAY_SIZE) { index ->
        if (index < ARRAY_SIZE / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it.print() }
}
