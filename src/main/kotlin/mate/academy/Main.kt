package mate.academy

import mate.academy.model.Square
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

const val COUNT = 6

fun main() {
    // draw all figures here
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    sequenceOf(1..COUNT)
        .flatten()
        .map {
            when {
                it <= COUNT / 2 -> figureSupplier.getRandomFigure()
                else -> figureSupplier.getDefaultFigure()
            }
        }
        .forEach { it.draw() }


}
