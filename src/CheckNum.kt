fun main() {
    checkNum(2, 8)
}
fun checkNum(num1: Int, num2: Int) {
    when {
        num2 > num1 -> println("true")
        num2 == num1 -> println("-1")
        else -> println("false")
    }
}
