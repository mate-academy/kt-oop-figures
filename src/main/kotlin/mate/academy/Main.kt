package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURE_ARRAY_SIZE = 8

fun main() {
    // draw all figures here
    val fs  = FigureSupplier()
    val figures : Array<Figure> = Array(FIGURE_ARRAY_SIZE) {
            i -> if (i < FIGURE_ARRAY_SIZE / 2) fs.getRandomFigure()
                else fs.getDefaultFigure()}

    figures.forEach { println(it.draw()) }
}
