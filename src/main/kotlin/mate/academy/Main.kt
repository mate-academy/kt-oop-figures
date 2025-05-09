package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6
const val DIVIDER = 2
fun main() {
    val figureSupplier = FigureSupplier()
    val figures = arrayOfNulls<Figure>(ARRAY_SIZE)

    figures.forEachIndexed { index, value ->
        figures[index] = if (index < figures.size / DIVIDER) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it?.draw() }
}
