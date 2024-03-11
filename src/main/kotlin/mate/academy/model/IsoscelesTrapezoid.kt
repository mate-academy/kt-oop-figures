package mate.academy.model

class IsoscelesTrapezoid(color: Color,
                         val firstBase: Int,
                         val secondBase: Int,
                         val height: Int) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, " +
                "firstBase: $firstBase units, secondBase: $secondBase units," +
                "height: $height units, color: $color")
    }

    override fun getArea(): Double {
        return (firstBase + secondBase) / 2.0 * height
    }
}
