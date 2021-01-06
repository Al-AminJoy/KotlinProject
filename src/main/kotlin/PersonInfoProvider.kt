interface PersonInfoProvider {
    var providerInfo:String;
    fun personInfo(person:Person){
        println(providerInfo);
        person.check();
    }
}
interface sessionInfoProvider{
    fun getSessionId():String;
}
open class BasicInfoProvider :PersonInfoProvider,sessionInfoProvider{
    override var providerInfo: String
        public get() = "Test"
        set(value) {}
    open var  sessionIdPrefix:String="SessionId"
    override fun personInfo(person: Person) {
        super.personInfo(person)
    }

    open override fun getSessionId(): String {
        println(sessionIdPrefix);
        return sessionIdPrefix;
    }
}

