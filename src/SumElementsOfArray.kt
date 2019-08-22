internal object SumOfArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val array = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        var sum = 0

        for (num in array) {
            sum = sum + num
        }
        println("Sum of array elements is: $sum")
    }
}