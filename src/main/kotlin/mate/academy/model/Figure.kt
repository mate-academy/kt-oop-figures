package mate.academy.model

sealed class Figure(val color: Color) : Drawable {
    abstract fun getArea(): Double
}
