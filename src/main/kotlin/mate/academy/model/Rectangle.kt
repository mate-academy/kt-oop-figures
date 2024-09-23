package mate.academy.model

class Rectangle(private val color: Color,
                private val height: Double,
                private val weight: Double) : Figure(color) {
    override fun draw() {
        println("""Figure: rectangle, area: ${calculateArea()} sq. units, height: $height units, weight: $weight units, color: $color""")
    }

    override fun calculateArea(): Double {
        return height * weight
    }
}
