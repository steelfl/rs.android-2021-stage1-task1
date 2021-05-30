package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")
        val sumAnna = (bill.sum() - bill[k])/2
        var str:String
        str = if (sumAnna == b) {
            "Bon Appetit"
        } else (b - sumAnna).toString()
        return str
    }
}
