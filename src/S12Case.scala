
// case creates a companion object as well as a class.
case class Mobile(name: String, brand: String, price: Int)

object S12Case {
    def main(args: Array[String]) = {

        val iphone  = Mobile("iPhone 6", "Apple", 550)
        val android = Mobile("Galaxy S7", "Samsung", 100)
        val ms      = Mobile("Windows Phone", "MS", 300)

        for (o <- List(iphone, android, ms)) {
            o match {
                case Mobile(n, "Apple", _) => println("Im so crave for " + n)
                case Mobile(_, "Samsung", p) if p < 150 => println("if it is cheap i buy Samsung at " + p)
                case Mobile(_, _, _) => println("I don't care.")
            }
        }
    }
}







