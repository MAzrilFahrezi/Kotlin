fun main() {
    // Fold and Reduce

    // Reduce
    var prices = listOf(1.5, 10.0, 4.99, 2.30)

    // Reduce hanya menerima 1 argumen -> function
    // a -> merupakan hasil cumulative dari fungsi
    // b -> merupakan value setelah nya (next, value)
    var sum = prices.reduceRight{ a, b ->
        a + b
    }
    println(sum)

    // Fold
    // Mirip dengan fungsi reduce, tetapi nilai awalnya button
    // dari nilai awal list, tetapi akan diinisialisasi
    // ListOf(1.5, 10.0, 4.99, 2.30
    var sumFold = prices.fold(0.0) { a, b ->
        a + b
    }
    println(sumFold)

    val numbers = arrayListOf(1, 2, 3)
    numbers.removeAt(numbers.lastIndex)
    println(numbers)

    println(10.plus3())

    println((-10).abs())
    print(100.abs())

    println(10.greaterValue(20))
    println(10 greaterValue 20)
    println(myMath.primeFactor(81))
}

fun Int.plus3(): Int {
    return this + 3
}

fun Int.abs(): Int {
    return if (this < 0) -this else this
}
class myMath{
    companion object{
        fun factorial(number: Int): Int{
            return (1..number).fold(1){a,b ->
                a*b
            }
        }
    }
}

// Extension Companion Object
fun myMath.Companion.primeFactor(value: Int): List<Int> {
    var remainingValue = value
    var testFactor = 2

    val primes = mutableListOf<Int>()
    while (testFactor * testFactor <= remainingValue) {
        if (remainingValue % testFactor == 0){
            primes.add(testFactor)
            remainingValue /= testFactor
        } else {
            testFactor += 1
        }
    }
    if (remainingValue > 1) {
        primes.add(remainingValue)
    }
    return primes
}

infix fun Int.greaterValue(otherValue: Int): Int =
    if (this > otherValue) this
    else otherValue
