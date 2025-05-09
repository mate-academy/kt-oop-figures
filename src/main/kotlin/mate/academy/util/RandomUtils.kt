package mate.academy.util

import kotlin.random.Random.Default.nextInt

private const val LOWER_BOUND_START = 1
private const val LOWER_BOUND = 5
private const val UPPER_BOUND_START = 6
private const val UPPER_BOUND = 10

fun randomFullRangeInt(): Int = nextInt(LOWER_BOUND_START, UPPER_BOUND)

fun randomHighRangeInt(): Int = nextInt(UPPER_BOUND_START, UPPER_BOUND)

fun randomLowRangeInt(): Int = nextInt(LOWER_BOUND_START, LOWER_BOUND)
