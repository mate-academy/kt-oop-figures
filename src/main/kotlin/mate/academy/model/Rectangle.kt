package mate.academy.model

class Rectangle (color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area ${getArea()} sq. units,"
                + " width: $width units, height: $height units, color: $color")
    }

    override fun getArea(): Double = width * height
}
