package mate.academy.model

import kotlin.math.PI

sealed class Figure(val color: Color) : Drawable {
    fun getName() = this.javaClass.simpleName.replace(Regex("(?<=\\w)([A-Z])"), " $0").lowercase()
}

interface Drawable {
    fun draw(): String
}

class Square(private val side: Int, color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${side * side} sq. units, side: $side units, color: ${color.getName()}"
}

class Rectangle(private val firstSide: Int,
                private val secondSide: Int,
                color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${firstSide * secondSide} sq. units, " +
                "fist side: $firstSide units, second side: $secondSide units, color: ${color.getName()}"
}

class RightTriangle(private val firstLeg: Int,
                    private val secondLeg: Int,
                    color: Color) : Figure(color) {
    override fun draw() = "Figure: ${getName()}, area: ${firstLeg * secondLeg / 2} sq. units, " +
            "fist leg: $firstLeg units, second leg: $secondLeg units, color: ${color.getName()}"
}

class Circle(private val radius: Int, color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${(PI * radius * radius).toInt()} sq. units, " +
                "radius: $radius units, color: ${color.getName()}"
}

class IsoscelesTrapezoid(private val fistBase: Int,
                         private val secondBase: Int,
                         private val height: Int, color: Color) : Figure(color) {
    override fun draw() =
            "Figure: ${getName()}, area: ${(fistBase + secondBase) / 2 * height} sq. units, " +
                "fistBase: $fistBase units, secondBase: $secondBase units, " +
                "height: $height units, color: ${color.getName()}"
}
