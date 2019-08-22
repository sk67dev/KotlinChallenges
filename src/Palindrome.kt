fun main() {

    //STRING PALINDROME
    var string = "racecar"
    string = string.toLowerCase()
    println(string == string.split("").reversed().joinToString(""))

    //INT PALINDROME
    var num = "121"
    println(num == num.split("").reversed().joinToString(""))

}
