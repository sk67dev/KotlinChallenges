fun main() {
    sliceOfPie(11, 5, 2)
}
fun sliceOfPie(totalSlices: Int, recipients: Int, slicesEach: Int) {
    if (recipients * slicesEach < totalSlices) {
        println(true)
    } else {
        println(false)
    }
}