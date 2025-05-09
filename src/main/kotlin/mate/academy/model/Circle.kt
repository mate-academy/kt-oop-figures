package mate.academy.model

class Circle(color: Color, radius: Double) : Figure(color) {
    private val radius:Double = super.round(radius)

    override fun draw() {
        println(
            "Circle(radius=$radius units, color=$color , area=${getArea()} sq. units)"
        )
    }

    override fun getArea(): Double {
        return radius * radius * PI
    }
}
