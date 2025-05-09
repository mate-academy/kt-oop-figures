package mate.academy

import mate.academy.model.model.Figure
import mate.academy.supplier.FigureSupplier

const val ARRAY_SIZE: Int = 4

fun main() {

    val figureSupplier = FigureSupplier()
    val figureArray = arrayOfNulls<Figure>(ARRAY_SIZE)

    for (i in figureArray.indices) {
        if (i == 2) {
            figureArray[i] = figureSupplier.getDefaultFigure()
        } else {
            figureArray[i] = figureSupplier.getRandomFigure()
        }
    }
    figureArray.forEach { it?.draw() }
}
