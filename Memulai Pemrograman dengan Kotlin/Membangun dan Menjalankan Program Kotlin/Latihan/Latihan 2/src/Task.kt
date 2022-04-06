data class Explain(var subject : String, var def : String)

fun main() {
    val kt = Explain("Kotlin", "is Awesome!")

    println("""
        ${kt.subject},
        ${kt.def}
    """.trimIndent())
}