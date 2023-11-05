class Solution {
//    You are given a large integer represented as an integer array digits,
    //    where each digits[i] is the ith digit of the integer.
    //    The digits are ordered from most significant to least significant
    //
    //    in left-to-right order. The large integer does not contain any leading 0's.
//
//    Increment the large integer by one and return the resulting array of digits.
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i] += 1
                return digits
            }
            digits[i] = 0
        }
        // new element need to be added at the beginning
        val arr = IntArray(digits.size + 1)
        arr[0] = 1
        return arr
    }
}