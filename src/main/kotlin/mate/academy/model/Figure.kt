package mate.academy.model

abstract class Figure(val color : Color) : Drawable {
    abstract fun getArea() : Double
}
