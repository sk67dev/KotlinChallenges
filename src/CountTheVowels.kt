fun main(args: Array<String>) {
    var line = "Which vowels are in this sentence."
    var vowels = 0
    line = line.toLowerCase()
    for (i in 0..line.length - 1) {
        val ch = line[i]
        when (ch) {
            'a', 'e', 'i', 'o', 'u' -> ++vowels
        }
    }
    println("Vowels: $vowels")
}