package mate.academy.model

sealed class Figure(val color: Color) {
    abstract fun getArea(): Double

    abstract fun draw()
}
