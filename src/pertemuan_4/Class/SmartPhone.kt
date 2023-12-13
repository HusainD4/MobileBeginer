package pertemuan_4.Class

class SmartPhone(var name: String, var brand: String, var year: Int, var isAndroid: Boolean)

val SmartPhone.getSmartPhoneINfo: String
    get() = "nama = ${this.name}, brand = ${this.brand}, tahun rilis = ${this.year}, android = ${this.isAndroid}"