package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 10

fun main() {
    val figureSupplier = FigureSupplier()
    val figures: MutableList<Figure> = ArrayList(ARRAY_SIZE)
    for (i in 0..ARRAY_SIZE / 2) {
        figures.add(figureSupplier.getRandomFigure())
    }
    for (i in ARRAY_SIZE / 2 until ARRAY_SIZE) {
        figures.add(figureSupplier.getDefaultFigure())
    }
    figures.forEach { f -> f.draw() }
}
