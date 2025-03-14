package mate.academy

import mate.academy.service.FigureSupplier
import mate.academy.service.NUMBER_OF_FIGURES

fun main() {
    val figure = FigureSupplier()

    for (i in 1.. NUMBER_OF_FIGURES) {
        println(figure.getRandomFigure().draw())
    }
}
