package mate.academy.model

abstract class Figure(val color: Color) {
    abstract fun area() : Double

    abstract fun draw()
}
