package pertemuan_4.Object

import pertemuan_4.Class.Laptop

fun main() {
    val pluginLaptop = Laptop("Thinkpad","Lenovo", 2016,4000000)
    println("nama = ${pluginLaptop.name}, Brand = ${pluginLaptop.Brand}, Tahun = ${pluginLaptop.year}, harga = ${pluginLaptop.price}")
}