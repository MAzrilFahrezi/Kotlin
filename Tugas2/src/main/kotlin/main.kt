fun main() {

    // Nomor 1
    val result = divideIfWhole(12, 5)
    if (result != null) {
        println("Yep, it divides $result times")
    }
    else {
        println("not divisible :[")
    }
    val elvis = result ?: 0
    println("It divides $elvis times")

    // Nomor 2
    val statesMap = mapOf("NY" to "New York", "CA" to "California", "TX" to "Texas", "FL" to "Florida", "PA" to "Pagar ALam")
    printStatesWithLongNames(statesMap)

    // Nomor 3
    val n = 4
    val hasil = factorial(n)
    println("Faktorial dari $n adalah $hasil")

}

fun divideIfWhole(value: Int, divisor: Int): Int?{
    return if (value % divisor == 0) {
        value/divisor
    } else {
        null
    }
}


fun printStatesWithLongNames(statesMap: Map<String, String>) {
    for ((stateCode, stateName) in statesMap) {
        if (stateName.length > 8) {
            println(stateName)
        }
    }
}

val factorial: (Int) -> Long = { n -> var hasil: Long = 1
    for (i in 1..n) {
        hasil *= i.toLong()
    }
    hasil
}