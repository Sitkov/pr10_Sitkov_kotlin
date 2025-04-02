interface QualityCalculator {
    fun calculateQuality(): Double
}

abstract class MobileOperator(
    val name: String,
    val costPerMinute: Double,
    val coverageArea: Double
) : QualityCalculator {
    abstract fun displayInfo()
}
