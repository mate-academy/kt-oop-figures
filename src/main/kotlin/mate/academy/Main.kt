package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val SIZE = 6
const val HALF = 2
const val FROM = 0
fun main() {
    val size = SIZE
    val figures = arrayOfNulls<Figure>(size)
    val half = size.div(HALF)
    val supplier = FigureSupplier()

    for (i in FROM until half) {
        figures[i] = supplier.getRandomFigure()
    }

    for (i in half until size) {
        figures[i] = supplier.getDefaultFigure()
    }

    for (f in figures) {
        f?.printlnInfo()
    }
}
