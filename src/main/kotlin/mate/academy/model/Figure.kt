package mate.academy.model

import mate.academy.service.ColorSupplier
import mate.academy.service.PropertiesSupplier

val colorSupplier: ColorSupplier = ColorSupplier()
val propertiesSupplier: PropertiesSupplier = PropertiesSupplier()

sealed class Figure(
    open val color: String = colorSupplier.getRandomColor().toString(),
    open val base: Double = propertiesSupplier.getRandomProperties()
) {

    abstract fun area(): Double
    abstract fun draw(): String
}
