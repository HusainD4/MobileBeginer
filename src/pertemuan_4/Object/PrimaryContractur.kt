package pertemuan_4.Object

import pertemuan_4.Class.Laptop

fun main() {
    val pluginLaptop = Laptop("Ideaslim 3", "Lenovo", 2023)
    println("nama = ${pluginLaptop.name}, brand = ${pluginLaptop.Brand}, tahun = ${pluginLaptop.year}")
}