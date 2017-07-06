/**
 * Created by Jay Patel on 6/7/17.
 */
fun main(args: Array<String>) {
    print("Enter nubmer of terms for Series")
    var first = 0;
    var second = 1;
    try {
        val num = readLine()?.toInt()!!
        print("$first\t")
        for (i in 2..num!!) {
            print("$second\t")
            var temp = second
            second = first + second
            first = temp
        }
    } catch (e: NumberFormatException) {
        print("Please enter integer")
    }
}