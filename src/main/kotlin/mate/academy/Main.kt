package mate.academy

import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6

fun main() {
    val figureSupplier = FigureSupplier()
    Array(ARRAY_SIZE) { index ->
        if (index < ARRAY_SIZE / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }.forEach { it.draw() }
}
