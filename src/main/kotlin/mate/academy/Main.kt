package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier
import kotlin.random.Random

const val MAX_NUMBER_OF_FIGURES = 50
fun main() {
    createFigures().forEach { println(it?.draw()) }
}

fun createFigures(): Array<Figure?> {
    val numberOfFigures = Random.nextInt(MAX_NUMBER_OF_FIGURES)
    val supplier = FigureSupplier()

    return Array(numberOfFigures) { index ->
        if (index < numberOfFigures / 2) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }
}
