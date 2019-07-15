
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
