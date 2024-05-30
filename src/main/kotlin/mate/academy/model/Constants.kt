package mate.academy.model

import kotlin.reflect.KClass

internal const val HALF: Double = .5
internal const val PI: Double = 3.14
internal const val START_UNITS_RANGE: Double = 5.00
internal const val END_UNITS_RANGE: Double = 25.00
internal const val DEFAULT_CIRCLE_RADIUS: Double = 10.00
internal const val ROUND_NUMBER: Int = 10

internal val FIGURES: Array<KClass<out Figure>> = arrayOf(
    Circle::class,
    Square::class,
    Rectangle::class,
    RightTriangle::class,
    IsoscelesTrapezoid::class
)
