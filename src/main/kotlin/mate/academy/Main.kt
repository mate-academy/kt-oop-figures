package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURES_SIZE = 6
const val FIGURES_COUNT = 3

fun main() {
    val figures : Array<Figure> = Array(FIGURES_SIZE) {i ->
        if (i < FIGURES_COUNT) {
            FigureSupplier().getRandomFigure()
        } else {
            FigureSupplier().getDefaultFigure()
        }
    }

    figures.forEach { figure -> println(figure.draw()) }
}
