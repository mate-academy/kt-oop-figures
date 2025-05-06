package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val MAX_CAPACITY = 6
const val COUNT_ELEMENTS = 3

fun main() {
    val figureSupplier: FigureSupplier = FigureSupplier()

    var figures: ArrayList<Figure> = ArrayList(MAX_CAPACITY)

    repeat(COUNT_ELEMENTS) {
        figures.add(figureSupplier.getRandomFigure())
    }

    repeat(COUNT_ELEMENTS) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach{println(it.draw())}
}
