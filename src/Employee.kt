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
    constructor(
        lastName: String,
        firstName: String,
        middleName: String,
        position: String,
        email: String,
        phoneNumber: String,
        age: Int
    ) : this(
        lastName,
        firstName,
        middleName,
        position,
        email,
        phoneNumber,
        0,
        age
    )

    fun printInfo() {
        println("ФИО: $lastName $firstName $middleName")
        println("Должность: $position")
        println("Email: $email")
        println("Телефон: $phoneNumber")
        println("Зарплата: $salary руб.")
        println("Возраст: $age")
    }
}