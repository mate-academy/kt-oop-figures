package mate.academy.figures

import mate.academy.model.Color

abstract class Figure(val color: Color) {
    abstract fun draw()
    abstract fun getArea(): Int
}
