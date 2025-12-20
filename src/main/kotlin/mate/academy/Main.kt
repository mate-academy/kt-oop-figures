package mate.academy

import mate.academy.figures.FigureSupplier
import mate.academy.figures.Figure

const val ARR_SIZE = 6

fun main() {
    val supplier = FigureSupplier()
    val array: Array<Figure> = Array(ARR_SIZE) { supplier.getRandomFigure() }
    for (i in 0 until array.size / 2) {
        array[i] = supplier.getRandomFigure()
        array[i].draw()
    }
    for (i in array.size / 2 until array.size) {
        array[i] = supplier.getDefaultFigure()
        array[i].draw()
    }
}
