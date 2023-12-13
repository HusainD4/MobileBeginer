package pertemuan_4.Object

import pertemuan_4.Class.car

fun main() {
    var plugginCar = car()
    println("nama Mobil = ${plugginCar.name}")
    plugginCar.name = "avanza"
    println("nama Mobil = ${plugginCar.name}")

}