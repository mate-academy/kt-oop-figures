package mate.academy.model

class IsoscelesTrapezoid(val color: Color, val diagonal: Double) : Figure {
    override fun draw() {
        println("Figure: isosceles trapezoid, digonal: $diagonal units, color: ${color.toString().lowercase()}")
    }
}