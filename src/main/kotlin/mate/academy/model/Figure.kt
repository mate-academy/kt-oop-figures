package mate.academy.model

import mate.academy.service.Drawable

abstract class Figure(val color: Color) : Drawable {
    abstract fun calculateArea(): Double
}
