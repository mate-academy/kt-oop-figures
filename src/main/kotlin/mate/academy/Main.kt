package mate.academy

import mate.academy.service.FigureSupplier

private const val DEFAULT_FIGURE_START_INDEX = 3
private const val ITEMS_QUANTITY = 6

fun main() {
    val figureSupplier = FigureSupplier()

    repeat(ITEMS_QUANTITY) {
        println(
            if (it < DEFAULT_FIGURE_START_INDEX) figureSupplier.getRandomFigure().getArea()
            else figureSupplier.getDefaultFigure().getArea()
        )
    }
}
