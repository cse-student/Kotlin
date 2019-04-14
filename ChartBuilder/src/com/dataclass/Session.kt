package com.dataclass

data class Session(var sessionNumber: Int, var set1: Set, var set2: Set, var set3: Set){
    var sets: MutableList<Set> = mutableListOf()

    init {
        this.sets.add(set1)
        this.sets.add(set2)
        this.sets.add(set3)
    }
}