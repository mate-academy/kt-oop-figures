package mate.academy.model

class Circle(color: Color,
             val radius: Int) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, " +
                "radius: $radius units, color: $color")
    }

    override fun getArea(): Double {
        return  radius * radius * Math.PI
    }
}
