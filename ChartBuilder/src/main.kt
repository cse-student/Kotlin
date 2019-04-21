import com.calculator.Calculator531.Companion.rpMaxCalculator
import com.calculator.Calculator531.Companion.week1Calculator
import com.calculator.Calculator531.Companion.week2Calculator
import com.calculator.Calculator531.Companion.week3Calculator
import com.calculator.Calculator531.Companion.week4Calculator
import com.com.printer.ExcelPrinter
import com.dataclass.Session
import com.dataclass.Workout

fun main() {
    var workouts = mutableListOf<Workout>()
    var month = 0

    //region Deadlift
    var rpMax = 145.0
    rpMax = rpMaxCalculator(rpMax, 0, false)
    var deadlift = Workout("Deadlift", month, rpMax)
    //workouts.add(deadlift)
    //endregion

    //region Standing Shoulder Press
    rpMax = 51.2
    rpMax = rpMaxCalculator(rpMax, 0, true)
    var standingShoulderPress = Workout("Standing Shoulder Press", month, rpMax)
    //workouts.add(standingShoulderPress)
    //endregion

    //region Bench Press
    rpMax = 112.5
    rpMax = rpMaxCalculator(rpMax, 0, true)
    var benchPress = Workout("Bench Press", month, rpMax)
    //workouts.add(benchPress)
    //endregion

    //region Squat
    rpMax = 105.9
    rpMax = rpMaxCalculator(rpMax, 0, true)
    var squat = Workout("Squat", month, rpMax)
    workouts.add(squat)
    //endregion

    for (workout in workouts) {
        var sessions = mutableListOf<Session>()
        var week1 = week1Calculator(workout.rpMax)
        sessions.add(week1)

        printSep(2)
        var week2 = week2Calculator(workout.rpMax)
        sessions.add(week2)

        printSep(3)
        var week3 = week3Calculator(workout.rpMax)
        sessions.add(week3)

        printSep(4)
        var week4 = week4Calculator(workout.rpMax)
        sessions.add(week4)

        ExcelPrinter.print(workout.workout, workout.month, sessions)
    }
}


fun printSep(weekNum: Int) {
    var sep = "#".repeat(10)
    println("$sep Week $weekNum $sep")
}