package mate.academy.model

const val AREA_MULTIPLIER = 0.5

class IsoscelesTrapezoid(color: String, val upperBase: Double, val bottomBase: Double,
                         val height : Double) : Figure(color) {
    override fun getArea(): Double = AREA_MULTIPLIER * (upperBase * bottomBase) * height

    override fun draw() = println("Figure: isosceles trapezoid, area: ${getArea()} sq. units,"
            + " upper base: $upperBase units, bottom base: $bottomBase units,"
            + " height: $height units, color: $color")
}
