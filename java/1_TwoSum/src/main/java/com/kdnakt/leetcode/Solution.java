package com.kdnakt.leetcode;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int expected = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (expected == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

}
