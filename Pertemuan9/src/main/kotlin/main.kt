fun main() { // Pertemuan 9
    // map & set
    // Map<K, V>
    var tahunKelahiran = mapOf("Anna" to 1990, "Brian" to 1993, "Charlie" to 1992, "Donna" to 1993) // mapOf datanya tidak bisa diubah
    println(tahunKelahiran)

    var skorGame = mutableMapOf("Anna" to 2, "Brian" to 2, "Charlie" to 8, "Donna" to 6) // mutable datanya bisa diubah
    println(skorGame)

    // skorGame = mutableMapOf() // membuat map kosong
    var pairs = HashMap<String, Int>() // membuat mao kosong baru
    pairs = HashMap<String, Int>(20) // membuat map dengan kapasitas

    // akses value dari map
    println(skorGame["Charlie"])

    println(skorGame.get("Anna"))

    println(skorGame.isEmpty())
    println(skorGame.size)

    // tahunKelahiran["Anna"] = 1996 // error karena menggunakan mapOf()
    skorGame["Anna"] = 4 // Bisa diubah nilainya karena menggunakan mutablemap

    var bobBata = mutableMapOf("name" to "Bob", "Profession" to "cardlayer", "Country" to "USA")
    println(bobBata)

    // cara menambahkan key dan value pada mutablemap
    bobBata.put("state", "CA")
    bobBata["City"] = "San Fransisco"
    println(bobBata)

    // cara update value berdasarkan key di mutablemap
    bobBata.put("name", "Bobby")
    bobBata["profession"] = "Mailman"
    println(bobBata)

    // menggunakan operator infix += untuk menambahkan pasangan key/value baru ke mutable
    val pairData = "nickname" to "Bobby D Roger"
    bobBata += pairData
    println(bobBata)

    // // removing pairs
    bobBata.remove("city")
    bobBata.remove("state", "CA")
    println(bobBata)

    // for-in
    for ((player, score) in skorGame) {
        println("$player - $score")
    }

    for (player in skorGame.keys) {
        print("$player, ")
    }
    println()

    // set
    val names = setOf("Anna", "Brian", "Charlie", "Anna")
    println(names)
    val hashSet = HashSet<Int>() // membuat satu set kosong

    // set from arrays
    val bilBulatArray = arrayOf(1, 2, 3, 1)
    var bilBulatSet = mutableSetOf(*bilBulatArray) // spread operator
    println(bilBulatSet)

    // menggunakan contains
    println(bilBulatSet.contains(1)) // true

    // menggunakan in
    println(4 in bilBulatSet) // false

    // menggunakan elemen
    bilBulatSet.add(5)
    println(bilBulatSet)

    // menghapus elemen
    val removedOne = bilBulatSet.remove(5)
    println(removedOne) // true
    println(bilBulatSet) // [1, 2, 3]
}