import interfaces.Animal
import classes.Cat
import classes.GoldenRetriever
import classes.WolfDog
import interfaces.Dog

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

    //region Interfaces
    var dog: Animal = GoldenRetriever()
    var cat: Animal = Cat()
    var wolfDog = WolfDog()

    printType(dog)
    makeItSpeak(dog)

    printType(cat)
    makeItSpeak(cat)

    printType(wolfDog)
    makeItSpeak(wolfDog)


    //region Anonymous object
    makeItSpeak(object: Animal{
        override fun speak() {
            print("Roar\n")
        }
    })
    //endregion

    //region using lamda expression
    makeItSpeak(horse)
    //endregion

    //region Using sealed class
    var laptop = Laptop(3000.00, "i7-9700T", 32)
    println("Laptop: $laptop")

    var tablet = Laptop(750.00, "Cortex– A15 ", 8)
    println("Tablet: $tablet")


    val mostExpensive: ElectronicDevice = if (laptop.price > tablet.price) laptop else tablet
    val printMostExpensive = when(mostExpensive){
        is Laptop -> {
            println("The laptop is the most expensive")
        }
        is Tablet -> {
            print("The tablet is the most expensive")
        }
    }
    printMostExpensive
    //endregion
    
    //endregion
}


val horse = object:Animal{
    override fun speak() {
        print("Neigh\n")
    }

}
fun printType(animal: Animal){
    println("Animal is a ${animal::class.simpleName}")
}

fun makeItSpeak(animal: Animal){
    animal.speak()
}

