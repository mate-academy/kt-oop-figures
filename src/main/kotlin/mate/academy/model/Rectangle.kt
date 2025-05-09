package mate.academy.model

class Rectangle(val color: String, val firstSide: Double, val secondSide: Double): Figure(color) {
    override fun getArea(): Double {
        return firstSide * secondSide
    }

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()}.sq units, first side: $firstSide, " +
                "second side: $secondSide, color: $color")
    }
}
