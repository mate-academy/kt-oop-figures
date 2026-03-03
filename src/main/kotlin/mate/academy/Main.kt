package mate.academy

import mate.academy.service.FigureSupplier

const val HALFOFTHEARRAY = 3
const val SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()

    val figureArray = Array(SIZE) { index ->
        if (index < HALFOFTHEARRAY)
            figureSupplier.getRandomFigure()
        else
            figureSupplier.getDefaultFigure()
    }
    figureArray.forEach { it.draw() }
}
