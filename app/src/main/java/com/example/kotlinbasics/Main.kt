package com.example.kotlinbasics
fun main(){
    var iphone = MobilePhone()
    println(" variable name ${iphone.name}")
    iphone.age=20
    println(" variable name ${iphone.age}")
    iphone.age=-20
    println(" variable name ${iphone.age}")


}
class MobilePhone(){
    lateinit var variable:String
    val name:String="Madhan"

        get(){
            return field.toLowerCase()
        }
    var age:Int=300
        get()=field
        set(value){
            field=if(value>0)value else throw IllegalArgumentException("Value is greater ")
        }
    init{
        this.variable="RKV"
    }

}