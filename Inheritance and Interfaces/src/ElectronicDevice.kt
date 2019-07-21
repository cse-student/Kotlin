sealed class ElectronicDevice(val type: String) {
    abstract val price: Double
    abstract val cpu: String
    abstract val ram: Int
}

data class Laptop(override var price: Double, override var cpu: String, override var ram: Int):
    ElectronicDevice("Laptop"){
}

data class Tablet(override var price: Double, override var cpu: String, override var ram: Int):
    ElectronicDevice("Tablet"){
}