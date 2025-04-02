open class BasicOperator(
    name: String,
    costPerMinute: Double,
    coverageArea: Double
) : MobileOperator(name, costPerMinute, coverageArea) {

    constructor() : this("Default Operator", 1.0, 100.0)

    override fun calculateQuality(): Double {
        return 100 * coverageArea / costPerMinute
    }

    override fun displayInfo() {
        println("Название оператора: $name")
        println("Стоимость минуты разговора: $costPerMinute")
        println("Площадь покрытия: $coverageArea")
        println("Качество: ${calculateQuality()}")
    }
}
