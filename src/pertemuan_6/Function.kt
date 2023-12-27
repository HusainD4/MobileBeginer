package pertemuan_6

fun main(
    name : String = "binarian",
    negara : String = "Indonesia") : String {


    println(UcapanUlangTahun("POLTEK",12 ))
    println(UcapanUlangTahun("PLUG-IN",14))
    println(UcapanUlangTahun(age = 19, name = "Husain")) //named parameter

    return "$name $negara"
}

fun UcapanUlangTahun(name: String, age: Int) : String{
    val nama = "Selamat Ulang Tahun, $name!"
    val usia = "usia anda sekarang $name $age tahun"

    return "$nama\n$usia"
}

