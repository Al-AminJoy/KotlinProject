class FancyInfoProvider: BasicInfoProvider(){
    override var providerInfo: String
        get() = "Fancy Info provider"
        set(value) {}
    override var sessionIdPrefix: String
        get() = "Fancy Session"
        set(value) {}
    override fun personInfo(person: Person) {
        super.personInfo(person);
        println("PersonInfo In Fancy");
    }

    override fun getSessionId(): String {
        return super.getSessionId()
    }
}