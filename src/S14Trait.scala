trait UserProxy {
    def getUsers(): List[String]
}

trait RealProxy extends UserProxy {
    def getUsers(): List[String] = {
        // ajax(http://www.foo.com/users)
        List("David", "Tom", "Jobs")
    }
}

trait DummyProxy extends UserProxy {
    def getUsers(): List[String] = {
        List("Test1", "Test2", "Test3")
    }
}

class UserService {
    self: UserProxy => // Mix-in UserProxy

    def printUsers(): Unit = {
        getUsers().foreach(println(_)) // e => println(e)
    }
}

object S14Trait {
    def main(args: Array[String]) = {

        List[UserService](
            new UserService() with DummyProxy,
            new UserService() with RealProxy
        ).foreach(
            _.printUsers() // e => e.printUsers
        )
    }
}

