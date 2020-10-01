package com.kdnakt.leetcode;

/**
 * Given a non-empty array of integers,
 * every element appears twice except for one.
 * Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 */
public class Solution {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            boolean isPair = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isPair = true;
                    break;
                }
            }
            if (!isPair) return nums[i];
        }
        return -1;
    }

}
