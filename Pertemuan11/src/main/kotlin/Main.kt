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

    class Student(var firstName: String, var lastName: String, var id: Int){

        override fun hashCode(): Int{
            val prime = 31
            var result = 1

            result = prime * result + firstName.hashCode()
            result = prime * result + id
            result = prime * result + lastName.hashCode()

            return result
        }

        override fun equals(other: Any?): Boolean{
            if (this === other)
                return true
            if (other === null)
                return false
            if (javaClass != other.javaClass)
                return false

            val obj = other as Student?

            if (firstName != obj?.firstName)
                return false
            if (lastName != obj.lastName)
                return false
            if (id != obj.id)
                return false

            return false
        }

        override fun toString(): String {
            return "Student(firstName=$firstName, lastName=$lastName, id=$id"
        }

        fun copy(firstName: String = this.firstName,
                 lastName: String = this.lastName,
                 id: Int = this.id) = Student(firstName, lastName, id)

    }

    val albert = Student(firstName = "Albert", lastName = "Einstein", id = 1)
    val richard = Student(firstName = "Richard", lastName = "Feyman", id = 2)
    val albertCopy = albert.copy()

    println(albert)
    println(richard)
    println(albert == richard) // false
    println(albert == albertCopy) // true
    println(albert === albertCopy) // false

    data class StudentData(var firstName: String, var lastName: String, var id: Int)

    val marie = StudentData("Marie", "Curie", 1)
    val emmy = StudentData("Emy", "Noether", 2)
    val marieCopy = marie.copy()

    println(marie)
    println(emmy)
    println(marie == emmy) // false
    println(marie == marieCopy) // true
    println(marie === marieCopy) // false

    //Destructuring Declaration
    val(firstName, lastName, id) = marie
    println(firstName) // Marie
    println(lastName) // Curie
    println(id) // 1

}


