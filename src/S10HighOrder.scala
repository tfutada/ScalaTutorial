
object S10HighOrder {

    def main(args: Array[String]) = {

        val list = List(1, 2, 3, 4, 5)

        // map: x => x * 2
        println( list.map( x => x * 2) )

        // filter: x => x * 2
        println( list.filter( x => x % 2 == 0) )

        // reduce: x, y => x + y
        println( list.reduce( (x, y) => x + y ) )

        // map.reduce
        println( list
            .map(x => x * 2)
            .reduce( (x, y) => x + y )
        )
    }
}





