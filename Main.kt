fun main() {
    // Объекты базового класса
    val operator1 = BasicOperator("MOTIV", 2.0, 150.0)
    val operator2 = BasicOperator("MTC", 3.0, 200.0)
    val operator3 = BasicOperator()

    // Вывод информации о базовых операторах
    println("Базовые операторы:")
    operator1.displayInfo()
    println()
    operator2.displayInfo()
    println()
    operator3.displayInfo()

    // Анализ качества через интерфейс
    val analyzer = OperatorAnalyzer()
    println("\nАнализ качества:")
    analyzer.analyze(operator1)
}
