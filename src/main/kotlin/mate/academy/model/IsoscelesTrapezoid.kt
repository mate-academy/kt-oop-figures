package mate.academy.model

class IsoscelesTrapezoid(color: Color, val firstSide : Double,
                         val secondSide : Double, val height : Double) : Figure(color) {
    override fun draw() {
        println("Figure: isoscelesTrapezoid, area: ${calculateArea()} sq. units, " +
                "firstSide: $firstSide units, secondSide: $secondSide units, height: $height units, color: $color")
    }

    override fun calculateArea(): Double {
        return firstSide.plus(secondSide).times(height).div(2)
    }
}
