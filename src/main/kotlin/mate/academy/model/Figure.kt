package mate.academy.model

import mate.academy.service.AreaCalculator
import mate.academy.service.Drawable

sealed class Figure(val color: Color) : Drawable, AreaCalculator {
    abstract override fun printlnInfo()

    abstract override fun getArea(): Double
}
