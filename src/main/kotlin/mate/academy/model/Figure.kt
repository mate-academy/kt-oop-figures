package mate.academy.model

const val SIZE_LIMIT = 100
const val TWO = 2

interface Figure {
    fun draw()
    fun getArea(): Double
}
