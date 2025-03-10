package mate.academy

import mate.academy.service.FigureSupplier

const val SIX = 6
const val THREE = 3
fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(SIX) { i ->
        if (i < THREE) figureSupplier.getRandomFigure() else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it?.println() }
}
