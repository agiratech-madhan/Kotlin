package eu.tutorials.interfacestest
fun main() {
    val x=intArrayOf(1,3,4,4,5,55,4)
    val fruits=arrayOf(Fruits("Madhan", 22),Fruits("Madhan", 22),)
    for(x in fruits.indices){
        println("${fruits[x]}")
    }
    print(fruits[0].age)

    var myArray = Array<Int>(4) { 9 }   // Mutable. Fixed Size.
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {              // Using individual elements (Objects)
        println(element)
    }

    println()

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }
}

data class Fruits(val name:String, val age:Int)