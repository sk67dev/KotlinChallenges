import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun main() {

    //current Date and Time in Default Format.
    val current = LocalDateTime.now()
    println("Current Date and Time is $current")

    // Current Date and Time in Localised Style
    val current1 = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    val formatted = current1.format(formatter)
    println("Current date and time is : $formatted")

    //Current Date and Time with Pattern.
    val current2 = LocalDateTime.now()
    val formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSS")
    val formatted1 = current2.format(formatter1)
    println("Current date and time is : $formatted1 ")




}