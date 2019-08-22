//Print multiples of 5, skipping multiples of 3.
fun main() {
    for (n in 1..100) {
        if (n % 3 == 0) {
            continue
        }
        if (n % 5 == 0) {
            println(n)
        }
    }
}