package mate.academy.model

class IsoscelesTrapezoid (private val baseShort : Double, private val baseLong : Double
, private val height : Double, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${getArea()}. units" +
                ", short base: $baseShort units, long base: $baseLong units" +
                ", height: $height units, color: $color")
    }

    override fun getArea(): Double = (baseShort + baseLong) * height / 2
}
