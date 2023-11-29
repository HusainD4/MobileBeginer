package pertemuan_2

fun main() {
    val namaDepan: String = "Husain"
    val namaBelakang = "Mulyansyah"
    val usia = 18

    println("Hello nama saya $namaDepan $namaBelakang usia saya $usia") // $ merupakan string template

    //Nullabel type
    val text: String? = null
    var textLength = text?.length
    println(textLength)

    //char
    //-- ++
    var vocal = 'A' // A = 0041 B = 0042
    println("vocal " + vocal++)
    println("vocal " + vocal++)
    println("vocal " + vocal++)
    println("vocal " + vocal--)
    println("vocal " + vocal--)
    println("vocal " + vocal--)


    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "jakarta" to "indonesia",
        "london" to "england",
        "new Delhi" to "india"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["jakarta"])


    //var anylist
    var anyList = mutableListOf('A',"Kotlin",3,true, User())

    anyList.add('D')
    anyList.add(0,12)
    anyList[4]=false
    anyList.removeAt(5)

    println("mutableList = $anyList")

}

fun User(){

}