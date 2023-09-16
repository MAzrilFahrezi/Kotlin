import kotlin.math.*

fun main() {

    println("Hello Everyone")
    //ini adalah contoh komentar --> CTRL + /
    /* ini adalah contoh
       komentar lebih dari
       satu baris --> CTRL + SHIFT + /
     */

    var nama: String = "jil"
    println("nama : " + nama) //String concatenation
    nama = "eji"
    println("Nama : $nama " ) //String interpolation

    var tempatLahir = "Palembang"
    println("Saya Bernama $nama lahir di $tempatLahir")

    //var dan val
    val usia = 18
    //usia = 19 --> val cannot be ressigned
    var usiaSaatIni = 18
    println("Saya Bernama $nama dengan usia $usiaSaatIni tahun lahir di $tempatLahir")
    println("Tahun depan saya, $nama berusia ${usiaSaatIni++} tahun")
    println("Tahun depan saya, $nama berusia ${usiaSaatIni++} tahun")

    val angka1: Int = 10
    val angka2 = 20
    println("$angka1 + $angka2 = ${angka1 + angka2}")

    val firstName = "ajil"
    val lastName = "eji"

    println("Nama Lengkap : $firstName $lastName")
    println("Inisial : " + firstName[0] + lastName[0])
    println("Inisial :  ${firstName[0]} ${lastName[0]}")

    //Tipe data char
    val karakter: Char = 'A'
    var huruf = 'A'
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf++}")
    println("Huruf ${huruf--}")
    println("Huruf ${huruf--}")
    println("Huruf ${huruf--}")
    println("Huruf ${huruf--}")


    //Escaped String(\n, \t, \", \', \", \\)
    val kalimat = "Kotlin \u00A9 itu \"mudah\"!"
    println(kalimat)

    // Raw String
    val line = "baris 1\n " +
            "baris2\n " +
            "baris3\n " +
            "baris4\n"
    println(line)
    val baris = """
        baris 1 
        baris 2
        baris 3
        baris 4
    """.trimIndent()
    println(baris)

    // Math Function
    // import kotlin.math.*
    println(sin(45 * PI / 180))
    println(cos(135 * PI / 180))
    println(sqrt(3.0))
    println(min(50, 100))
    println(max(sqrt(2.0), PI/2))

    // Increment dan Decrement
    var counter: Int = 0
    counter += 2 // counter = counter + 2
    counter -= 1 // counter = counter - 1
    counter *= 6 // counter = counter * 6
    counter /= 3 // counter = counter / 2
    println(counter)

    // Substring
    val pesan = "Kotlin itu menyenangkan"
    println(pesan.substring(11,23))
    println(pesan.first())
    println(pesan.last())

}