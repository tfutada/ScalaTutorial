
object S16Parallel {

    def main(args: Array[String]) = {

        val list = List(1, 2, 3, 4, 5)

        for (e <- list.par) {
            println(e)
        }
    }
}





