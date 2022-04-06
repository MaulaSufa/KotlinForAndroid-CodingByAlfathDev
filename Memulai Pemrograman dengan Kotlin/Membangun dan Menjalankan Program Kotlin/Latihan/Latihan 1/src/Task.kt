fun main() {
    val fullName = mapOf(
        "firstName" to "Kotlin",
        "middleName" to "is",
        "lastName" to "Awesome!"
    )
    println(fullName["firstName"] + " " + fullName["middleName"] + " " + fullName["lastName"])
}