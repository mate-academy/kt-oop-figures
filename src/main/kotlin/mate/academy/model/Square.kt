package mate.academy.model

class Square(color: Color, val side: Double) : Figure(color) {

    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${"%.1f".format(getArea())} sq. units, " +
                "side: ${"%.1f".format(side)} units, color: $color")
    }
}
