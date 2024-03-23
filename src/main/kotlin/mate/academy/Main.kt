package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val START_FIRST_PART = 0
const val END_FIRST_PART = 2
const val END_SECOND_PART = 5
fun main() {
    val figureList: MutableList<Figure> = mutableListOf()
    val figureSupplier = FigureSupplier()
    var figure: Figure
    for(i in START_FIRST_PART..END_SECOND_PART) {
        figure = if(i <= END_FIRST_PART) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
        figureList.add(figure)
    }
}
