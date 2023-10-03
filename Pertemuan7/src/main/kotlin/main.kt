import java.awt.Stroke

fun main() {

    var name = "John Doe"
    var age = 24
    var occupation = ""

    //sentinel value
//    var errorCode = 0
    // var errorcode
    var errorCode: Int? //nullable int
    // cara memberikan nilai pada variable nullable
    errorCode = 100
    println(errorCode)

    //cara mengaturnya ke null
    errorCode = null
    println(errorCode)

    //checking for null
    var result:Int? = 30
    println(result)
    println(result !! + 1)

    var authorName: String? = "Kotaro Minami"
    var authorAge: Int? = 24
    val ageAfterBirthday = authorAge!! + 1 //not null assertion operator
    println("after next birthday, author will be $ageAfterBirthday")

    authorAge = null
//    println("after two birthday, author will be ${authorAge!! + 2} ")

    // smart Casts
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null){
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    // safe call
    authorName = "Takeo Ischi"
    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")

    var nameLengthPlus5 = authorName?.length?.plus(5)
    println(nameLengthPlus5)

    // let() function
    authorName?.let {
        nonNullableAuthor = authorName
    }

    authorName?.let {
        nameLength = authorName.length
    }

    //elvis operator (?:)
    var nullableInt: Int? = 10
//    var mustHaveResult = nullableInt ?:0
    var mustHaveResult = if (nullableInt != null) nullableInt else 0
    println(mustHaveResult)

    nullableInt = null
    mustHaveResult = nullableInt?: 9
    println(mustHaveResult)

}