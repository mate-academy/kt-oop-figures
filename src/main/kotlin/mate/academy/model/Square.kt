package mate.academy.model

class Square(color: Color, val side: Double) : Figure(color) {
    override fun printlnInfo() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }

    override fun getArea(): Double = side.times(side)
}
