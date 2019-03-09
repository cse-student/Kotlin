import com.kotlin.model.*
import java.util.*

fun main(args: Array<String>){
    var laptop = Laptop("i7", "Rtx-2080", "64GB")
    println(laptop)

    var laptop2 = Laptop("i7", "2080")
    println(laptop2)

    var car = Vehicle("Car", Locale.UK)
    car.discount = 0.9
    car.price = 100000.00
    println(car)
    car.printPrice()
    car.local = Locale.US
    car.printPrice()
}