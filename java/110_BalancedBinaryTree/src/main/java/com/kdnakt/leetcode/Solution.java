package com.kdnakt.leetcode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the left and right subtrees
 * of every node differ in height by no more than 1.
 */
public class Solution {

    // private int[] dp;
    int maxDepth(TreeNode root, int index) {
        // if (dp[index] != -1) return dp[index];
        // if (root == null) return dp[index] = 0;
        if (root == null) return 0;
        // return dp[index] = Math.max(maxDepth(root.left, 2*index), maxDepth(root.right, 2*index+1)) + 1;
        return Math.max(maxDepth(root.left, 2*index), maxDepth(root.right, 2*index+1)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        // dp = new int[10000];
        // for (int i = 0; i < 10000; i++) dp[i] = -1;
        return isBalanced(root, 1);
    }

    boolean isBalanced(TreeNode root, int index) {
        if (root == null) return true;
        int next = 2*index;
        int l = maxDepth(root.left, next);
        int r = maxDepth(root.right, next+1);
        if (Math.abs(l-r) > 1) return false;
        return isBalanced(root.left, next) && isBalanced(root.right, next+1);
    }

}
