package pertemuan_5.Class

import pertemuan_5.Exception.ValidationException

fun  ValidateAndSayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("name is Blank")

    }else{
        println("Hello $name")
    }
}

fun main() {
    try {
        ValidateAndSayHello("Plugin")
        ValidateAndSayHello("")
        ValidateAndSayHello("Plugin")
    }catch (error : ValidationException){
        println("terjadi eror ${error.message}")
    }finally {
        println("program berjalan")
    }
}