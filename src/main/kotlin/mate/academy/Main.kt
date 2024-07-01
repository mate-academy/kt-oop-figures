package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val fs = FigureSupplier()
    val size = 20
    Array(size) { if (it < size / 2) fs.getRandomFigure() else fs.getDefaultFigure() }.forEach { it.draw() }
}
