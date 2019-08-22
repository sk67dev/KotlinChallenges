import java.util.*

fun main() {

    val array1 = intArrayOf(1,2,3)
    var array2 = intArrayOf(4,5,6)

    val aLen = array1.size
    val bLen = array2.size
    val result = IntArray(aLen + bLen)

    System.arraycopy(array1, 0, result, 0, aLen)
    System.arraycopy(array2, 0, result, aLen, bLen)

    println(Arrays.toString((result)))
}