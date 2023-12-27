package pertemuan_5.`object`

import pertemuan_5.Class.Calculator
fun main() {
    val calculator = Calculator()

    val hasilInt = calculator.tambah(1,2)
    val hasilDouble = calculator.tambah(1.2,2.3)



    println("hasil penjumlahan Int = $hasilInt")
    println("hasil penjumlahan Double = $hasilDouble")
}
