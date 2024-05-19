package mate.academy.model.figures

import mate.academy.model.Color
import mate.academy.service.Drawable

sealed class Figure(val color: Color) : Drawable {
    abstract fun getArea() : Double
}