package interfaces

interface Dog: Animal {
    override fun speak() {
        println("Woof")
    }

}