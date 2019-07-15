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
