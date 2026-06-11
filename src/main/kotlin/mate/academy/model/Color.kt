package mate.academy.model

import java.util.Locale

private const val HALF = 0.5

enum class Color {
    YELLOW,
    BLUE,
    GREEN,
    WHITE,
    BLACK
}

abstract class Figure(val color: Color) {
    abstract fun getArea(): Double
    abstract fun draw()

    protected fun formatArea(): String {
        return String.format(Locale.US, "%.1f", getArea())
    }
}

class Square(val side: Double, color: Color) : Figure(color) {
    override fun getArea(): Double = side * side

    override fun draw() {
        println("Figure: square, area: ${formatArea()} sq. units, "
                + "side: ${side.toInt()} units, color: ${color.name.lowercase()}")
    }
}

class Rectangle(val width: Double, val height: Double, color: Color) : Figure(color) {
    override fun getArea(): Double = width * height

    override fun draw() {
        println("Figure: rectangle, area: ${formatArea()} sq. units, width: ${width.toInt()} units, "
                + "height: ${height.toInt()} units, color: ${color.name.lowercase()}")
    }
}

class RightTriangle(val firstLeg: Double, val secondLeg: Double, color: Color) : Figure(color) {
    override fun getArea(): Double = HALF * firstLeg * secondLeg

    override fun draw() {
        println("Figure: triangle, area: ${formatArea()} sq. units, firstLeg: ${firstLeg.toInt()} units, "
                + "secondLeg: ${secondLeg.toInt()} units, color: ${color.name.lowercase()}")
    }
}

class Circle(val radius: Double, color: Color) : Figure(color) {
    override fun getArea(): Double = Math.PI * radius * radius

    override fun draw() {
        println("Figure: circle, area: ${formatArea()} sq. units, radius: ${radius.toInt()} units, "
                + "color: ${color.name.lowercase()}")
    }
}

class IsoscelesTrapezoid(
    val topBase: Double,
    val bottomBase: Double,
    val height: Double,
    color: Color
) : Figure(color) {
    override fun getArea(): Double = HALF * (topBase + bottomBase) * height

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${formatArea()} sq. units, topBase: ${topBase.toInt()} units, "
                + "bottomBase: ${bottomBase.toInt()} units, height: ${height.toInt()} units, "
                + "color: ${color.name.lowercase()}")
    }
}
