import java.math.BigDecimal

/**
 * Created by Jay Patel on 6/7/17.
 */

fun main(args: Array<String>) {
    val num = readLine()
    try {
        if (BigDecimal(num).rem(BigDecimal(2)) == BigDecimal(0))
            print("Even")
        else
            print("Odd")
    } catch (e : NumberFormatException){
        print("Please enter digits only")
    }
}