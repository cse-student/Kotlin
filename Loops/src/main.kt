fun main(args: Array<String>){
    val lst  = arrayOf("Python", "C", "JavaScript", "Bash", "Java",
        "C#", "nodejs", "Lisp", "Kotlin")
    val limit = lst.count() - 1
    var i = 0

    var lineSeparator   = "###############"

    //region For loops
    println("For i in:")
    for(i in lst){
        println(i)
    }

    println(lineSeparator)

    println("For i in until")
    for(i in 0 until lst.count()){
        println(lst[i])
    }

    println(lineSeparator)

    println("For i in 0..limit")
    for(i in 0..limit){
        println(lst[i])
    }

    println(lineSeparator)

    println("For each")
    lst.forEach {
        println(it)
    }

    println(lineSeparator)

    println("Indices")
    for(i in lst.indices){
        println(lst[i])
    }

    println(lineSeparator)

    println("While loop")
    while(i < lst.count()){
        println(lst[i])
        i++
    }
    i = 0

    println(lineSeparator)

    println("do while loop")
    do {
        println(lst[i])
        i++
    }while(i < lst.count())
    i = 0
    //endregion
}
