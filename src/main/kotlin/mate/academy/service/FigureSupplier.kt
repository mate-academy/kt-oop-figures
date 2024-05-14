package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import kotlin.random.Random
import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

class FigureSupplier {
    private val figuresQuantity = Figure::class.sealedSubclasses.size
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomFigureImplementation = Figure::class.sealedSubclasses[Random.nextInt(figuresQuantity)]
        return makeRandomInstance(randomFigureImplementation)
    }

    fun getDefaultFigure() = Circle(DEFAULT_SIZE, colorSupplier.getDefaultColor())

    @Suppress("SpreadOperator")
    private fun makeRandomInstance(clazz: KClass<out Figure>): Figure {
        val constructor = clazz.primaryConstructor
        val arguments: Array<Any> = constructor!!.parameters
            .map { it.type.classifier as KClass<*> }
            .map { if (it == Color::class) colorSupplier.getRandomColor() else Random.nextInt(MIN_SIZE, MAX_SIZE) }
            .toTypedArray()
        return constructor.call(*arguments)
    }
}

const val MIN_SIZE = 2
const val MAX_SIZE = 15
const val DEFAULT_SIZE = 10
