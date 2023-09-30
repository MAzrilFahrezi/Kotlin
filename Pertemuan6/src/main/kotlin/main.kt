import java.lang.management.ManagementFactory
import kotlin.math.tan

fun main() {
    cetakNamaSaya()
    cetakPerkalian5(10)
    cetakPerkalian(50, 100)
    cetakPerkalian(8)
    cetakPerkalian(pengali = 11, nilai = 13)
    cetakPerkalian(nilai = 1, pengali = 10)

    var hasilkali = perkalian(pengali = 3, nilai = 3)
    println(hasilkali)

    val (product, quotient) = multiplyAndDivide(4, 10)
    println("$product + $quotient = ${product + quotient}")

    println(multiplyInferred(10, 2))

    incrementAndPrint(10)

    //function as variable
    var tambah = ::add
    println(tambah(4, 2))

    printResult(::add, 4, 2)
    printResult(tambah, 4, 2)
    printResult(::perkalian, 4, 2)
    printResult(::multiplyInferred, 4, 2)

    val plusOne = {number: Int -> number + 1}
    println("Nilai dari 5 + 1 adalah ${plusOne(5)}")

    val repeatMe: String.(Int) -> String = {times -> this.repeat(times)}
    println(repeatMe("Hai", 10))

    val twoParameters: (String, Int) -> String = repeatMe
    println(twoParameters("ABC", 10))

     fun transformasi(f: (String, Int) -> String): String{
         return f("Morning", 10)
     }

    val hasil = transformasi(repeatMe)
    println(hasil)

}

fun cetakNamaSaya(){
    println("Nama Saya Adalah Budi.")
}

fun cetakPerkalian5(nilai: Int){
    println("$nilai + 5 = ${nilai * 5}")
}

fun cetakPerkalian(pengali: Int, nilai: Int = 1){
    println("$pengali * $nilai = ${pengali*nilai}")
}

fun perkalian(nilai: Int, pengali: Int): Int{
    return nilai * pengali
}

fun multiplyAndDivide(number: Int, factory: Int) : Pair<Int, Int>{
    return Pair(number * factory, number / factory)
}

fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

fun incrementAndPrint(value: Int){
    val newValue = value + 1
    println(newValue)
}

fun getValue(value: Int): Int{
    return value + 1
}

fun getValue(value: String): String{
    return "The value is $value"
}

fun add(a: Int, b: Int): Int{
    return a + b
}

fun printResult(function: (Int, Int) -> Int, a: Int, b: Int){
    val result = function(a, b)
    println(result)
}
