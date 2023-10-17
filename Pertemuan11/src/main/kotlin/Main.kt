import java.util.Random


class Person (var firstName: String, var lastName: String) {
    val fullName
        get() = "$firstName $lastName"
}

class  simplePerson(val name: String)

class Grade(val letter: String, val points: Double, val credits: Double)

class Student(
    val firstName: String,
    val lastName: String,
    val grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0) {

    fun recordGrade(grade: Grade) {
        grades.add(grade)
        credits += grade.credits
    }
}
fun main() {
    val ajil = Person(firstName = "ajil", lastName = "fuckrezy")
    println(ajil.fullName)

    // Referensi types
    var var1 = simplePerson(name = "ajil")
    var var2 = var1

    var homeOwner = ajil
    ajil.firstName = "ajil"
    println(ajil.firstName) // ajil
    println(homeOwner.firstName) // ajil

    // Object identity
    println(homeOwner == ajil)

    val impostorAjil = Person(firstName = "ajil", lastName = "fuckrezy")
    println(ajil == homeOwner) // true
    println(ajil == impostorAjil) // false
    println(impostorAjil == homeOwner) // false

    homeOwner = impostorAjil
    println(ajil == homeOwner) // false

    homeOwner = ajil
    println(ajil == homeOwner) // fale

    // create fake, impostor john
    var impostors = (0 .. 100).map {
        Person(firstName = "ajil", lastName = "fuckrezy")
    }

    // Equality (==) is not effective
    impostors.map {
        it.firstName == "ajil" && it.lastName == "fuckrezy"
    }.contains(true) // true

    // check to ensure the real ajil
    println(impostors.contains(ajil)) // false

    val mutableImpostors = mutableListOf<Person>()
    mutableImpostors.addAll(impostors)
    mutableImpostors.contains(ajil) // false
    mutableImpostors.add(Random().nextInt(5), ajil)

    println(mutableImpostors.contains(ajil))

    val indexOfJohn = mutableImpostors.indexOf(ajil)
    if (indexOfJohn != -1) {
        mutableImpostors[indexOfJohn].lastName = "Ezi"
    }
    println(ajil.fullName) // ajil Ezi

    val rezi = Student(firstName = "Jil", lastName =  "Rezi")
    val computationalIntelligence = Grade(letter = "B", points = 9.0, credits = 3.0)
    val machineLearning = Grade(letter = "A", points = 16.0, credits = 4.0)

    rezi.recordGrade(computationalIntelligence)
    rezi.recordGrade(machineLearning)

    println(rezi.credits) //7.0

    val proposalTA = Grade(letter = "A", points = 8.0, credits = 2.0)
    rezi.recordGrade(proposalTA)
    println(proposalTA)
}
