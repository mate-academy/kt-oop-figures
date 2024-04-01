package mate.academy

import mate.academy.model.Color
import mate.academy.service.ColorSupplier
import java.util.*
import kotlin.math.PI
import kotlin.math.pow
import kotlin.random.Random

private const val HALF = 0.5
private const val MIN_RANDOM_VALUE = 1.0
private const val MAX_RANDOM_VALUE = 10.0
private const val DEFAULT_CIRCLE_RADIUS = 10.0
private const val FIGURES_COUNT = 6
private const val RANDOM_FIGURES_COUNT = 3

abstract class Figure(val color: Color) {
    abstract fun area(): Double
    abstract fun draw()
}

class Square(
    private val side: Double,
    color: Color
) : Figure(color) {
    override fun area(): Double = side * side

    override fun draw() {
        println("""Figure: square, area: ${area()} sq. units,
            side: $side units, color: $color""".trimMargin())
    }
}

class Rectangle(
    private val length: Double,
    private val width: Double,
    color: Color
) : Figure(color) {
    override fun area(): Double = length * width

    override fun draw() {
        println("""Figure: rectangle, area: ${area()} sq. units, 
            length: $length units, 
            width: $width units, 
            color: $color""".trimMargin())
    }
}

class RightTriangle(
    private val firstLeg: Double,
    private val secondLeg: Double,
    color: Color
) : Figure(color) {
    override fun area(): Double = HALF * firstLeg * secondLeg

    override fun draw() {
        println("""Figure: triangle, area: ${area()} sq. units, 
            firstLeg: $firstLeg units, 
            secondLeg: $secondLeg units, 
            color: $color""".trimMargin())
    }
}

class Circle(
    private val radius: Double,
    color: Color
) : Figure(color) {
    override fun area(): Double = PI * radius.pow(2)

    override fun draw() {
        println("""Figure: circle, area: ${area()} sq. units, 
            radius: $radius units, 
            color: $color""".trimMargin())
    }
}

class IsoscelesTrapezoid(
    private val upperBase: Double,
    private val lowerBase: Double,
    private val height: Double,
    color: Color
) : Figure(color) {
    override fun area(): Double = HALF * (upperBase + lowerBase) * height

    override fun draw() {
        println("""Figure: trapezoid, area: ${area()} sq. units, 
             upperBase: $upperBase units, 
             lowerBase: $lowerBase units, 
             height: $height units, 
             color: $color""".trimMargin())
    }
}

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    private val figureTypesStack = Stack<String>()

    init {
        figureTypesStack.push("Square")
        figureTypesStack.push("Rectangle")
        figureTypesStack.push("RightTriangle")
        figureTypesStack.push("Circle")
        figureTypesStack.push("IsoscelesTrapezoid")
    }

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (val figureType = figureTypesStack.pop()) {
            "Square" -> Square(Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), color)

            "Rectangle" -> Rectangle(
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                color
            )

            "RightTriangle" -> RightTriangle(
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                color
            )

            "Circle" -> Circle(Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE), color)

            "IsoscelesTrapezoid" -> IsoscelesTrapezoid(
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                Random.nextDouble(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE),
                color
            )

            else -> throw IllegalArgumentException("Unknown figure type: $figureType")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE)
    }
}

fun main() {
    val figureSupplier = FigureSupplier()
    val figures =
        Array(FIGURES_COUNT) {
            if (it < RANDOM_FIGURES_COUNT)
                figureSupplier.getRandomFigure()
            else
                figureSupplier.getDefaultFigure()
        }

    figures.forEach { it.draw() }
}
