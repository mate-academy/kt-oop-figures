package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURE_ARRAY_SIZE = 8

fun main() {
    // draw all figures here
    val figureSupplier  = FigureSupplier()
    val figures : Array<Figure> = Array(FIGURE_ARRAY_SIZE) {
            i -> if (i < FIGURE_ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
                else figureSupplier.getDefaultFigure()}

    figures.forEach { println(it.draw()) }
}
