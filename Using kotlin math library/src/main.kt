import kotlin.math.*

fun main(args: Array<String>){
    val x = 25
    val y = 5
    val z = -2.5
    val s = 3
    val t = 7.5

    print("x", x)
    print("y", y)
    print("s", s)
    print("z", z)
    print("t", t)
    print("PI", PI)
    println("The biggest constants is ${max(max(x, y).toDouble(), z)}")

    //region sign
    printSign(x)
    printSign(y)
    printSign(s)
    printSign(z)
    printSign(t)
    printSign(PI)
    //endregion

    //region Rem
    printRem(x, y)
    printRem(y, x)
    printRem(y, s)
    //endregion

    //region floor
    printFloorValue(z)
    printFloorValue(t)
    printFloorValue(PI)
    //endregion

    //region Abs
    printAbs(z)
    printAbs(t)
    printAbs(PI)
    //endregion

    //region round
    printRound(z)
    printRound(t)
    printRound(PI)
    //endregion/

    //region Square root
    printSquareRoot(x.toDouble())
    printSquareRoot(y.toDouble())
    printSquareRoot(s.toDouble())
    printSquareRoot(z)
    printSquareRoot(t)
    printSquareRoot(PI)
    //endregion

    //region truncate
    printTruncatedValue(z)
    printTruncatedValue(t)
    printTruncatedValue(PI)
    //endregion
}

fun print(name: String, x: Int){
    println("$name = $x")
}

fun print(name: String, x: Double){
    println("$name = $x")
}

fun printSign(x: Int){
    println("The sign of $x is ${sign(x.toDouble())}")
}

fun printSign(x: Double){
    println("The sign of $x is ${sign(x)}")
}

fun printRem(x: Int, y: Int){
    //The rem function gives the remainder after having dividing the number by the value passed as parameter
    println("$x.rem($y) = ${x.rem(y)}")
}

fun printFloorValue(x: Double){
    //The floor function gives the closest round value value passed as parameter which is less than the parameter
    println("The floor value of $x is ${floor(x)}")
}

fun printAbs(x: Double){
    //The abs function gives the positive of the value passed as parameter
    println("The absolute value of $x is ${abs(x)}")
}

fun printRound(x: Double){
    //The round function returns the closest integer(number with 0 decimal value) to the parameter
    println("The rounded value of $x is ${round(x)}")
}

fun printSquareRoot(x: Double){
    //The sqrt function returns the square root of the parameter
    println("The square root value of $x is ${sqrt(x)}")
}

fun printTruncatedValue(x: Double){
    println("The truncated value of $x is ${truncate(x)}")
}

