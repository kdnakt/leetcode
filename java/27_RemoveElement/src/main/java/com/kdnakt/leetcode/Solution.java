package com.kdnakt.leetcode;

public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }

}