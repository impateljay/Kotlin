package Sorting

/**
 * Created by Jay Patel on 13/7/17.
 */

fun main(args: Array<String>) {
    Sorting().launch()
}

class Sorting {
    fun launch() {
        println("Enter number of integers to be sorted")
        var n = 0
        try {
            n = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Please enter integer")
        }
        val array = Array(n, { 0 })
        for (i in 0..n - 1) {
            array[i] = readLine()!!.toInt()
        }
        for (algorithm in getAlgorithmsList()) {
            measureAlgorithm(array.copyOf(), algorithm)
        }
    }

    private fun measureAlgorithm(arr: Array<Int>, algorithm: ISortAlgorithm) {
        println("--------------------------------------")
        println("Algorithm name: " + algorithm.getName())
        println("Initial array: " + arrayToString(arr))

        val startTime: Long = System.nanoTime()
        val sortedArr = algorithm.sort(arr)
        val endTime: Long = System.nanoTime()

        println("Sorted array: " + arrayToString(sortedArr))
        println("Is array sorted in ascending order: " + isSortedAsc(sortedArr))
        val avgTimePerElement: Double = ((endTime - startTime).toDouble() / arr.size.toDouble())
        println("Average time per element, ns: " + avgTimePerElement)
    }

    private fun getAlgorithmsList(): Array<ISortAlgorithm> {
        return Array<ISortAlgorithm>(
                2,
                {
                    BubbleSort()
                    InsertionSort()
                }
        )
    }

    /**
     * Prints contents of an array
     * @param arr an array to be converted to string
     */
    fun <T> arrayToString(arr: Array<T>): String {
        var str = "Array("
        var isFirst: Boolean = true
        for (element in arr) {
            if (!isFirst) {
                str += ", "
            }
            str += element
            if (isFirst) {
                isFirst = false
            }
        }
        str += ")"
        return str
    }

    /**
     * Returns whether given array is sorted in ascending order
     * @param arr array to be checked
     */
    fun isSortedAsc(arr: Array<Int>): Boolean {
        for (i in 0..arr.size - 2) {
            if (arr[i] > arr[i + 1]) {
                return false
            }
        }
        return true
    }

}