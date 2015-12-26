object Utility {
    println("Initializing ...")

    var counter: Int = 0

    def increment(): Int = {
        counter = counter + 1
        counter
    }
}

object S10Class {

    def main(args: Array[String]) = {

        println( Utility.increment() )
        println( Utility.increment() )
        println( Utility.increment() )
    }
}





