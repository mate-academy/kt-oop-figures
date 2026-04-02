package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6

fun main() {
    val supplier = FigureSupplier()

    val figures = Array<Figure>(ARRAY_SIZE) { index ->
        if (index < ARRAY_SIZE / 2) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
