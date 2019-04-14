package com.dataclass

data class Set(var setNumber: Int, var percentage: Double, var rpMax: Double, var reps: String) {
    var weight:Double = percentage * rpMax

    override fun toString(): String {
        return "${this.weight} x ${this.reps}"
    }

}