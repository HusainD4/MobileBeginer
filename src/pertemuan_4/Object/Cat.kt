package pertemuan_4.Object

import pertemuan_4.Class.Animal

//val namaobjectnya = namaclassnya([property])

fun main() {
    val pluginCat = Animal("Mochi",2.2,1,true)
    println("nama = ${pluginCat.name}, Berat = ${pluginCat.weight}KG, Usia = ${pluginCat.age} Tahun, Mamalia = ${pluginCat.ismamal}")
    pluginCat.name = "bont"
    println("nama = ${pluginCat.name}")
    pluginCat.eat()
    pluginCat.sleep()
    //gatter setter



}