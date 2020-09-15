package com.kdnakt.leetcode;

/**
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class Solution {

    private boolean moveUp = true;

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; 0 <= i; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i - 1 >= 0) {
                    digits[i-1]++;
                } else {
                    int[] res = new int[digits.length+1];
                    res[0] = 1;
                    return res;
                }
            }
        }
        return digits;
    }

}
