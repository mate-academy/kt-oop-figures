package mate.academy.service

import mate.academy.model.Color
import kotlin.random.Random

class ColorSupplier {
    fun getRandomColor(): Color {
        return Color.values().random()
    }

    fun getDefaultColor() = Color.WHITE
}
