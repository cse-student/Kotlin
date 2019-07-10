fun main() {

    //region Inheriting Any class
    var x:Any = Any()
    println(x)
    //endregion

    //region SuperClass
    var sup = SuperClass(10)
    println(sup)
    //endregion

    //region SubClass
    var sub = SubClass(15)
    println(sub)
    //endregion
}

open class SuperClass(x: Int){
    protected  val x =  x

    //overriding toString function
    override fun toString(): String {
        return "Superclass x = $x"
    }
    //endregion
}

//region extending SuperClass
class SubClass(x: Int): SuperClass(x){
    override fun toString(): String {
        return "Subclass x = $x"
    }
}
//endregion