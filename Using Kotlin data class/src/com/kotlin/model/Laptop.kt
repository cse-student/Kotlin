package com.kotlin.model

//Simple data class
data class Laptop (
    var cpu: String,
    var gpu: String,
    var ram: String?
){
    init {
        //Is executed every time the primary constructor is executed
        ram = ram?.toUpperCase() ?: "16GB"
    }

    constructor(cpu: String, gpu: String): this(cpu, gpu, null){
        //primary constructor must be called eventually in kotlin
        ram = ""
    }
}