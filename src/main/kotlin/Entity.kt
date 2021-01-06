object EntityFactory{
    fun create()=Entity("id","name")
}
class Entity  constructor(var id:String,var name:String){
    override fun toString(): String {
        return "id=$id name=$name"
    }
}

fun main() {
var entity=EntityFactory.create();
    println(entity);
}