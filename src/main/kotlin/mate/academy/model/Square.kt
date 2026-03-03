package mate.academy.model

class Square(val color: Color, val area: Double) : Figure {
    override fun draw() {
        println("Figure: square, area: $area sq. units, color: ${color.toString().lowercase()}")
    }
}