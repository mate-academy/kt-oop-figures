package mate.academy.model

class IsoscelesTrapezoid(
    color: Color,
    private val upperBase: Double,
    private val lowerBase: Double,
    private val height: Double
    ) : Figure (color) {

    override fun getArea(): Double = (upperBase + lowerBase) * height / 2

    override fun draw(): String = "Figure: ${javaClass.simpleName.lowercase()}, " +
        "area: ${getArea()} sq. units, upperBase: $upperBase units, lowerBase: $lowerBase units, " +
        "height: $height units, color: ${color.toString().lowercase()}"
}
