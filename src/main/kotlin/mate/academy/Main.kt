package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureList: MutableList<Figure> = mutableListOf()
    val figureSupplier = FigureSupplier()
    for(i in 0..2) {
        val figure = figureSupplier.getRandomFigure()
        figure.behavior()
        figureList.add(figure)
    }
    for (i in 3..5) {
        val figure = figureSupplier.getDefaultFigure()
        figure.behavior()
        figureList.add(figure)
    }
}
