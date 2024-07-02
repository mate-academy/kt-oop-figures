package mate.academy.model

class IsoscelesTrapezoid(color: Color, val side1: Double, val side2: Double, val height: Double): Figure(color) {
    override fun getArea(): Double {
        return (side1 + side2) / 2 * height
    }

    override fun draw() {
        println("Figure: isosceles trapezoid, " +
                "area: ${getArea()} sq. units, " +
                "side1: $side1 units, " +
                "side2: $side2 units, " +
                "height: $height units, " +
                "color: $color")
    }
}
