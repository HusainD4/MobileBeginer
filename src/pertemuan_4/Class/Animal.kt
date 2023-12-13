package pertemuan_4.Class

class Animal(
    var name: String,
    val weight: Double,
    val age: Int,
    val ismamal: Boolean
){
    fun eat(){
        println("hai $name waktunya makan !")
    }
    fun sleep(){
        println("hai $name waktunya tidur")
    }
}