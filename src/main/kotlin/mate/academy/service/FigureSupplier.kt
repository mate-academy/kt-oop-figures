package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val figuresQuantity = Figure::class.sealedSubclasses.size
        val randomFigureImplementation = Figure::class.sealedSubclasses[Random.nextInt(figuresQuantity)]
        return makeRandomInstance(randomFigureImplementation)
    }

    fun getDefaultFigure() = Circle(DEFAULT_SIZE, Color.WHITE)

    @Suppress("SpreadOperator")
    private fun makeRandomInstance(clazz: KClass<out Figure>): Figure {
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
const val DEFAULT_SIZE = 10
