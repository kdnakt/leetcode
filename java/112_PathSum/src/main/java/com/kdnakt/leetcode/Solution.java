package com.kdnakt.leetcode;

/**
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path
 * equals the given sum.
 * 
 * Note: A leaf is a node with no children.
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return hasPathSum(root, 0, sum);
    }

    boolean hasPathSum(TreeNode root, int tmp, int sum) {
        tmp += root.val;
        if (root.left == null && root.right == null && tmp == sum) {
            return true;
        }
        if (root.left != null && hasPathSum(root.left, tmp, sum)) return true;
        if (root.right != null && hasPathSum(root.right, tmp, sum)) return true;
        return false;
    }

}
