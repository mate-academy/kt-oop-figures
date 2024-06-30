package mate.academy.figure

import mate.academy.figure.behavior.Drawer
import mate.academy.model.Color

sealed class Figure(val colour: Color) : Drawer {
    abstract fun getArea(): Double
}