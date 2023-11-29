package pertemuan_3

fun main() {



    //OPERATOR ARITMATIKA
    println("operator aritmatika")

    val plus = 5 + 5
    val minus = 5 - 5
    val kali = 5 * 5
    val bagi = 5 / 5
    val mod = 5 % 5

    println("5 + 5 = $plus")
    println("5 - 5 = $minus")
    println("5 * 5 = $kali")
    println("5 / 5 = $bagi")
    println("5 % 5 = $mod")


    //OPERATOR PERBANDINGAN
    println("operator perbandingan")


    val a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdarisamadengan = a >= b
    val kurangdarisamadengan = a <= b
    val samadengan = a == b
    val tidaksamadengan = a != b

    println(lebihdari)
    println(kurangdari)
    println(lebihdarisamadengan)
    println(kurangdarisamadengan)
    println(samadengan)
    println(tidaksamadengan)


    // OPERATOR LOGIKA

    println("operator logika")

    val and = 10 >= 10 && 12 > 11 // dua duanya harus true (konjungsi)
    println(and)
    val or = 10 > 10 || 12 > 11 // salah satu dari statmen harus true (disjungsi)
    println(or)
    val negasi = !true  // kebalikan (negasi)
    println(negasi)


}