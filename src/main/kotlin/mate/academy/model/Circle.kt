package mate.academy.model

class Circle(color: Color, var radius: Double) : Figure(color) {
    override fun draw() {
        println("circle, area: ${"%.2f".format(getArea())} sq. units, radius: ${radius} units, color: ${color}")
    }

    override fun getArea(): Double = 2 * Math.PI * radius
}