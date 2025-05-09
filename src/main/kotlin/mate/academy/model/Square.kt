package mate.academy.model

class Square(color: Color,side: Double) : Figure(color) {
    private var side: Double = super.round(side)

    override fun draw() {
        println("Square(side=$side units, color=$color, area=${getArea()} sq. units)")
    }

    override fun getArea(): Double {
        return super.round(side * side)
    }
}
