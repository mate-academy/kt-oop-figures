package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val MAX_ARRAY_SIZE = 6
const val STEP_IN_ARRAY_WITH_DEFAULT_VALUES = 3
fun main() {
    val figureSupplier = FigureSupplier()
    val arrayOfFigures = Array<Figure>(MAX_ARRAY_SIZE) { figureSupplier.getRandomFigure() }
    for (i in STEP_IN_ARRAY_WITH_DEFAULT_VALUES until arrayOfFigures.size) {
        arrayOfFigures[i] = figureSupplier.getDefaultFigure()
    }
    arrayOfFigures.forEach { println(it.draw()) }
}
