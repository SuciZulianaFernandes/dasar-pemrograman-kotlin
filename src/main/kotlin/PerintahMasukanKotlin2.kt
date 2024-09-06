fun main(args: Array<String>) {
    //Dobler program parsing
    println("Enter a numer and i'll double it: ")
    val input = readLine()!!
    var a = input.toInt()
    a = a *2
    println(a)

    println("Enter a number, and i'll square it: ")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}