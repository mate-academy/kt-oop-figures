package mate.academy.model

class Square(color: String, val side: Double) : Figure(color) {
    override fun getArea(): Double = side * side

    override fun draw() = println("Figure: square, area: ${getArea()} sq. units,"
            + " side: $side units, color: $color")
}
