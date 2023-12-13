package pertemuan_4.Class

class Laptop(name: String, Brand: String, year: Int) {
    val name:String
    val Brand:String
    val year:Int
    var price:Int


    init {
        this.name = name
        this.Brand = Brand
        this.year = if (year < 2015)0 else year
        this.price = 6700000
    }
    constructor(name: String, Brand: String, year: Int, price: Int): this(name,Brand,year){
        this.price = price
    }
}