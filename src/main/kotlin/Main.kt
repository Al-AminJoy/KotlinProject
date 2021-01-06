fun main() {
    //var provider=FancyInfoProvider();
    var provider= object :PersonInfoProvider{
        override var providerInfo: String
            get() = "New Provider"
            set(value) {}

    }

    provider.personInfo(Person());
   // provider.getSessionId();
  //  println(provider.getSessionId());
    //var person=Person()
    //person.nickName
}