
object S07Function {

    def sum(x: Int, y: Int): Int = {
        x + y // no return keyword
    }

    // lambda: String => Unit
    def ajax(callback: (String, String, String) => Unit, count: Int): Unit = {
        for (i <- 1 to count) {
            callback("Hello", "a", "j")
        }
    }

    def main(args: Array[String]) = {

        println( sum(1, 2) )

        ajax( (s, a, b) => println(s), 3 )
    }
}





