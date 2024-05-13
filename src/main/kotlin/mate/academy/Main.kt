package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    (1..10).forEach() { _ -> println(figureSupplier.getRandomFigure().draw())}
}
