package com.kdnakt.leetcode;

/**
 * Given an array, rotate the array to the right by k steps,
 * where k is non-negative.
 * 
 * Follow up:
 * Try to come up as many solutions as you can,
 * there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        while (nums.length <= k) {
            k -= nums.length;
        }
        int[] tmp = new int[nums.length - k];
        System.arraycopy(nums, 0, tmp, 0, tmp.length);
        System.arraycopy(nums, nums.length - k, nums, 0, k);
        System.arraycopy(tmp, 0, nums, k, tmp.length);
    }

}
