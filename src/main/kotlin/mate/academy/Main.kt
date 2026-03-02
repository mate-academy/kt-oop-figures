package mate.academy

import mate.academy.service.FigureSupplier

private const val THREE: Int = 3
private const val SIX: Int = 6

fun main() {
    val supplier = FigureSupplier()

    val figures = Array(SIX) { i ->
        if (i < THREE) supplier.getRandomFigure()
        else supplier.getDefaultFigure()
    }

    figures.forEach {
        it.draw()
    }
}
