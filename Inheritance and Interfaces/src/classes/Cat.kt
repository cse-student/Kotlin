package classes

import interfaces.Animal

class Cat: Animal {
    override fun speak() {
        println("Meow")
    }
}