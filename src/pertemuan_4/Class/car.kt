package pertemuan_4.Class

class car {

    var name: String = "Inova"
        get() {
            println("fungi gatter terpanggil")
            return field

        }
        set(value) {
            println("fungsi setter terpanggil")
            field = value
        }

}