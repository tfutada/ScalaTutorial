
object S07Function {

    def sum(x: Int, y: Int): Int = {
        x + y // no return keyword
    }

    // lambda: String => Unit
    def ajax(callback: String => Unit, count: Int): Unit = {
        for (i <- 1 to count) {
            callback("Hello")
        }
    }

    def main(args: Array[String]) = {

        println( sum(1, 2) )

        ajax( e => println(e), 3 )
    }
}





