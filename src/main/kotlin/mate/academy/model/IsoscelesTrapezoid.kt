package mate.academy.model

class IsoscelesTrapezoid(color: Color, val upperBase: Double,
                         val bottomBase: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return (upperBase + bottomBase) / 2 * height
    }

    override fun draw() {
        println("Figure: isoscelestrapezoid, area: ${area()}, sq. units, " +
                "upperbase: $upperBase units, " +
                "bottombase: $bottomBase units, " +
                "height: $height units, " +
                "color: $color")
    }
}
