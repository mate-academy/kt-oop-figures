package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    repeat(TIMES_TO_REPEAT) { println(figureSupplier.getRandomFigure().draw()) }
}

const val TIMES_TO_REPEAT = 10
