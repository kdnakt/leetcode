package com.kdnakt.leetcode;

/**
 * Given a sorted array and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (target <= nums[0]) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int nums_i = nums[i], iplus1 = i+1, nums_iplus1 = nums[iplus1];
            if (nums_i == target) return i;
            if (nums_iplus1 == target) return iplus1;
            if (nums_i < target && target < nums_iplus1) return iplus1;
        }
        return nums.length;
    }

}
