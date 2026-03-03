package mate.academy.model

class Circle (val color: Color, val radius: Int): Figure {
    override fun draw() {
        println("Figure: circle, radius: $radius units, color: ${color.toString().lowercase()}")
    }
}