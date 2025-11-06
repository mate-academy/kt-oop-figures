package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.Arrays

class FigureSupplierTest {

    private val figureSupplier = FigureSupplier()

    @Test
    fun getDefaultFigure_ShouldReturnWhiteCircleWithRadius10() {
        val figure = figureSupplier.getDefaultFigure()
        assertTrue(figure is Circle)
        val circle = figure as Circle
        assertEquals(10.0, circle.radius)
        assertEquals(Color.WHITE, circle.color)
    }

    @Test
    fun getRandomFigure_ShouldReturnFigureInstance() {
        val figure = figureSupplier.getRandomFigure()
        assertTrue(
            figure is Square ||
                    figure is Rectangle ||
                    figure is RightTriangle ||
                    figure is Circle ||
                    figure is IsoscelesTrapezoid
        )
    }

    @Test
    fun getRandomFigure_ShouldHaveColorFromEnum() {
        val figure = figureSupplier.getRandomFigure()
        assertTrue(Arrays.asList(*Color.values()).contains(figure.color))
    }
}
