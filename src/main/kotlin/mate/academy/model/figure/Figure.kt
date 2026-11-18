package mate.academy.model.figure

import mate.academy.model.Color

abstract class Figure(val color: Color ) {
    abstract fun area(): Double
    abstract fun draw()
}
