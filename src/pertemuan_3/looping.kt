package pertemuan_3

fun main() {

    // pengulangan
    for (i in 1 .. 5){
        println("nilai = $i")
    }
    for (i in 10 downTo 0){
        println("nilai = $i")
    }


    // for
    val cars = arrayOf("valvo","BMW","ford","mazda")
    for (x in cars){
        println(x)
    }

    //while
    var i = 0
    while (i < 5){
        println("nilai $i")
        i++
    }


    //do-while
    var percobaan = 1
    do {
        println("buka pintu - percobaan ke $percobaan")
        percobaan++
    }while (percobaan < 5)


}