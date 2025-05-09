package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color

abstract class Figure(val name: String, val color: Color) : Drawing {
    abstract fun calculateArea(): Double
}
