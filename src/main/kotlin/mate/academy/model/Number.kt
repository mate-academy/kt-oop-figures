package mate.academy.model

object NumberConstant {
 const val FIGURE_COUNT = 5
 const val DEFAULT_SIZE = 10
 const val MAX_SIZE = 15
 const val MIN_SIZE = 1
 const val RANDOM_ZERO = 0
 const val RANDOM_ONE = 1
 const val RANDOM_TWO = 2
 const val RANDOM_THREE = 3
}

enum class Number(val value: Int) {
    FIGURE_COUNT(NumberConstant.FIGURE_COUNT),
    DEFAULT_SIZE(NumberConstant.DEFAULT_SIZE),
    MAX_SIZE(NumberConstant.MAX_SIZE),
    MIN_SIZE(NumberConstant.MIN_SIZE),
    RANDOM_ZERO(NumberConstant.RANDOM_ZERO),
    RANDOM_ONE(NumberConstant.RANDOM_ONE),
    RANDOM_TWO(NumberConstant.RANDOM_TWO),
    RANDOM_THREE(NumberConstant.RANDOM_THREE)
}
