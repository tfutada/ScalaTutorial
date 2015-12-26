
object S06Set {

    def main(args: Array[String]) = {



        // Tuple
        val developers = Map(
            ("Tom", "Jones") -> "Python",
            ("Tom", "Ford") -> "Python"
        )

        for ((k, v) <- developers) {
            println(s"key: ${k} -> val: ${v}")
        }

        println( developers("Tom", "Ford") )

        // Set
        val go    = Set("OOP", "Compiler", "Pointer")
        val scala = Set("OOP", "Compiler", "Actor")

        println(go & scala)  // and
        println(go | scala)  // or
        println(go &~ scala) // diff
        println(scala &~ go)
    }
}





