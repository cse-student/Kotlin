package com.calculator

import com.dataclass.Session
import com.dataclass.Set

class Calculator531 {
    companion object {
        fun rpMaxCalculator(rpMax: Double, month: Int, isUpper: Boolean): Double {
            var multiplier = 10
            if (isUpper) {
                multiplier = 5
            }
            return (0.9 * rpMax) + (month * multiplier)
        }

        fun week1Calculator(rpMax: Double): Session {
            var set1 = Set(1, 0.65, rpMax, "5")
            var set2 = Set(2, 0.75, rpMax, "5")
            var set3 = Set(3, 0.85, rpMax, "5+")
            var session = Session(1, set1, set2, set3)
            println(session)
            return session
        }

        fun week2Calculator(rpMax: Double): Session {
            var set1 = Set(1, 0.7, rpMax, "3")
            var set2 = Set(2, 0.8, rpMax, "3")
            var set3 = Set(3, 0.9, rpMax, "3+")
            var session = Session(2, set1, set2, set3)
            println(session)
            return session
        }

        fun week3Calculator(rpMax: Double): Session {
            var set1 = Set(1, 0.75, rpMax, "5")
            var set2 = Set(2, 0.85, rpMax, "3")
            var set3 = Set(3, 0.95, rpMax, "1+")
            var session = Session(3, set1, set2, set3)
            println(session)
            return session
        }

        fun week4Calculator(rpMax: Double): Session {
            var set1 = Set(1, 0.4, rpMax, "5")
            var set2 = Set(2, 0.5, rpMax, "5")
            var set3 = Set(3, 0.6, rpMax, "5+")
            var session = Session(4, set1, set2, set3)
            println(session)
            return session
        }
    }
}