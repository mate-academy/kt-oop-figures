package mate.academy.model

class Rectangle(color: Color,
                private val height: Double,
                private val width: Double)
    : Figure(color) {
    override fun area(): Double = height * width

    override fun draw() {
        println(
            "Figure: rectangle, area: ${area()} sq. units, " +
                    "height: $height units, " +
                    "width: $width units, " +
                    "color: $color")
    }
}
