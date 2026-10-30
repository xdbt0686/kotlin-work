// COMP2850 Portfolio: Week 3
// Median of a list of Float values

fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Cannot compute median of an empty list" }

    val sorted = values.sorted()
    val n = sorted.size

    return if (n % 2 == 0) {
        (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0f
    } else {
        sorted[n / 2]
    }
}
