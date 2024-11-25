package mate.academy.model

class Square(color: String, private val side: Double) : Figure(color) {
    override fun getArea(): Double {
        return side * side
    }

    override fun draw() {
        println("Figure: square, area: ${getArea()}, side: $side, color: $color")
    }
}
