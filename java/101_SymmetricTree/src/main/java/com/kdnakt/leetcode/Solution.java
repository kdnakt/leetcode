package com.kdnakt.leetcode;

/**
 * Follow up: Solve it both recursively and iteratively.
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameTreeRecursive(root.left, root.right);
    }

    boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTreeRecursive(p.left, q.right)
                && isSameTreeRecursive(p.right, q.left);
    }

}
