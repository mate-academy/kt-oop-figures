package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val supplier = FigureSupplier()

    val figures = Array<Figure>(6) { index ->
        if (index < 3) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }

    figures.forEach {
        it.draw()
    }
}
