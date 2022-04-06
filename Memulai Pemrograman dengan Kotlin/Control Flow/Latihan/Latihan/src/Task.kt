/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val listNumber = 1.rangeTo(100)

    val divideValue = 2
    val maxNumber = 15
    val nValue = 10

    for (number in listNumber) {
        // TODO 1
        if (number % divideValue == 0) continue

        // TODO 2
        if (number > maxNumber) break

        // TODO 3
        println("range result is ${number * (number + nValue)}")
    }
}