class Developer(val first: String) {
    var skills = List("")
    def getSkills(): String = {
        first + " knows " + skills
    }
}
object Developer {
    def apply(f: String) = {
        new Developer(f)
    }
    def apply(f: String, a: Int) = {
        val o = new Developer(f)
        // Loading his skill from DB
        o.skills = List("Go", "Python", "Scala")
        o
    }
}
object S11Class {
    def main(args: Array[String]) = {

        val david = Developer("David") // Developer.apply("David")
        println( david.getSkills() )

        val tom = Developer("Tom", 231) // Developer.apply("Tom", true)
        println( tom.getSkills() )
    }
}






