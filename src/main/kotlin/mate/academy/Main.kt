package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val START = 0

private const val END = 5

private const val DEFAULT_SIZE = 6

private const val DIVIDER = 2

fun main() {
    val figureSupplier = FigureSupplier()
    val arrayOfFigures: Array<Figure?> = arrayOfNulls(DEFAULT_SIZE)
    val middleOfLoop = arrayOfFigures.size / DIVIDER

    for (i in START..END) {
        arrayOfFigures[i] = if (i < middleOfLoop) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    arrayOfFigures.forEach { it?.draw() }
}
