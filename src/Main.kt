fun main() {
    println("Информация о сотрудниках")
    println()

    val employee = Employee(
        lastName = "Петров",
        firstName = "Алексей",
        middleName = "Иванович",
        position = "Менеджер",
        email = "petrov@example.ru",
        phoneNumber = "+7 (999) 123-45-67",
        salary = 60000,
        age = 35
    )

    employee.printInfo()
}