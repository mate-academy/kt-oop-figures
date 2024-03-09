package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val LENGTH = 10
fun main() {
    val figureSupplier = FigureSupplier()
    val figures: Array<Figure?> = arrayOfNulls(LENGTH)
    for (i in 0 until figures.size - 1) {
        if (i < figures.size / 2) {
            figures[i] = figureSupplier.getRandomFigure()
        } else {
            figures[i] = figureSupplier.getDefaultFigure()
        }
        figures[i]?.draw()
    }
    // draw all figures here
}
