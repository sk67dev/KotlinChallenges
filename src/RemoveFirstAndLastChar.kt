fun String.removeFirstAndLastChar():
        String = this.substring(1, this.length - 1)

fun main() {
    var fullName = "FRED BROWN"
    var result = fullName.removeFirstAndLastChar()
    println("Name without first and last characters: $result")
}
