//Simple functions usage
fun main(args: Array<String>){
    //These values below have been declared using the keyword val therefore they cannot be modified
    val x = 5
    val y = 10

    //Simple function call
    val addition = add(x, y)
    print(x, y, addition, '+')

    var subtraction = subtract(x, y)
    print(x, y, subtraction, '-')

    subtraction = subtract(y, x)
    print(y, x, subtraction, '-')

    val multiplication = multiply(x, y)
    print(x, y, multiplication, '*')

    var division = divide(x, y)
    print(x, y, division, '/')

    division = divide(y, x)
    print(y, x, division, '/')
}

fun add(x: Int, y: Int): Int{
    return x + y
}

fun subtract(x: Int, y: Int): Int{
    return x - y
}

fun multiply(x: Int, y: Int): Int{
    return x * y
}

fun divide(x: Int, y: Int): Double{
    return x.toDouble()/y.toDouble()
}

fun print(x: Int, y: Int, result:Int, operator: Char){
    println("$x $operator $y = $result")
    println("\t The type of the result is ${result::class.qualifiedName} \n")
}

fun print(x: Int, y: Int, result:Double, operator: Char){
    println("$x $operator $y = $result")
    println("\t The type of the result is ${result::class.qualifiedName} \n")
}