package mate.academy.service

import mate.academy.model.Color
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ColorSupplierTest {

    @Test
    fun getRandomColor_ShouldReturnColorFromEnum() {
        val colorSupplier = ColorSupplier()
        val color = colorSupplier.getRandomColor()
        assertTrue(Color.values().contains(color))
    }
}
