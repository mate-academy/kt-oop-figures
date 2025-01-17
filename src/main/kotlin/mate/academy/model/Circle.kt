package mate.academy.model

class Circle(color: Color, val radius: Int) : Figure(color) {
    override fun draw() {
        println("Figure: circle, radius: $radius, color: $color")
    }
}
