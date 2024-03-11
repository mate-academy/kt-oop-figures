package mate.academy

import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val array = Array(ARRAY_SIZE) { FigureSupplier().getDefaultFigure() }
    for (i in 0 until array.lastIndex) {
        if (i < array.size / 2) {
            array[i] = FigureSupplier().getRandomFigure()
        }
    }

    array.forEachIndexed {
        index, figure -> println("Figure ${index + 1}: ${figure.getDescription()}")
    }
}
