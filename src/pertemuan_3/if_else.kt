package pertemuan_3

fun main() {
    //variabel nilai
    val nilai = 70
    if (nilai > 50){
        println("lulus")
    }else {
        println("tidak lulus")
    }



    // if di dalam if
    if (nilai > 70){
        println("A")
    }else if (nilai > 60){
        println("B")
    }else {
        println("C")
    }



    //variabel number
    val  number = 3
    val hasil = when (number){
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        else -> "nomor tidak valid"
    }
    println(hasil)

}