package mate.academy.model

class RightTriangle(color: Color,base: Double,height: Double) : Figure(color) {
    private val base: Double = super.round(base)
    private val height: Double = super.round(height)

    override fun draw() {
        println("RightTriangle(base=$base units, height=$height) units, color=$color, area=${getArea()} sq. units")
    }

    override fun getArea(): Double {
        return super.round(HALF * base * height)
    }

    override fun toString(): String {
        return "RightTriangle(base=$base, height=$height)"
    }
}
