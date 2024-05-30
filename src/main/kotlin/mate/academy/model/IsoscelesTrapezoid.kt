package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    shorterBase: Double,
    longerBase: Double,
    height: Double) : Figure(color) {
    private val shorterBase: Double = super.round(shorterBase)
    private val longerBase: Double = super.round(longerBase)
    private val height: Double = super.round(height)

    override fun draw() {
        println(
            "IsoscelesTrapezoid(" +
                    "height=$height units, " +
                    "shorterBase=$shorterBase units, " +
                    "longerBase=$longerBase units, " +
                    "color=$color " +
                    "area=${getArea()} sq. units " +
                    ")"
        )
    }

    override fun getArea(): Double {
        return super.round(HALF * (longerBase + shorterBase) * height)
    }
}
