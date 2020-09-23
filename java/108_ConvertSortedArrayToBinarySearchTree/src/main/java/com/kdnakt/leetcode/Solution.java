package com.kdnakt.leetcode;

import java.util.Arrays;

/**
 * Given an array where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * 
 * For this problem, a height-balanced binary tree is defined
 * as a binary tree in which the depth of the two subtrees of
 * every node never differ by more than 1.
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        int m = nums.length / 2;
        return new TreeNode(nums[m],
                sortedArrayToBST(Arrays.copyOfRange(nums, 0, m)),
                sortedArrayToBST(Arrays.copyOfRange(nums, m + 1, nums.length)));
    }

}
