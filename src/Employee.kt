class Employee(
    private val lastName: String,
    private val firstName: String,
    private val middleName: String,
    private val position: String,
    private val email: String,
    private val phoneNumber: String,
    private val salary: Int,
    val age: Int
) {
    fun printInfo() {
        println("ФИО: $lastName $firstName $middleName")
        println("Должность: $position")
        println("Email: $email")
        println("Телефон: $phoneNumber")
        println("Зарплата: $salary руб.")
        println("Возраст: $age лет")
    }
}