package interfaces

interface Wolf: Animal {
    override fun speak() {
        println("Howl")
    }
}