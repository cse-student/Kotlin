import Constants.Companion.x
import Constants.Companion.y
import Constants.Companion.z

//Simple functions usage
fun main(args: Array<String>){

    //Simple function call
    val addition = add(x, y)
    print(x, y, addition, '+')

    var multipleAddition = add(x, y, z)
    println("The result of the addition of the 3 values is $multipleAddition")

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

fun add(vararg numbers: Int): Int{
    var result = 0
    for(number in numbers){
        result += number
    }
    return result
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