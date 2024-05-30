package mate.academy.model

interface AreaCalculator {
    fun getArea(): Double

    fun round(num: Double): Double {
        return num.times(ROUND_NUMBER)
            .toInt()
            .toDouble()
            .div(ROUND_NUMBER)
    }
}
