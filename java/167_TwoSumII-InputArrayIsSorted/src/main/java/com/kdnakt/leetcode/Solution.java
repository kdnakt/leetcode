package com.kdnakt.leetcode;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int expected_num_j = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (expected_num_j == numbers[j]) {
                    int[] res = {i+1,j+1};
                    return res;
                }
            }
        }
        return numbers;
    }

}
