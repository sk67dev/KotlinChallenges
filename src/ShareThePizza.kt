fun main() {
    shareThePizza(11, 5, 2)
}
fun shareThePizza(totalSlices: Int, recipients: Int, slicesEach: Int) {
    if (recipients * slicesEach < totalSlices) {
        println(true)
    } else {
        println(false)
    }
}