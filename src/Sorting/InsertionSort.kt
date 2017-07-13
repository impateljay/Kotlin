package Sorting

/**
 * Created by Jay Patel on 13/7/17.
 */
class InsertionSort : ISortAlgorithm {
    override fun sort(arr: Array<Int>): Array<Int> {
        for (i in 0..arr.lastIndex - 1) {
            for (j in i..arr.lastIndex) {
                if (arr[i] > arr[j]) {
                    val tmp: Int = arr[i]
                    arr[i] = arr[j]
                    arr[j] = tmp
                }
            }
        }
        return arr
    }

    override fun getName(): String {
        return "Insertion Sort"
    }

}