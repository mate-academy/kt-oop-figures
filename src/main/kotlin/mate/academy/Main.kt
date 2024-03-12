package mate.academy

import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()
    val array = Array(ARRAY_SIZE) { figureSupplier.getDefaultFigure() }
    for (i in 0 until array.size / 2) {
        array[i] = figureSupplier.getRandomFigure()
    }

    array.forEachIndexed { index, figure ->
        println("Figure ${index + 1}: ${figure.getDescription()}")
    }
}
