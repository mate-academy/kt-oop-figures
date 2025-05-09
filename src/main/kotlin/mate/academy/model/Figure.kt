package mate.academy.model

sealed class Figure(val color: Color) {
    abstract fun area(): Double
    abstract fun draw()
}

class Square(color: Color, val side: Double) : Figure(color) {
    override fun area(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${area()} sq. units, side: $side units, color: $color")
    }
}

class Rectangle(color: Color, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${area()} sq. units," +
                " width: $width units, height: $height units, color: $color")
    }

}
class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun area(): Double = (firstLeg * secondLeg) / 2

    override fun draw() {
        println("Figure: right triangle, area: ${area()} sq. units," +
                " firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }

}

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun area(): Double = radius * radius * Math.PI

    override fun draw() {
        println("Figure: circle, area: ${area()} sq. units, radius: $radius units, color: $color")
    }

}

class IsoscelesTrapezoid(color: Color, val baseL: Double, val baseB: Double, val height: Double) : Figure(color) {
    override fun area(): Double = height * (baseL + baseB) / 2

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${area()} sq. units, baseL: $baseL units, baseB: $baseB units," +
                " height: $height units, color: $color")
    }

}
