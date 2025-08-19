package mate.academy.model

class Square(color: Color, val side: Double) : Figure (color) {
    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. "
                + "units, side: $side units, color: ${color.name.lowercase()}")
    }

    override fun getArea(): Double = side.times(side)
}
