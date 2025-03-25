package mate.academy.model

class Rectangle(color: Color, var length: Double, var width: Double) : Figure(color) {

    override fun draw() {
        println("rectangle, area: ${"%.2f".format(getArea())} sq. units, length: ${length} units, " +
                "width: ${width} units, color: ${color}")
    }

    override fun getArea(): Double = length * width
}
