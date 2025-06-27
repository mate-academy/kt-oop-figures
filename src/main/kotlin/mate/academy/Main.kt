package mate.academy

import mate.academy.service.FigureSupplier

private const val SIX = 6
private const val THREE = 3
private val figureSupplier = FigureSupplier()

fun main() {

    val figures = Array(SIX) {
        index -> if (index < THREE) {
        figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }
    figures.forEach { it.draw() }
}
