package mate.academy.supplier

import kotlin.random.Random

class ColorSupplier {
    fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size)]
    }
}
