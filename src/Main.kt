fun main() {
    val employees = arrayOf(
        Employee(
            lastName = "Петров",
            firstName = "Алексей",
            middleName = "Иванович",
            position = "Менеджер",
            email = "petrov@example.ru",
            phoneNumber = "+7 (999) 123-45-67",
            salary = 60000,
            age = 35
        ),
        Employee(
            lastName = "Сидоров",
            firstName = "Андрей",
            middleName = "Павлович",
            position = "Специалист",
            email = "sidorov@example.ru",
            phoneNumber = "+7 (999) 234-56-78",
            age = 45
        ),
        Employee(
            lastName = "Иванова",
            firstName = "Елена",
            middleName = "Сергеевна",
            position = "Бухгалтер",
            email = "ivanova@example.ru",
            phoneNumber = "+7 (999) 345-67-89",
            salary = 75000,
            age = 40
        ),
        Employee(
            lastName = "Смирнов",
            firstName = "Дмитрий",
            middleName = "Александрович",
            position = "Инженер",
            email = "smirnov@example.ru",
            phoneNumber = "+7 (999) 456-78-90",
            salary = 85000,
            age = 41
        ),
        Employee(
            lastName = "Кузнецова",
            firstName = "Ольга",
            middleName = "Викторовна",
            position = "Руководитель отдела",
            email = "kuznetsova@example.ru",
            phoneNumber = "+7 (999) 567-89-01",
            salary = 100000,
            age = 52
        )
    )

    println("Информация о сотрудниках старше 40 лет")
    println()

    employees.forEach { employee ->
        if (employee.age > 40) {
            employee.printInfo()
            println()
        }
    }
}