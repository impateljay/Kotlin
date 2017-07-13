package Sorting

/**
 * Created by Jay Patel on 13/7/17.
 */
class BubbleSort : ISortAlgorithm {
    override fun sort(arr: Array<Int>): Array<Int> {
        for (i in 0..arr.lastIndex - 1) {
            for (j in 0..arr.lastIndex - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    val tmp: Int = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = tmp
                }
            }
        }
        return arr
    }

    override fun getName(): String {
        return "Bubble Sort"
    }

}