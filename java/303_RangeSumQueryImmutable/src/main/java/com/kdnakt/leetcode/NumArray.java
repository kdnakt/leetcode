package com.kdnakt.leetcode;

/**
 * Given an integer array nums,
 * find the sum of the elements between indices i and j (i ≤ j),
 * inclusive.
 * 
 * Implement the NumArray class:
 * NumArray(int[] nums)
 *   Initializes the object with the integer array nums.
 * int sumRange(int i, int j)
 *   Return the sum of the elements of the nums array
 *   in the range [i, j] inclusive
 *   (i.e., sum(nums[i], nums[i + 1], ... , nums[j]))
 * 
 * Constraints:
 * 0 <= nums.length <= 10^4
 * -10^5 <= nums[i] <= 10^5
 * 0 <= i <= j < nums.length
 * At most 10^4 calls will be made to sumRange.
 */
class NumArray {

    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        int res = 0;
        for (int p = i; p <= j; p++) {
            res += nums[p];
        }
        return res;
    }

}

/**
 * Your NumArray object will be instantiated
 * and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */