package mate.academy.model

class Rectangle(color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun getArea(): Double = width * height

    override fun draw() {
        println(
            "Figure: rectangle, area: ${"%.1f".format(getArea())} sq. units, " +
                    "width: ${"%.1f".format(width)} units, " +
                    "height: ${"%.1f".format(height)} units, color: $color"
        )
    }
}
