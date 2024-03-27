package mate.academy.model

private const val DIVIDER = 2.0

class IsoscelesTrapezoid(
    color: Color, val firstBase: Int,
    val secondBase: Int, val height: Int
) : Figure(color) {

    override fun getAria(): Double {
        return (firstBase + secondBase) / DIVIDER * height
    }

    override fun draw() {
        println(
            "Figure: isoscelesTrapezoid , " +
                    "area: ${getAria()} sq. units," +
                    " firstBase:$firstBase  units," +
                    " secondBase:$secondBase units," +
                    " height:$height units,, " +
                    " color: $color"
        )
    }
}


