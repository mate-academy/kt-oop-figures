package mate.academy.model

class IsoscelesTrapezoid(color: Color, val base1: Int, val base2: Int, val height: Int) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, base1: $base1, base2: $base2, height: $height, color: $color")
    }
}
