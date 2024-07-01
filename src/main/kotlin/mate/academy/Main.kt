package mate.academy

import mate.academy.service.FigureSupplier

private const val SIZE = 20
private const val HALF_DIV = 2

fun main() {
    val fs = FigureSupplier()
    Array(SIZE) { if (it < SIZE / HALF_DIV) fs.getRandomFigure() else fs.getDefaultFigure() }.forEach { it.draw() }
}
