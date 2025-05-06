package mate.academy.service

const val MIN = 0
const val MAX = 100

class PropertiesSupplier {
    fun getRandomProperties(): Double {
        return (MIN..MAX).random().toDouble()
    }
}
