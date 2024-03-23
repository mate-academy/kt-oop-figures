package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val START_FIRST_PART = 0
const val END_FIRST_PART = 2
const val START_SECOND_PART = 3
const val END_SECOND_PART = 5
fun main() {
    val figureList: MutableList<Figure> = mutableListOf()
    val figureSupplier = FigureSupplier()
    for(i in START_FIRST_PART..END_FIRST_PART) {
        val figure = figureSupplier.getRandomFigure()
        figure.behavior()
        figureList.add(figure)
    }
    for (i in START_SECOND_PART..END_SECOND_PART) {
        val figure = figureSupplier.getDefaultFigure()
        figure.behavior()
        figureList.add(figure)
    }
}
