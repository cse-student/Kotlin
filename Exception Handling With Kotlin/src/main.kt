import java.lang.NullPointerException

var number: Int? = null
var number2: Int? = null
var number3: Int? = null
fun main(args: Array<String>){
    println("First")
    genericExceptionHandling()
    println("Second")
    specificExceptionHandling()
    println("Third")
    exceptionHandlingWithFinally()
    println("Custom Exceptions")
    throwingCustomExceptions()
}

fun genericExceptionHandling(){
    try{
        println("Enter first number: ")
        var input = readLine()
        number = input!!.toInt()
        println("Number 1 = $number")
    }
    catch (Exception: Exception){
        println("Exception: $Exception")
        println("Exception message: ${Exception.message}")
        println("Exception cause: ${Exception.cause}")
    }
}

fun specificExceptionHandling(){
    try{
        println("Enter second number: ")
        var input = readLine()
        number2 = input!!.toInt()
        number3 = number!! + number2!!
        println("The sum of the 2 numbers is: $number3")
    }
    catch (Exception: KotlinNullPointerException) {
        println("Number has not been set properly")
    }
    catch(Exception: NumberFormatException){
        println("${Exception.message} Not a valid number")
    }
    catch(Exception: Exception){
        println("Exception: $Exception")
    }
}

fun exceptionHandlingWithFinally(){
    var result = number3
    try{
        println("Enter third number: ")
        var input = readLine()
        result = number!! + number2!! + input!!.toInt()
    }
    catch (Exception: KotlinNullPointerException) {
        println("$Exception Number has not been set properly")
    }
    catch(Exception: NumberFormatException){
        println("${Exception.message} Not a valid number")
    }
    catch(Exception: Exception){
        println("Exception: $Exception")
    }
    finally {
        println("result = $result")
    }
}

fun throwingCustomExceptions(){
    try {
        println("Enter a number")
        var input = readLine()
        var x = input!!.toInt()
        var y: Int? = null
        var z = y!! + x
    }
    catch (Exception: NumberFormatException){
        throw CustomNumberFormatException("Custom Number FormatException has been thrown")
    }
    catch(Exception: KotlinNullPointerException){
        throw CustomNullPointerException("Custom Null Pointer Exception has been thrown")
    }
}

class CustomNumberFormatException(message: String): NumberFormatException(message)

class CustomNullPointerException(message: String): KotlinNullPointerException(message)