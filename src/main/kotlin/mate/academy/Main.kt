package mate.academy

import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val array = Array(ARRAY_SIZE) { FigureSupplier().getDefaultFigure() }
    for (i in 0 until array.size - 1) {
        if (i < array.size / 2) {
            array[i] = FigureSupplier().getRandomFigure()
        } else {
            array[i] = FigureSupplier().getDefaultFigure()
        }
    }

    for ((index, figure) in array.withIndex()) {
        println("Figure $index: ${figure.getDescription()}")
    }
}
