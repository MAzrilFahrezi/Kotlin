import com.sun.source.tree.Scope

// prinsip design pattern singeleon
// memastikan hanya ada satu instansi pada suatu program

data class Student(val id: Int, val firstName: String, val lastName: String){
    var fullName = "$lastName, $firstName"
}

object StudentRegistry {
    val allStudent = mutableListOf<Student>()

    fun addStudent(student: Student){
        allStudent.add(student)
    }
    fun removeStudent(student: Student){
        allStudent.remove(student)
    }
    fun listAllStudent(){
        allStudent.forEach{
            println(it.fullName)
        }
    }
}

class Scientist private constructor(val id: Int, val firstName: String, val lastName: String){
    companion object {
        var currentId = 0
        fun newScientist(firstName: String, lastName: String): Scientist {
            currentId += 1
            return Scientist(currentId, firstName, lastName)
        }
    }
    var fullName = "${firstName} ${lastName}"
}

object ScientistRepository {
    val allScientist = mutableListOf<Scientist>()

    fun addScientsit(scientist: Scientist){
        allScientist.add(scientist)
    }
    fun addStudent(scientist: Scientist){
        allScientist.add(scientist)
    }
    fun removeStudent(scientist: Scientist){
        allScientist.remove(scientist)
    }
    fun listAllScientist(){
        allScientist.forEach{
            println("${it.id}: ${it.fullName}")
        }
    }
}

interface Counts {
    fun studentCount(): Int
    fun scientistCount(): Int
}

fun main() {

    val marie = Student(1, "Marie", "Curie")
    val albert = Student(2, "Albert", "Einstein")
    val richard = Student(3, "Richard", "Feyman")

    StudentRegistry.addStudent(marie)
    StudentRegistry.addStudent(albert)
    StudentRegistry.addStudent(richard)

    StudentRegistry.listAllStudent()
    // > Curie, Marie
    // > Einstein, Albert
    // > Fenyman, Richard

    val emmy = Scientist.newScientist("Emmy", "Noether")
    val issac = Scientist.newScientist("Issac", "Newtown")
    val nick = Scientist.newScientist("Nikola", "Tesla")

    ScientistRepository.addScientsit(emmy)
    ScientistRepository.addScientsit(issac)
    ScientistRepository.addScientsit(nick)

    ScientistRepository.listAllScientist()
    // > 1: Emmy Noether
    // > 2: Issac Newtown
    // > 3: Nikola Tesla

    val counts = object : Counts {
        override fun studentCount(): Int {
            return StudentRegistry.allStudent.size
        }

        override fun scientistCount(): Int {
            return ScientistRepository.allScientist.size
        }
    }

    println(counts.studentCount())
    println(counts.scientistCount())
}

