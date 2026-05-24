package mate.academy.model

const val PI = 3.14

abstract class Figure(val color: Color) : Area {
}

interface Area {
    fun area(): Double
}

class Square(color: Color, val side: Double) : Figure(color) {
    override fun area(): Double {
        return side * side
    }

}

class Rectangle(
    color: Color,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun area(): Double {
        return width * height
    }
}

class RightTriangle(
    color: Color,
    val firstLeg: Double,
    val secondLeg: Double,
) : Figure(color) {
    override fun area(): Double {
        return (firstLeg * secondLeg) / 2
    }

}

class Circle(
    color: Color,
    val radius: Double
) : Figure(color) {
    override fun area(): Double {
        return PI * (radius * radius)
    }

}

class IsoscelesTrapezoid(
    color: Color,
    val base1: Double,
    val base2: Double,
    val height: Double
) : Figure(color) {
    override fun area(): Double {
        return ((base1 + base2) / 2) * height
    }

}
