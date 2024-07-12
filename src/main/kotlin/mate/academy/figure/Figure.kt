package mate.academy.figure

import mate.academy.model.Color

abstract class Figure(val name: String, val color: Color) {
    abstract fun calculateArea(): Double
}
