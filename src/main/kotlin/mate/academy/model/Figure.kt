package mate.academy.model

open class Figure(val color: Color) {
    open fun draw() {
        println("Figure: ${this.javaClass.name.lowercase()}, color: $color")
    }
}
