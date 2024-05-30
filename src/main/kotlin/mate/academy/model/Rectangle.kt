package mate.academy.model

class Rectangle(color: Color, height: Double, width: Double) : Figure(color) {
    private val width: Double = super.round(width)
    private val height: Double = super.round(height)


    override fun draw() {
        println("Rectangle(height=$height units, width=$width units, color=$color, area=${getArea()} sq. units)")
    }

    override fun getArea(): Double {
        return super.round(width * height)
    }
}
