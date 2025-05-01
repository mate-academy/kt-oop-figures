package mate.academy.model

abstract class Figure(private val color: Color) {
    abstract fun getArea(): Double

    fun draw() {
        println("Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()} sq. units, color: $color")
    }
}
