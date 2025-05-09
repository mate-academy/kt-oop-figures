package mate.academy

import mate.academy.figure.Figure
import mate.academy.service.FigureSupplier
const val COUNTER_ARRAY = 6

fun main() {
    val figures: Array<Figure> = generateFigure(COUNTER_ARRAY)

    figures.forEach { it.drawFigure() }
}

fun generateFigure(count: Int): Array<Figure> {
    val figureSupplier = FigureSupplier()
    val figures: MutableList<Figure> = mutableListOf()
    for (i in 0 until count) {
        if (count / 2  > i) {
            figures.add(figureSupplier.getRandomFigure())
        } else figures.add(figureSupplier.getDefaultFigure())
    }
    return figures.toTypedArray()
}
