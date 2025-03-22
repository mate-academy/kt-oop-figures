package mate.academy.model

sealed class Figure(val color: Color) : Draw {
    abstract fun getArea(): Double
}

interface Draw {
    fun draw()
}

class Square(color: Color, var side: Double) : Figure(color) {

    override fun draw() {
        println("square, area: ${"%.2f".format(getArea())} sq. units, side: ${side} units, color: ${color}")
    }

    override fun getArea(): Double = side * side
}

class Rectangle(color: Color, var length: Double, var width: Double) : Figure(color) {

    override fun draw() {
        println("rectangle, area: ${"%.2f".format(getArea())} sq. units, length: ${length} units, width: ${width} units, color: ${color}")
    }

    override fun getArea(): Double = length * width
}

class Circle(color: Color, var radius: Double) : Figure(color) {
    override fun draw() {
        println("circle, area: ${"%.2f".format(getArea())} sq. units, radius: ${radius} units, color: ${color}")
    }

    override fun getArea(): Double = 2 * Math.PI * radius
}

class RightTriangle(color: Color, var firstLeg: Double, var secondLeg: Double) : Figure(color) {
    override fun draw() {
        println("right triangle, area: ${"%.2f".format(getArea())} sq. units, firstLeg: ${firstLeg} units, secondLeg: ${secondLeg} units, color: ${color}")
    }

    override fun getArea(): Double = firstLeg * secondLeg * 0.5
}

class IsoscelesTrapezoid(color: Color, var topSide: Double, var bottomSide: Double, var height: Double) :
    Figure(color) {
    override fun draw() {
        println(
            "isosceles trapezoid, area: ${"%.2f".format(getArea())} sq. units, topSide: ${topSide} units, bottomSide: ${bottomSide} units, " +
                    "height: ${height} units, color: ${color}"
        )
    }

    override fun getArea(): Double = (topSide + bottomSide) * 0.5 * height
}