package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.AreaOfFigureSupplier
import mate.academy.service.DrawSupplier

sealed class Figure(val color: Color): DrawSupplier {
}

class Circle(color: Color,
             private val radius: Double): Figure(color),
    AreaOfFigureSupplier,
    DrawSupplier {
    override fun getAreaOfFigure(): Double {
        return Math.PI * radius * radius
    }

    override fun drawFigure() {
        println("Figure: circle, area: ${getAreaOfFigure()} sq. units," +
                " radius: $radius units, color: $color")
    }
}

class IsoscelesTrapezoid(color: Color,
                         private val base1: Double,
                         private val base2: Double,
                         private val height: Double): Figure(color),
    AreaOfFigureSupplier,
    DrawSupplier{
    override fun getAreaOfFigure(): Double {
        return ((base1 + base2) * height) / 2
    }

    override fun drawFigure() {
        println("Figure: isosceles trapezoid, area: ${getAreaOfFigure()} sq. units," +
                " base 1: $base1 units, base 2: $base2 units, color: $color")
    }
}

class Rectangle(color: Color,
                private val firstLeg: Double,
                private val secondLeg: Double): Figure(color),
    AreaOfFigureSupplier,
    DrawSupplier{
    override fun getAreaOfFigure(): Double {
        return firstLeg * secondLeg
    }

    override fun drawFigure() {
        println("Figure: rectangle, area: ${getAreaOfFigure()} sq. units, " +
                "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}

class RightTriangle(color: Color,
                    private val base: Double,
                    private val height: Double): Figure(color),
    AreaOfFigureSupplier, DrawSupplier{
    override fun getAreaOfFigure(): Double {
        return height * base / 2.0
    }

    override fun drawFigure() {
        println("Figure: right triangle, area: ${getAreaOfFigure()} sq. units," +
                " base: $base units, height: $height units, color: $color")
    }
}

class Square(color: Color,
             private val leg: Double) : Figure(color),
    AreaOfFigureSupplier, DrawSupplier {
    override fun getAreaOfFigure(): Double {
        return leg * leg
    }

    override fun drawFigure() {
        println("Figure: square, area: $leg sq. units," +
                " leg: $leg units, color: $color")
    }
}
