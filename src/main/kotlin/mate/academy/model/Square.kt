package mate.academy.model

class Square(private val side : Double, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${String.format("%.2f", getArea())}. units" +
                ", side: $side units, color: $color")
    }

    override fun getArea() : Double {
        return side * side
    }
}
