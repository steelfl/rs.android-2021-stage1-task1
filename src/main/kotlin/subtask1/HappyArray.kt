package subtask1

import sun.rmi.runtime.Log

@Suppress("UNREACHABLE_CODE")
class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        var newArray = sadArray.toMutableList()
        println("$sadArray до изменений")
        var check = false
        for (i in 1 until newArray.lastIndex) {
            if ((newArray[i - 1] + newArray[i + 1]) < newArray[i]) {
                check = true
                newArray.removeAt(i)
                break
            }
        }
        if (check) return convertToHappy(newArray.toIntArray()) else return newArray.toIntArray()
    }
}
