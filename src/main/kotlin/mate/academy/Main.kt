package mate.academy

import mate.academy.service.FigureSupplier
import mate.academy.service.ONE
import mate.academy.service.THREE

const val NUMBER_OF_FIGURES = 6

fun main() {
    val figure = FigureSupplier()

    for (i in ONE.. NUMBER_OF_FIGURES) {
        if (i <= THREE) {
            println(figure.getRandomFigure().draw())
        } else {
            println(figure.getDefaultFigure().draw())
        }

    }
}
