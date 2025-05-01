package mate.academy.model

import mate.academy.service.AreaCalculator
import mate.academy.service.FigurePainter

abstract class Figure(val color: Color) : AreaCalculator, FigurePainter

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, radius: $radius units, color: $color")
    }
}

class Rectangle(color: Color, private val firstSide: Double, private val secondSide: Double) : Figure(color) {
    override fun getArea(): Double {
        return firstSide * secondSide
    }

    override fun draw() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, " +
                    "firstSide: $firstSide units, secondSide: $secondSide units, color: $color"
        )
    }
}

class RightTriangle(color: Color, private val firstLeg: Double, private val secondLeg: Double) : Figure(color) {
    override fun getArea(): Double {
        return firstLeg * secondLeg / 2
    }

    override fun draw() {
        println(
            "Figure: triangle, area: ${getArea()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun getArea(): Double {
        return side * side
    }

    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: $side units, color: $color")
    }
}

class IsoscelesTrapezoid(
    color: Color,
    private val firstParallel: Double,
    private val secondParallel: Double,
    private val height: Double
) : Figure(color) {
    override fun getArea(): Double {
        return height / 2 * (firstParallel + secondParallel)
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${getArea()} sq. units, height: $height units, " +
                    "firstParallel: $firstParallel units, secondParallel: $secondParallel units, color: $color"
        )
    }
}
