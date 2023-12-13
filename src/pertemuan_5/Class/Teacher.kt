package Pertemuan5.Class

open class Teacher (val name: String){
    fun teach(){
        println("teach")
    }
    protected fun test(){
        println("Mobile")
    }
}

class SuperTeacher(name: String) : Teacher(name){
    fun cek(){
        super.test()
    }
}