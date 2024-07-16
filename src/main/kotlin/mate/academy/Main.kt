package mate.academy

import mate.academy.service.FigureSupplier

private const val ITEMS_QUANTITY = 3

fun main() {
    val figureSupplier = FigureSupplier()

    repeat(ITEMS_QUANTITY) { println(figureSupplier.getRandomFigure().getArea()) }
    repeat(ITEMS_QUANTITY) { println(figureSupplier.getDefaultFigure().getArea()) }
}
