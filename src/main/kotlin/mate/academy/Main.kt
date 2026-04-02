package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val supplier = FigureSupplier()
    val size = 6
    val figures = Array<Figure>(size) { index ->
        if (index < size / 2) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }

    figures.forEach {
        it.draw()
    }
}
