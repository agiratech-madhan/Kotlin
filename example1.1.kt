/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val person=Person()
    person.firstname
    person.lastName
}

class Person( val firstname:String,  val lastName:String){
    init{
        println("Init 1 is called")
    }
    constructor():this("hello","sam"){
        print("secondary constructor called")
    }

     init{
        println("Init 2 is called")
    }
}
/**
 * Init 1 is called
Init 2 is called
secondary constructor called
 */