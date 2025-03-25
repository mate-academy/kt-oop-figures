package mate.academy.model

class Square(color: Color, var side: Double) : Figure(color) {

    override fun draw() {
        println("square, area: ${"%.2f".format(getArea())} sq. units, side: ${side} units, color: ${color}")
    }

    override fun getArea(): Double = side * side
}