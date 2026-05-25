package mate.academy.model

import java.util.Locale

const val PI = 3.14

abstract class Figure(val color: Color) : DataFigures {
}

interface DataFigures {
    fun getArea(): Double
    fun print(): String
}

class Square(color: Color, val side: Double) : Figure(color) {
    override fun getArea(): Double {
        return side * side
    }

    override fun print(): String {
        return "Figure: square, area: ${String.format(Locale.US, "%.1f", getArea())} sq. units, " +
                "side: ${String.format(Locale.US, "%.1f", side)} units, " +
                "color: ${color.name.lowercase()}"
    }

}

class Rectangle(
    color: Color,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun getArea(): Double {
        return width * height
    }

    override fun print(): String {
        return "Figure: rectangle, area: ${String.format(Locale.US, "%.1f", getArea())} sq. units, " +
                "width: ${String.format(Locale.US, "%.1f", width)} units, " +
                "height: ${String.format(Locale.US, "%.1f", height)} units, " +
                "color: ${color.name.lowercase()}"
    }
}

class RightTriangle(
    color: Color,
    val firstLeg: Double,
    val secondLeg: Double,
) : Figure(color) {
    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }

    override fun print(): String {
        return "Figure: right triangle, area: ${String.format(Locale.US, "%.1f", getArea())} sq. units, " +
                "first leg: ${String.format(Locale.US, "%.1f", firstLeg)} units, " +
                "second leg: ${String.format(Locale.US, "%.1f", secondLeg)} units" +
                "color: ${color.name.lowercase()}"
    }

}

class Circle(
    color: Color,
    val radius: Double
) : Figure(color) {
    override fun getArea(): Double {
        return PI * (radius * radius)
    }

    override fun print(): String {
        return "Figure: circle, area: ${String.format(Locale.US, "%.1f", getArea())} sq. units, " +
                "radius: ${String.format(Locale.US, "%.1f", radius)} units, " +
                "color: ${color.name.lowercase()}"
    }

}

class IsoscelesTrapezoid(
    color: Color,
    val base1: Double,
    val base2: Double,
    val height: Double
) : Figure(color) {
    override fun getArea(): Double {
        return ((base1 + base2) / 2) * height
    }

    override fun print(): String {
        return "Figure: isosceles trapezoid, area: ${String.format(Locale.US, "%.1f", getArea())} sq. units, " +
                "base 1: ${String.format(Locale.US, "%.1f", base1)} units, " +
                "base 2: ${String.format(Locale.US, "%.1f", base2)} units, " +
                "height: ${String.format(Locale.US, "%.1f", height)} units, " +
                "color: ${color.name.lowercase()}"
    }

}
