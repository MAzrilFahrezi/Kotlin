fun main() {

    // Array
    val angkaGenap = arrayOf(2, 4, 6, 8) // Array<Int>
    val limaAngka5 = Array(5, { 5 }) // 5, 5, 5, 5, 5
    val hurufVokal = arrayOf("a", "i", "u", "e", "o") // Array<String>

    val angkaGanjil = intArrayOf(1, 3, 5, 7) // array tipe primitif
    val angkaDecimal = floatArrayOf(1.2f, 1.3f)

    // intArray(), floatArrayOf(), doubleArrayOf(), booleanArrayOf()
    // IntArray(), FloatArray(), DoubleArray(), BooleanArray()
    val zeros = DoubleArray(4)// 0.0, 0.0, 0.0, 0.0
    val angkaGanjil2 = arrayOf(1, 3, 5, 7).toIntArray() // tipenya adalah IntArray bukan Array<Int>

    for (angka in angkaGenap) {
        println(angka)
    }

    angkaGanjil.forEach { angka -> println(angka) }

    // List
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars") //List<String>
    val innerPLanetArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars") // ArrayList<String>

//    val x: List<String> = listOf()
    val x = listOf<String>()

    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
//    val outerPlanets = mutableListOf<String>()
    if (outerPlanets.size < 2) {
        println("Outer Planet Kurang Dari 2")
    } else {
        println("Outer planet lebih besar atau sama dengan 2")
    }
    println(outerPlanets.first())
    println(outerPlanets.last())

    val containsPlanet = outerPlanets.let {
        println("${outerPlanets.contains("Uranus")}")
    }
    println("Nama Planet 1 : ${outerPlanets[0]}") //.first()
    println("Nama Planet 2 : ${outerPlanets[1]}")
    println("Nama Planet 3 : ${outerPlanets[2]}")
    println("Nama Planet 4 : ${outerPlanets[3]}") //.last()

    println("Nama Planet 1 : ${outerPlanets.get(0)}") //.first()
    println("Nama Planet 2 : ${outerPlanets.get(1)}")
    println("Nama Planet 3 : ${outerPlanets.get(2)}")
    println("Nama Planet 4 : ${outerPlanets.get(3)}") //.last()

    // membatasi range dengan menggunakan slice
    val filterPlanet = innerPlanets.slice(1..2)
    println(filterPlanet.joinToString(" | "))

    fun isEliminated(planet: String): Boolean {
        return planet !in outerPlanets
    }

    println(isEliminated("Pluto")) // true, Pluto memang tidak ada di outerPlanet
    println(isEliminated("Uranus")) // false, Uranus memang ada di outerPlanet

    println(outerPlanets.slice(1..3).contains("Saturn")) // true

    // Menambahkan elemen dengan menggunakan add()
    outerPlanets.add("Pluto")
    outerPlanets += "Pluto 2" // outerPlanets = outerPlanets + "Pluto2"
    println(outerPlanets.joinToString(" || "))

    //menghapus elemen dengan menggunakan remove()
    outerPlanets.remove("Pluto")
    println(outerPlanets.joinToString (" || "))
    outerPlanets[4] = "New Pluto"
    println(outerPlanets.joinToString (" || "))
    outerPlanets.sort()
    println(outerPlanets.joinToString (" || "))
    outerPlanets.removeAt(1)
    println(outerPlanets.joinToString (" || "))
}
