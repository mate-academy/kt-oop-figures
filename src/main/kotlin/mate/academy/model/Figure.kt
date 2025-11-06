package mate.academy.model

abstract class Figure(
    val color: Color
) {
    abstract fun getArea(): Double
    abstract fun draw()
}
