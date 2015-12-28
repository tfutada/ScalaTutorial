
object S15Optional {

    def getUser(): Option[String] = {
        Option("David")
    }

    def main(args: Array[String]) = {

        val user: Option[String] = getUser()
        println(user.get)

        val bogus = Option(null)
        println(bogus.getOrElse("Null"))

        for (e <- List(user, bogus)) {
            e match {
                case Some(v) => println(v)
                case None => println("It is null!")
            }
        }
    }
}





