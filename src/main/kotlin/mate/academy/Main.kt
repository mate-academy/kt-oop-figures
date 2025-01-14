package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE: Int = 4
const val MIN_VAL: Int = 1
const val MAX_VAL: Int = 5

fun main() {
    val figureSupplier: FigureSupplier = FigureSupplier()
    val figures: Array<Figure?> = Array(ARRAY_SIZE) {null}

    for (i in 0 until ARRAY_SIZE) {
        if (i < 2) {
            figures[i] = figureSupplier.getRandomFigure((MIN_VAL..MAX_VAL).random())
        } else {
            figures[i] = figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure?.draw()
    }
}
