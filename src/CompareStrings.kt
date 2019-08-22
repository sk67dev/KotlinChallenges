fun main() {
    compareStrings("Length the same?: ", "Length the same?: ")
}
fun compareStrings(str1: String, str2: String) {
    if (str1.length == str2.length) {
        println("true")
    }else {
        println("false")
    }
}