package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.model.Color
import mate.academy.service.figurestrategy.RandomStrategy

private const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val randomStrategy = RandomStrategy()

    fun getRandomFigure() = randomStrategy.getRandomStrategy().createRandomFigure()

    fun getDefaultFigure() = Circle(Color.WHITE, DEFAULT_RADIUS)
}
