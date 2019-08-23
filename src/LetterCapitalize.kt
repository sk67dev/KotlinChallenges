fun main() {

    fun String.capitalizeWords(): String = split(" ").map { it.capitalize() }
        .joinToString(" ")
    val str = "These are the capitalized words."
    println(str.capitalizeWords())
}
