internal object SumOfArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val array = intArrayOf(10, 20, 30, 40, 50, 10)
        var sum = 0

        for (num in array) {
            sum = sum + num
        }
        println("Sum of array elements is: $sum")
    }
}