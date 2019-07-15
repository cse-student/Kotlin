fun main() {

    //region Inheriting Any class
    var x:Any = Any()
    println(x)
    //endregion

    //region SuperClass
    var sup = SuperClass(10)
    println(sup)
    println(sup.multiply(2))
    //endregion

    //region SubClass
    var sub = SubClass(15)
    println(sub)
    println(sub.multiply(2))
    //endregion

    //region Interfaces
    var dog: Animal = Dog()
    var cat: Animal = Cat()

    dog.speak()
    cat.speak()
    //endregion
}