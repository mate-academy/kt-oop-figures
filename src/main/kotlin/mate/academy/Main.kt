package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val LENGTH_OF_ARRAY = 10
fun main() {
    val figureSupplier = FigureSupplier()
    val array: Array<Figure> = Array(LENGTH_OF_ARRAY){figureSupplier.getDefaultFigure()}
    for (i in 0 until array.lastIndex) {
        if (i < array.size / 2) {
            array[i] = figureSupplier.getRandomFigure()
        } else {
            array[i] = figureSupplier.getDefaultFigure()
        }
        array[i].draw()
    }
}
