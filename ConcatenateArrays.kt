fun main(args: Array<String>) {
    val A = intArrayOf(1, 2, 3)
    val B = intArrayOf(4, 5)

    val sumAB = sumArrays(A,B)

    println(sumAB.contentToString())

}

fun sumArrays(a: IntArray, b: IntArray): IntArray {
    return a + b
}
