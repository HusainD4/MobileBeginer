package tugas_plugin

fun main() {

    val tugas = 10
    val uts = 30
    val uas = 91

    val rataRata = (tugas + uts + uas) / 3

    val grade: Char = when {
        rataRata in 75..100 -> 'A'
        rataRata in 65..74 -> 'B'
        rataRata in 55..64 -> 'C'
        rataRata in 45..54 -> 'D'
        else -> 'E'
    }


    println("Rata-rata nilai: $rataRata")
    println("Grade: $grade")
}