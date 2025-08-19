package mate.academy.model

class IsoscelesTrapezoid(color: Color, val longerBase: Double,
                         val shorterBase: Double, val height: Double) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, "
                + "longerBase: $longerBase units, shorterBase: $shorterBase units, height: $height"
                + ", color: $color")
    }

    override fun getArea(): Double =
        longerBase.plus(shorterBase).times(height).div(2)
}
