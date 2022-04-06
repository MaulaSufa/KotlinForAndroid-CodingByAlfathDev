/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    data class VehicleInfo(val type: String, val maxSpeed: Int, val maxTank: Int)

    val vehInfo =  VehicleInfo("Motorcycle", 230, 10)
    val (type, maxSpeed, maxTank) = vehInfo

    val vehicle = mapOf(
        "type" to type,
        "maxSpeed" to "${maxSpeed}Km/s",
        "maxTank" to "${maxTank}Ltr"
    )

    // TODO 2
    val vehType = vehicle["type"]
    val vehMaxSpeed = vehicle["maxSpeed"]
    val vehMaxTank = vehicle["maxTank"]


    // TODO 3
    println("""
        Vehicle
        Type: $vehType
        Maximal Speed: $vehMaxSpeed
        Maximal Tank: $vehMaxTank
    """.trimIndent())

}