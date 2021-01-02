class Person(var firstName:String,var secondName:String) {

    constructor(): this("Al-Amin","Joy"){
        println("Secondary ");
    }

    var nickName:String?=null
    set(value) {
        field=value;
        println("Set $value");
    }
    get() {
        println("The returned Value Is $field");
        return field;
    }
    fun check(){
     var lastName:String=nickName?:"No Nickname Inserted"
        println("$firstName $secondName ($lastName)");
    }

}