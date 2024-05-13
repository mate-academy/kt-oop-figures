package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val figuresQuantity = Figure::class.sealedSubclasses.size
        val randomFigureImplementation = Figure::class.sealedSubclasses[Random.nextInt(figuresQuantity)]
        return makeRandomInstance(randomFigureImplementation) as Figure
    }

    @Suppress("SpreadOperator")
    private fun makeRandomInstance(clazz: KClass<*>): Any {
        val colorSupplier = ColorSupplier()
        val constructor = clazz.primaryConstructor
        val arguments: Array<Any> = constructor!!.parameters
            .map { it.type.classifier as KClass<*> }
            .map { if (it == Color::class) colorSupplier.getRandomColor() else Random.nextInt(SIZE_LIMIT) }
            .toTypedArray()
        return constructor.call(*arguments)
    }
}

const val SIZE_LIMIT = 15
