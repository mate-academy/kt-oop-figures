package mate.academy.model

sealed class Figure(open val color: Color) {
    abstract fun area(): Double
    abstract fun draw()
}
