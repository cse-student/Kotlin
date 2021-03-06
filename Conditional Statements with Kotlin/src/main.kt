import Operators.*
import kotlin.system.exitProcess

fun main(args: Array<String>){
    //This is a simple calculator made using different way of using conditional statements ith kotlin
    intro()
    println("Enter operation: ")
    val operation = readLine() ?: return
    println("Selected operation is: $operation")
    println("Enter first value: ")
    var x: String = readLine() ?: return
    var intx = convertToInt(x)
    println("value of x is: $intx")
    println("Enter second value: ")
    var y = readLine() ?: return
    var inty = convertToInt(y)
    calculatorWithIfElse(intx, inty, operation)
    calculatorWithWhen(intx, inty, operation)
}

fun intro(){
    println("Welcome to Kotlin simple calculator")
    println("Supported operations")
    println("\t+")
    println("\t-")
    println("\t*")
    println("\t/")
    println("\tln")
    println("\tlog")
}

fun convertToInt(x: String): Int{
    var result = 0
    try{
        result = x.toInt()
    }
    catch (e: NumberFormatException){
        println("Invalid number")
        exitProcess(0)
    }
    return result
}

fun print(x: Int, y: Int, result: Int, operation: String){
    println("$x $operation $y = $result")
}
fun notYetSupported(){
    println("This operation is not yet supported")
}

fun invalidOperation(){
    println("Invalid Operation")
}

fun calculatorWithIfElse(x: Int, y: Int, operation: String){
    var result = 0
    if(operation == Add.operator){
        result = x + y
    }
    else if(operation == SUBTRACT.operator){
        result = x - y
    }
    else if(operation == MULTIPLY.operator){
        result = x * y
    }
    else if(operation == DIVIDE.operator){
        result = x / y
    }
    else if(operation == LN.operator){
        notYetSupported()
        return
    }
    else if(operation == LOG.operator){
        notYetSupported()
        return
    }
    else{
        invalidOperation()
        return
    }
    print(x, y, result, operation)
}

fun calculatorWithWhen(x: Int, y: Int, operation: String){
    var result = 0
    result = when(operation){
        Add.operator -> x + y
        SUBTRACT.operator -> x - y
        MULTIPLY.operator -> x * y
        DIVIDE.operator -> x / y
        LN.operator, LOG.operator -> {
            notYetSupported()
            return
        }
        else -> {
            invalidOperation()
            return
        }
    }
    print(x, y, result, operation)
}