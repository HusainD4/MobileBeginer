package pertemuan_5.Class

//inherintace
open class Employee (val nama:String) {
    fun SayHello(nama: String){
        println("hello $nama myname is ${this.nama}")
    }
}

class Manager (nama: String) : Employee(nama)