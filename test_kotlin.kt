enum class EntityType{
    EASY, MEDIUM, HARD
    fun formatname()=name.toLowerCase().capitalize()
}
object EntityFactory{
     fun create(type:EntityType):Entity{
        val id =UUID.randomUUID.toString()
        val name=when(type){
            EntityType.EASY ->type.name
            EntityType.MEDIUM->type.formatname()
            EntityType.HARD->"hard"
            
        }
        return Entity(id,name)
     }
}
class Entity (val id:String, val name:String){
    override fun toString():String{
        return "id:$id name:$name"
    }
}
fun main(){
    val entity=EntityFactory.create(EntityType.EASY)
    println(entity)
}
