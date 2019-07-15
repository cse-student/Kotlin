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

    //endregion
}

fun makeItSpeak(animal: Animal){
    animal.speak()
}

fun printType(animal: Animal){
    println("Animal is a ${animal::class.simpleName}")
}

