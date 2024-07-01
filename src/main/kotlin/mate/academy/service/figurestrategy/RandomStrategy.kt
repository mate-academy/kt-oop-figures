package mate.academy.service.figurestrategy

import mate.academy.service.ColorSupplier

class RandomStrategy {
    private val colorSupplier = ColorSupplier()
    private val figureStrategies = listOf(
        CircleStrategy(colorSupplier),
        IsoscelesTrapezoidStrategy(colorSupplier),
        RectangleStrategy(colorSupplier),
        RightTriangleStrategy(colorSupplier),
        SquareStrategy(colorSupplier)
    )

    fun getRandomStrategy() = figureStrategies.random()
}
