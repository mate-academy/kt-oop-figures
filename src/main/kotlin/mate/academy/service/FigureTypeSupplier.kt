package mate.academy.service

import mate.academy.model.FigureType
import kotlin.random.Random

class FigureTypeSupplier {
    fun getRandomFigureType(): FigureType {
        return FigureType.values()[Random.nextInt(FigureType.values().size)]
    }
}
