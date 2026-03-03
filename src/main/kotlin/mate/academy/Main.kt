package mate.academy

import mate.academy.service.FigureSupplier

const val HALFOFTHEARRAY = 3

fun main() {
    val figureSupplier = FigureSupplier()

    val figureArray = Array(6) { index ->
        if (index < HALFOFTHEARRAY)
            figureSupplier.getRandomFigure()
        else
            figureSupplier.getDefaultFigure()
    }
    figureArray.forEach { it.draw() }
}
