package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIRST_PART = 2
const val SECOND_PART = 5
fun main() {
    val figureList: MutableList<Figure> = mutableListOf()
    val figureSupplier = FigureSupplier()
    for(i in 0..FIRST_PART) {
        val figure = figureSupplier.getRandomFigure()
        figure.behavior()
        figureList.add(figure)
    }
    for (i in 3..SECOND_PART) {
        val figure = figureSupplier.getDefaultFigure()
        figure.behavior()
        figureList.add(figure)
    }
}
