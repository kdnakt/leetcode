package com.kdnakt.leetcode;

/**
 * Given integer array nums, return the third maximum number
 * in this array. If the third maximum does not exist,
 * return the maximum number.
 * 
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class Solution {

    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean firstChanged = false;
        boolean secondChanged = false;
        boolean thirdChanged = false;
        for (int num : nums) {
            if (first < num) {
                third = second;
                second = first;
                first = num;
                thirdChanged = secondChanged;
                secondChanged = firstChanged;
                firstChanged = true;
            } else if (first == num) {
                firstChanged = true;
            } else if (second < num) {
                third = second;
                second = num;
                thirdChanged = secondChanged;
                secondChanged = true;
            } else if (second == num) {
                secondChanged = true;
            } else if (third < num) {
                third = num;
                thirdChanged = true;
            } else if (third == num) {
                thirdChanged = true;
            }
        }
        boolean all = firstChanged && secondChanged && thirdChanged;
        return all ? third : first;
    }

}
