package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val supplier = FigureSupplier()

    val arraySize = 6

    val figures = Array<Figure>(arraySize) { index ->
        if (index < arraySize / 2) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
