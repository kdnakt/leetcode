package com.kdnakt.leetcode;

/**
 * You are given two integer arrays nums1 and nums2
 * both of unique elements,
 * where nums1 is a subset of nums2.
 * 
 * Find all the next greater numbers for nums1's elements
 * in the corresponding places of nums2.
 * 
 * The Next Greater Number of a number x in nums1
 * is the first greater number to its right in nums2.
 * If it does not exist, return -1 for this number.
 * 
 * Constraints:
 * 1 <= nums1.length <= nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 10^4
 * All integers in nums1 and nums2 are unique.
 * All the integers of nums1 also appear in nums2.
 */
public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                int num2 = nums2[j];
                if (num1 == num2) {
                    found = true;
                } else if (found && num1 < num2) {
                    ans[i] = num2;
                    break;
                }
            }
        }
        return ans;
    }
}
