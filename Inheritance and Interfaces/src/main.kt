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
}

open class SuperClass(x: Int){
    protected  val x =  x

    //overriding toString function
    override fun toString(): String {
        return "${this::class.simpleName} x = $x"
    }
    //endregion

    open fun multiply(factor: Int): Int{
        return x * factor
    }
}

//region extending SuperClass
class SubClass(x: Int): SuperClass(x){
    override fun toString(): String {
        return "${this::class.simpleName} x = $x"
    }

    //region overriding function declared in superclass while using its functionality
    override fun multiply(factor: Int): Int {
        return super.multiply(factor) * factor
    }
    //endregion
}
//endregion