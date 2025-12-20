package mate.academy

import mate.academy.figures.FigureSupplier
import mate.academy.figures.Figure

const val ARR_SIZE = 6

fun main() {
    val array: Array<Figure?> = Array(ARR_SIZE) { null }
    val supplier = FigureSupplier()
    for (i in 0 until array.size / 2) {
        array[i] = supplier.getRandomFigure()
    }
    for (i in array.size / 2 until array.size) {
        array[i] = supplier.getDefaultFigure()
    }
    for (figure in array) {
        figure?.draw()
    }
}
