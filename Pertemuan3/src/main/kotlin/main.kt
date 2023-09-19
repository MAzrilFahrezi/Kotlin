fun main() {

    // Tipe Data
    // Long, Int, short, Byte, Float
    // Long (64 bit) : -2^63 sampai 2^63 - 1
    // Int (32 bit) : -2^31 sampai 2^31 - 1
    // Short (16 bit) : -32768 sampai 32768
    // Byte (8 bit) : -128 sampai 127

    // Double (64 bit) : menyimpan nilai numerik pecahan 15-16 di belakang koma
    // Float (32 bit) : menyimpan nilai numerik pecahan 6-7 angka di belakang koma

    val angkaInt: Int = 100
    val angkaLong: Long = 1000
    val angkaLong2 = 2000L // dengan menambahkan suffix L
    val angkaShort: Short = 10
    val angkaByte: Byte = 2
    val angkaByte2 = 10101011 //171

    val angkaDouble: Double = 1.4
    val angkaFloat: Float = 0.123456789f


    val a = 1 + 2
    val b = 1 + 2.0
    val c = 2_500_000 - 1L
    val d = 3.14 * 2.17
    val e = 10 / 7

    val f = 7 / 2
    println(f == 3)

    val g = 5L / 2
    println(g == 2L)

    val h = 5 / 2.toDouble()
    println(h == 2.5)

    val i = (1 shl 2) and 0x000FF000

    println(0)
    println(0.0)
    println(0.00)
    println(-0.00)
    println(Double.POSITIVE_INFINITY)
    println(Double.NEGATIVE_INFINITY)
    println(Double.NaN)

    // Pair dan Triple
    val koordinat: Pair<Int, Int> = Pair(2, 3)
    val koordinat2 = Pair(2,3)
    val kooridnat3 = 2 to 3

    val x1 = koordinat.first
    val y1 = koordinat.second
    val (x2,y2) = koordinat

    //val koordinat3D: Triple<Int, Int, Int> = Triple(2, 3, 1)
    val koordinat3D = Triple(2, 3, 1)
    val x3 = koordinat3D.first
    val y3 = koordinat3D.second
    val z3 = koordinat3D.third
    val (x4, y4, z4) = koordinat3D
    val (x5, y5, _) = koordinat3D

    // Any, Unit, Nothing
    val anyNumber: Any = 42
    val anyString: Any = "42"

    fun add(): Unit{
        val result = 2+2
        println(result)
    }

    fun doNothingForever(): Nothing{
        while (true){

        }
    }

    val o: Short = 12
    val p: Byte = 120
    val q: Int = -100000

    val answer = o + p + q
    println(answer)

}