fun main() {
    addSubtractMultiplyOrDivide(12, 2, 24)
}
fun addSubtractMultiplyOrDivide(num1: Int, num2: Int, result: Int){

    when(result == 24) {
        num1 + num2 == result -> println("$num1 + $num2 = $result")
        num1 - num2 == result -> println("$num1 - $num2 = $result")
        num1 * num2 == result -> println("$num1 * $num2 = $result")
        num1 / num2 == result -> println("$num1 / $num2 = $result")
        else -> println("The sum does not equal $result")
    }
}