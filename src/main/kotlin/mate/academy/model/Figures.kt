package mate.academy.model

import kotlin.math.PI

sealed class Figure(protected val color: Color) : Drawable, AreaCalculatable {
    protected fun getName() = this::class.simpleName?.replace(Regex("(?<=\\w)([A-Z])"), " $0")?.lowercase()
}

interface Drawable {
    fun draw(): String
}

interface AreaCalculatable {
    fun area() : Int
}

class Square(private val side: Int, color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${area()} sq. units, side: $side units, color: ${color.getName()}"

    override fun area() = side * side
}

class Rectangle(private val firstSide: Int,
                private val secondSide: Int,
                color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${area()} sq. units, " +
                "fist side: $firstSide units, second side: $secondSide units, color: ${color.getName()}"

    override fun area() = firstSide * secondSide
}

class RightTriangle(private val firstLeg: Int,
                    private val secondLeg: Int,
                    color: Color) : Figure(color) {
    override fun draw() = "Figure: ${getName()}, area: ${area()} sq. units, " +
            "fist leg: $firstLeg units, second leg: $secondLeg units, color: ${color.getName()}"

    override fun area() = firstLeg * secondLeg / 2
}

class Circle(private val radius: Int, color: Color) : Figure(color) {
    override fun draw() =
        "Figure: ${getName()}, area: ${area()} sq. units, " +
                "radius: $radius units, color: ${color.getName()}"

    override fun area() = (PI * radius * radius).toInt()
}

class IsoscelesTrapezoid(private val fistBase: Int,
                         private val secondBase: Int,
                         private val height: Int, color: Color) : Figure(color) {
    override fun draw() =
            "Figure: ${getName()}, area: ${area()} sq. units, " +
                "fist base: $fistBase units, second base: $secondBase units, " +
                "height: $height units, color: ${color.getName()}"

    override fun area() = (fistBase + secondBase) / 2 * height
}
