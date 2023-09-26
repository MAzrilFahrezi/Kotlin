fun main() {

    //Range
    //closed range (range tertutup) dan open-half range (range setengah terbuka)
    val closedRange = 0 .. 5 // range tertutup dengan angka (0, 1, 2, 3, 4, 5)
    val openHalfRange = 0 until 5 // range setengah terbuka dengan angka (0, 1, 2, 3, 4)

//    (0, 5) --> 1, 2, 3, 4
//    [0, 5] --> 0, 1, 2, 3, 4, 5
//    (0, 5) --> 1, 2, 3, 4, 5
//    [0, 5) --> 0, 1, 2, 3, 4
    val increasingRange = 0.rangeTo(5) // sama seperti 0..5
    val decreasingRange = 5 downTo 0 // (5, 4, 3, 2, 1, 0)
    val rangeWithStep = 0 .. 5 step 2 // (0, 2, 4)
    val decreasingRange2 = 5.downTo(0) // (5, 4, 3, 2, 1, 0)

    val count = 10
    var sum = 0
    for (i in 1 .. count){
        sum  += i
    }
    println(sum)

    sum = 1
    var lastSum = 0
    repeat(10){
        val temp = sum
        sum += lastSum
        lastSum = temp
    }
    println(sum)
    println(lastSum)
    // repeat 1 -> temp=1, sum=1+0=1, lastSum=1
    // repeat 2 -> temp=1, sum=1+1=1, lastSum=1
    // repeat 3 -> temp=2, sum=2+1=3, lastSum=2
    // repeat 4 -> temp=3, sum=3+2=5, lastSum=3
    // repeat 5 -> temp=5, sum=5+3=8, lastSum=5
    // repeat 6 -> temp=8, sum=8+5=13, lastSum=8
    // repeat 7 -> temp=13, sum=13+8=21, lastSum=13
    // repeat 8 -> temp=21, sum=21+13=34, lastSum=21
    // repeat 9 -> temp=34, sum=34+21=55, lastSum=55
    // repeat 10 -> temp=55, sum=55+34=89, lastSum=89

    sum = 0
    for (i in 1 .. count step 2) {
        sum += i
    }
    println(sum) // 25

    sum = 0
    for (i in count downTo 1 step 2){
        sum += i
    }
    println(sum) //30

    //label statments -> continue
    sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0){
            continue
        }
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)

    sum = 0
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8){
            if (row == column){
                continue@rowLoop
            }
            sum += row * column
        }
    }
    println(sum)

    val rangeStep3 = 1.rangeTo(10) step 3
    rangeStep3.forEach{
        println("Angka $it")
    }
    rangeStep3.forEach{value->
        println("Angka $value")
    }

    //Ekspresi When
    //Contoh 1
    val number = 10
    when(number){
        0 -> println("Zero")
        else -> println("non-Zero")
    }

    //contoh 2
    when (number){
        10 -> println("it's a ten!")
    }

    //contoh 3
    val string = "dog"
    when(string){
        "Cat", "Dog" -> println("Animal is a house pet")
        else -> println("Animal is not a house pet")
    }

    //contoh 4 (returning values)
    val numberName = when(number){
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> "Unknown"
    }
    println(numberName)

    //contoh lanjutan when
    val hourOfDay = 12
//    val timeOfDay = when (hourOfDay) {
//        0, 1, 2, 3, 4, 5 -> "Early Morning"
//        6, 7, 8, 9, 10, 11 -> "Morning"
//        12, 13, 14, 15, 16 -> "Afternoon"
//        17, 18, 19 -> "Evening"
//        20, 21, 22, 23 -> "Late Evening"
//        else -> "INVALID HOUR!"
//    }
//    println(timeOfDay)

    val timeOfDay = when (hourOfDay) {
        in 0..5 -> "Early Morning"
        in 6..1 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late Evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)

    when{
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
}