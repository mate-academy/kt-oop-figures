package mate.academy.model

import mate.academy.Drawable

abstract class Figure(val color: Color):Drawable {
    abstract fun getArea():Double
}
