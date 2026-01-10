package mate.academy.model

class Square(color: Color, val side: Double) : Figure(color) {
    override fun area(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${area().f2()} sq. units, " +
                "side: ${side.f2()} units, color: $color ")
    }
}
