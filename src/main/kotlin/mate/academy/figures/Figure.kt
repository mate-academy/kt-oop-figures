package mate.academy.figures

import mate.academy.model.Color
import mate.academy.service.Behavior
import mate.academy.service.AreaCalculator

abstract class Figure(val color: Color, val type: String)
    : Behavior, AreaCalculator {

    abstract override fun draw()

    abstract override fun area(): Double
}
