package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import kotlin.random.Random

private const val MIN_SIDE: Int = 10
private const val MAX_SIDE: Int = 100
class RandomFigureSupplier {
    private val figureSupplier = FigureSupplier()
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> generateRandomSquare(randomColor)
            FigureType.CIRCLE -> generateRandomCircle(randomColor)
            FigureType.RECTANGLE -> generateRandomRectangle(randomColor)
            FigureType.RIGHT_TRIANGLE -> generateRandomRightTriangle(randomColor)
            FigureType.ISOSCELES_TRAPEZOID -> generateRandomIsoscelesTrapezoid(randomColor)
        }
    }

    private fun generateRandomSquare(color: Color): Figure {
        val side =nextIntInRange()
        return figureSupplier.generateSquare(color, side)
    }

    private fun generateRandomCircle(color: Color): Figure {
        val radius = nextIntInRange()
        return figureSupplier.generateCircle(color, radius)
    }

    private fun generateRandomIsoscelesTrapezoid(color: Color): Figure {
        val topBase = nextIntInRange()
        val bottomBase = nextIntInRange()
        val height = nextIntInRange()
        return figureSupplier.generateIsoscelesTrapezoid(color, topBase, bottomBase, height)
    }

    private fun generateRandomRectangle(color: Color): Figure {
        val width = nextIntInRange()
        val height = nextIntInRange()
        return figureSupplier.generateRectangle(color, width, height)
    }

    private fun generateRandomRightTriangle(color: Color): Figure {
        val base = nextIntInRange()
        val height = nextIntInRange()
        return figureSupplier.generateRightTriangle(color, base, height)
    }
    private fun nextIntInRange(min: Int= MIN_SIDE, max: Int= MAX_SIDE): Int {
        return Random.nextInt(min, max)
    }
}
