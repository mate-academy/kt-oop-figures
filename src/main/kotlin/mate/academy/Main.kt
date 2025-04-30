package mate.academy

import mate.academy.model.Color
import mate.academy.service.FigureSupplier

const val NUM_FIGURES = 6
const val NUM_FOR_GET_AREA = 0.5
const val NUM_RANDOM_FIGURES = 3

fun main() {
    // draw all figures here
    val figureSupplier = FigureSupplier()

    val figures: Array<Figure> = Array(NUM_FIGURES) {
        if (it < NUM_RANDOM_FIGURES) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}

interface Figure {
    var color: Color
    fun getArea(): Double
    fun draw()
}

class Square(val sideLength: Double, override var color: Color) : Figure {
    override fun getArea(): Double {
        return sideLength * sideLength
    }

    override fun draw() {
        println("Square with side length: $sideLength, color: $color, area: ${getArea()}")
    }
}

class Rectangle(val width: Double, val length: Double, override var color: Color) : Figure {
    override fun getArea(): Double {
        return width * length
    }

    override fun draw() {
        println("Rectangle with width: $width, height: $length, color: $color, area: ${getArea()}")
    }
}

class RightTriangle(val firstLeg: Double, val secondLeg: Double, override var color: Color) : Figure {
    override fun getArea(): Double {
        return NUM_FOR_GET_AREA * firstLeg * secondLeg
    }

    override fun draw() {
        println("Right Triangle with base: $firstLeg, height: $secondLeg, " +
                "color: $color, area: ${getArea()}")
    }
}

class Circle(val radius: Double, override var color: Color) : Figure {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun draw() {
        println("Circle with radius: $radius, color: $color, area: ${getArea()}")
    }
}

class IsoscelesTrapezoid(val topBase: Double, val bottomBase: Double,
                         val height: Double, override var color: Color) : Figure {
    override fun getArea(): Double {
        return NUM_FOR_GET_AREA * (topBase + bottomBase) * height
    }

    override fun draw() {
        println("Isosceles Trapezoid with top base: $topBase, bottom base: $bottomBase, " +
                "height: $height, color: $color, area: ${getArea()}")
    }
}
