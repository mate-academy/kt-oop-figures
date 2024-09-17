package mate.academy.service

import mate.academy.model.FigureType

class FigureTypeSupplier {
    fun getRandomFigureType(): FigureType = FigureType.values().random()
}
