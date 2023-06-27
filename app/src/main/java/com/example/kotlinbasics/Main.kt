package eu.tutorials.helloworld


// Inheritance is one of the main concepts of
// Object Oriented Programming (OOP).
///It allows a class to inherit features
//(properties and methods) from another class and reuse them.
// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class , and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.
// All the classes in Kotlin inherit from a class called Any. It corresponds to the Object class in Java.
// Every class that you create in Kotlin implicitly
// inherits from Any -

class Person // Implicitly inherits from the default Parent class - Any
// The Any class contains three methods toString(),
// equals() and hashCode().
// All classes in Kotlin inherit these three methods
// from Any, and can override them in order to
// provide their own implementation.

// Base class (Super class)
open class Vehicle {
}



open class Car(val name: String, val brand: String) {
    // open so it can be overriden by inhereting classes
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {

    var chargerType = "Type1"
    // in KM
    override var range = batteryLife/6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
}

fun main(args: Array<String>){
    var audiA3 = Car("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)

    // Polymorphism is the ability to treat objects
    // with similar traits in a common way
    audiA3.drive(200.0)
    // Only works because ElectricCar is a Subclass of Car
    // Or alternativly works if Car was a Interface and Electriccar would inherit from it
    teslaS.drive(200.0)
}



