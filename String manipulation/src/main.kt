fun main(args: Array<String>){
    //Instantiating empty string
    var word = String()
    print(word)

    //assigning value to word
    word = "hello"
    print(word)

    //Trying to change value of word
    word + " world"
    print(word)
    //As you can see the value of word has not changed as it is immutable
    //To change it's value you have to reassign it to a new value
    word = word.plus(" world") //first way of concatenating a word
    print(word)
    word = "hello"
    word += " world" // Another way of concatenating a word
    print(word)
    //endregion

    //Printing values of word
    printAsList(word)
    printEncodedValuesAsList(word)
    //endregion

    println(isPalindrome("radar"))
}

fun print(word: String){
    println("The value of the word is $word")
}

fun printAsList(word: String){
    var lst = word.toList()
    println(lst)
}

fun printEncodedValuesAsList(word: String){
    var lst = word.toByteArray()
    println(lst)
}

fun isPalindrome(word: String): Boolean{
    var lst = word.toCharArray();
    for(i in 0 until lst.count()){
        if (lst[i] != lst[lst.count()-1-i]){
            return false
        }
    }
    return true
}

