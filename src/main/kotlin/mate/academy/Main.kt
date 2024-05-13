package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(ARRAY_SIZE) { i ->
        if (i < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    figures.forEach { println(it.draw()) }
}

const val ARRAY_SIZE = 6
