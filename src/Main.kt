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
    println()

    val probationEmployee = Employee(
        lastName = "Сидоров",
        firstName = "Андрей",
        middleName = "Павлович",
        position = "Специалист",
        email = "sidorov@example.ru",
        phoneNumber = "+7 (999) 234-56-78",
        age = 45
    )

    probationEmployee.printInfo()
}