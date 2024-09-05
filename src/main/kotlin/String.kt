fun main(args: Array<String>) {
    val myName: String = "Suci Zuliana"
    for (chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s + "def")

    var text = """
        for (cin "foo")
        print(c)
        """
    println(text)

    var text2 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()
    println(text2)
}