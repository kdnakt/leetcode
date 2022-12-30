package com.kdnakt.leetcode;

import java.util.Arrays;

public class Solution {

    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        if (6 < nums.length) {
            int[] temp = new int[6];
            System.arraycopy(nums, 0, temp, 0, 3);
            temp[3] = nums[nums.length - 3];
            temp[4] = nums[nums.length - 2];
            temp[5] = nums[nums.length - 1];
            nums = temp;
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int num_i = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int num_j = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int candidate = num_i * num_j * nums[k];
                    res = Math.max(candidate, res);
                }
            }
        }
        return res;
    }

}
