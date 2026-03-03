package mate.academy

import mate.academy.service.FigureSupplier

const val SIZE = 6
const val TWO = 2

fun main() {
    val figureSupplier = FigureSupplier()

    val figureArray = Array(SIZE) { index ->
        if (index < SIZE / TWO)
            figureSupplier.getRandomFigure()
        else
            figureSupplier.getDefaultFigure()
    }
    figureArray.forEach { it.draw() }
}
