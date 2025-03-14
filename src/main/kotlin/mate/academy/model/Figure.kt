package mate.academy.model

import mate.academy.enums.Color
import mate.academy.interfaces.Drawable
import mate.academy.interfaces.FigureArea

abstract class Figure(val color: Color) : Drawable, FigureArea {
    abstract override fun draw()

    abstract override fun getArea(): Double
}
