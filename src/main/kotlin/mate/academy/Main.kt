package mate.academy

import mate.academy.service.Figure
import mate.academy.service.FigureSupplier

const val SIZE_OF_ARRAY = 6
const val HALF_ARRAY_SIZE = 3

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(SIZE_OF_ARRAY) {
        if (it < HALF_ARRAY_SIZE) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach(Figure::draw)
}
