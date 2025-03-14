package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier
import mate.academy.service.TWO

const val NUMBER_OF_FIGURES = 6

fun main() {
    val supplier = FigureSupplier()

    val figures: Array<Figure> = Array(NUMBER_OF_FIGURES) { index ->
        if (index < NUMBER_OF_FIGURES / TWO) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }
    figures.forEach { it.draw() }
}
