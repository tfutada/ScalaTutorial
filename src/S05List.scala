
object S05List {

    def main(args: Array[String]) = {

        // List
        val country = List("Japan", "Vietnam", "US", 5)

        for (v <- country) {
            println(v)
        }



        // Dictionary
        val person = Map(
            "David" -> 32,
            "Tom" -> 18,
            "Bod" -> 27
        )

        for ((k, v) <- person) {
            println(s"key: ${k} -> val: ${v}")
        }
    }
}





