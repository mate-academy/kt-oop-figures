package mate.academy

import mate.academy.model.Color
import mate.academy.service.ColorSupplier
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

const val MAX_RANDOM = 10

const val ARRAY_LENGTH = 6

const val FOUR = 4

enum class FigureEnum {
    SQUARE,
    RECTANGLE,
    RIGHT_TRIANGLE,
    CIRCLE,
    ISOSCELES_TRAPEZOID
}

sealed class Figure(val color: Color) {
    abstract fun draw()
}

class Square(color: Color, val side: Int): Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${side.toDouble().pow(2)}, side: $side units, color: $color")
    }
}

class Rectangle(color: Color, val x: Int, val y: Int): Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${x * y}, x: $x units, y: $y units, color: $color")
    }
}

class RightTriangle(
    color: Color,
    val x: Int,
    val y: Int,
): Figure(color) {
    override fun draw() {
        val area = x * y / 2;
        val hypotenuse = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))

        println("Figure: right triangle, area: $area, x: $x units, y: $y units, hypotenuse: $hypotenuse, color: $color")
    }
}

class Circle(color: Color, val radius: Int): Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${PI * radius.toDouble().pow(2)}, radius: $radius units, color: $color")
    }
}

class IsoscelesTrapezoid(
    color: Color,
    val legs: Int,
    val bottomSide: Int,
    val topSide: Int
): Figure(color) {

    override fun draw() {
        val height = sqrt(legs.toDouble().pow(2) - (bottomSide - topSide).toDouble().pow(2) / FOUR)
        val area = (bottomSide + topSide) * height / 2
        println("Figure: isosceles trapezoid, area: $area, legs: $legs units, " +
            "bottomSide: $bottomSide units, topSide: $topSide units, " +
            "color: $color")
    }
}

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getRandomSquare(): Square
        = Square(colorSupplier.getRandomColor(), Random.nextInt(MAX_RANDOM) + 1)

    fun getRandomRectangle(): Rectangle
        = Rectangle(
        colorSupplier.getRandomColor(),
        Random.nextInt(MAX_RANDOM) + 1,
        Random.nextInt(MAX_RANDOM) + 1
    )

    fun getRandomRightTriangle(): RightTriangle
        = RightTriangle(
            colorSupplier.getRandomColor(),
            Random.nextInt(MAX_RANDOM) + 1,
            Random.nextInt(MAX_RANDOM) + 1,
        )
    fun getRandomCircle(): Circle
        = Circle(colorSupplier.getRandomColor(), Random.nextInt(MAX_RANDOM) + 1)

    fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid
        = IsoscelesTrapezoid(
            colorSupplier.getRandomColor(),
            Random.nextInt(MAX_RANDOM) + 1,
            Random.nextInt(MAX_RANDOM) + 1,
            Random.nextInt(MAX_RANDOM) + 1,
        )

    fun getDefaultFigure(): Circle
        = Circle(Color.WHITE, MAX_RANDOM)

    fun getRandomFigure(): Figure
        = when (FigureEnum.values()[Random.nextInt(FigureEnum.values().size)]) {
            FigureEnum.SQUARE -> getRandomSquare()
            FigureEnum.RECTANGLE -> getRandomRectangle()
            FigureEnum.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureEnum.CIRCLE -> getRandomCircle()
            FigureEnum.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
    }
}

fun main() {
    val figureSupplier = FigureSupplier()

    val figures = Array(ARRAY_LENGTH) {
        if (it < ARRAY_LENGTH / 2) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
