package classes

import interfaces.Dog
import interfaces.Wolf

class WolfDog: Wolf, Dog {
    override fun speak() {
        super<Wolf>.speak()
        super<Dog>.speak()
    }
}