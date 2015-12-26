/**
  * no static method
  */
class S02 {
    println("Hello World")
    println(1.toString)

    def hi(s: String) = {
        println("Yup" + s)
    }

    def sum(x: Int, y:Int): Unit = {
        println("Hello World")
        println(1.toString)
    }
}

class Person(val first: String) {

    def hello() = {
        println("Hi!")
    }
}

// Companion Object: Singleton
// Place helper methods here instead of the class part.
object S02 {

    def apply() = new S02

    // No public static
    def main(args: Array[String]) = {

        val c = new S02()
        val p = new Person("David")
        p.hello()

        val v = S02()
        v hi "Oh!"

        val list = List(1, 2, 3, 4, 5)
        for (i <- list) {
            print(i)
        }
        print( list reduce { (x, y) => x + y})
        print( list map {_ * 2} )
        list foreach print
    }
}

