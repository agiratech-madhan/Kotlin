class Entity private constructor(val id: String){
    // companion object{
    //     fun create()=Entity("id")
    // }
    companion object Factory{
        const val id:String
        fun create()=Entity("id")
    }
}
fun main(){
    // val entity=Entity.companion.create() // for java .companon is must  kotlin not required to mention ghere just Entity.create()
    val entity=Entity.Factory.create()
    Entity.id

}