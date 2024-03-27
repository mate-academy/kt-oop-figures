package mate.academy.model

class Circle(color: Color, val radius: Int) : Figure(color) {
    override fun getArea(): Double {
        return kotlin.math.PI * radius * radius
    }

    override fun draw() {
        println(
            "Figure: circle , area: ${getArea()} sq. units," +
                    " radius:$radius  units, color: $color"
        )
    }
}



