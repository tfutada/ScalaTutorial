
object S08Closure {

    def main(args: Array[String]) = {

        def createCounter() = {
            var count = 0
            // return a func with a count
            () => {
                count += 1
                count // return count
            }
        }
        val f1 = createCounter() // return a function
        println(f1()) // 1
        println(f1()) // 2
        val f2 = createCounter()
        println(f2()) // 1
        println(f1()) // 3
    }
}
