package com.kdnakt.leetcode;

import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers
 * in the range [0, n],
 * return the only number in the range that is missing
 * from the array.
 * 
 * Constraints:
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * All the numbers of nums are unique.
 */
public class Solution {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int expected = nums.length * (nums.length + 1) / 2;
        return expected - sum;
    }

}
