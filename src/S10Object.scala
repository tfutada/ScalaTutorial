// Class with a constructor
class Person(val first: String, val last: String, var age: Int) {

    println("I am a constructor! Now constructing...")
    var word = "I am " // Instance variable

    def fullName(): String = {
        word + first + " " + last
    }
}

object S09Class {

    def main(args: Array[String]) = {

        val david = new Person("David", "Thompson", 29)
        println( david.fullName() )

        david.age = 30   // It's a variable. You can change it.
        // david.first = "Tom"   Now way! It's a constant.
        println( david.age )
    }
}





