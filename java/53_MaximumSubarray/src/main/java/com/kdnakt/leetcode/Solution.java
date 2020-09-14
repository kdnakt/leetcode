package com.kdnakt.leetcode;

/**
 * 1 <= nums.length <= 2 * 10^4
 *  -2^31 <= nums[i] <= 2^31 - 1
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = Integer.MIN_VALUE;
        int tmpSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            tmpSum = nums[i];
            if (tmpSum > res) res = tmpSum;
            for (int j = i+1; j < nums.length; j++) {
                tmpSum += nums[j];
                if (tmpSum > res) res = tmpSum;
            }
        }
        if (res < nums[nums.length - 1]) return nums[nums.length - 1];
        return res;
    }
}
