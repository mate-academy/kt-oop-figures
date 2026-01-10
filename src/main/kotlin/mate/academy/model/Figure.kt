package mate.academy.model

abstract class Figure(val color: Color) {
    abstract fun area(): Double
    abstract fun draw()
    fun Double.f2() = "%.2f".format(this)
}
