package mate.academy.service

import kotlin.random.Random
import mate.academy.model.enums.Color

class ColorSupplier {
    fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size - 1)]
    }
}
