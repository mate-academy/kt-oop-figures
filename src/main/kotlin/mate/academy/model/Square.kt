package mate.academy.model

class Square(val color: String, val side: Double): Figure(color) {
    override fun getArea(): Double {
        return side * side
    }

    override fun draw() {
        println("Figure: square, area: ${getArea()}.sq units, side: $side, color: $color")
    }
}