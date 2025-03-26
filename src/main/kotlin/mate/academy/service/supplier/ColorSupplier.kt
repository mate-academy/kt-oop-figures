package mate.academy.service.supplier

import mate.academy.model.Color
import kotlin.random.Random

class ColorSupplier {
    fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size)]
    }
}
