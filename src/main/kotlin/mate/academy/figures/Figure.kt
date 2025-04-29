package mate.academy.figures

import mate.academy.model.Color

abstract class Figure(val color: Color) {

    abstract fun getArea() : Double

    abstract fun print()
}
