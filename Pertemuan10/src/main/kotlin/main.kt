import jdk.dynalink.Operation

fun main() {

    //lambda
    val message = {
        println("Hello World")
    }

    message()

    val message2 = { pesan: String ->
        println("Hello $pesan")
    }

    message2("Dosen Dingin")

    var multiplyLambda: (Int, Int)-> Int

    multiplyLambda = {a: Int, b: Int -> Int
        a * b
    }

    val hasil = multiplyLambda(4, 2)
    println(hasil)

    //lambda 1 parameter
    var doubleLambda = {a: Int, ->
        2*a
    }

    doubleLambda = {2 * it}

    val square: (Int) -> Int = {it * it}

    //high oder function
    fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
        val result = operation(a, b)
        return  result
    }

    var addLambda = {nilai1: Int, nilai2: Int ->
        nilai1 * nilai2
    }

    var hasilPenjumlahanLambda = operateOnNumber(10, 5, addLambda)
    println(hasilPenjumlahanLambda)

    var substractLambda = {nilai1: Int, nilai2: Int ->
        nilai1 - nilai2
    }

    var hasilPenguranganLambda = operateOnNumber(10, 5, substractLambda)
    println(hasilPenguranganLambda)

    fun addFunction(a: Int, b: Int) = a + b
    val hasilFunctionBiasa = operateOnNumber(100, 10, ::addFunction)

    var multiplyLambda2 = {a:Int, b:Int ->
        a*b
    }

    fun mangYo(a: Int, operation: (Int, Int) -> Int, b: Int): Int {
        val result = operation(a,b)
        return result
    }

    // var hasilGagal = mangYo(1, {})
    val message3: () -> Unit = {
        println("Hello World")
    }

    //perulangan .foreach
    var list = listOf(1, 2, 3, 4, 5)
    list.forEach{
        println(it)
    }

    list.filter {
        it > 2
    }

}