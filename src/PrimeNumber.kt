/**
 * Created by Jay Patel on 6/7/17.
 */
fun main(args: Array<String>) {
    val num = readLine()
    try {
        val squareRoot = Math.sqrt(num?.toDouble()!!)
        var flag = true
        for (i in 2..squareRoot.toInt()) {
            if (num.toInt().rem(i) == 0) {
                flag = false
                print("$num is not prime number")
            }
        }
        if (flag) {
            print("$num is prime number")
        }
    } catch (e: NumberFormatException) {
        print("Please enter integer")
    }
}
//fun main(args: Array<String>) {
//    val num = readLine()
//    try {
//        val squareRoot = sqrt(BigDecimal(num), 30)
//        var flag = true
//        for (i in 2..squareRoot.toInt()){
//            if (BigDecimal(num).rem(BigDecimal(i)) == BigDecimal(0)){
//                flag = false
//                print("$num is not prime number")
//                break
//            }
//        }
//        if (flag){
//            print("$num is prime number")
//        }
//    } catch (e : NumberFormatException){
//        print("Please enter integer")
//    }
//}
//
//fun sqrt(`in`: BigDecimal, scale: Int): BigDecimal {
//    var sqrt = BigDecimal(1)
//    sqrt.setScale(scale + 3, RoundingMode.FLOOR)
//    var store = BigDecimal(`in`.toString())
//    var first = true
//    do {
//        if (!first) {
//            store = BigDecimal(sqrt.toString())
//        } else
//            first = false
//        store.setScale(scale + 3, RoundingMode.FLOOR)
//        sqrt = `in`.divide(store, scale + 3, RoundingMode.FLOOR).add(store).divide(
//                BigDecimal.valueOf(2), scale + 3, RoundingMode.FLOOR)
//    } while (store != sqrt)
//    return sqrt.setScale(scale, RoundingMode.FLOOR)
//}