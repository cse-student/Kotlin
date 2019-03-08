data class Laptop (
    var cpu: String,
    var gpu: String,
    var ram: String?
){
    init {
        ram = ram?.toUpperCase() ?: ""
    }

    constructor(cpu: String, gpu: String): this(cpu, gpu, null){
        ram = ""
    }
}