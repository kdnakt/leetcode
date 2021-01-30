package com.kdnakt.leetcode;

/**
 * Find the sum of all left leaves in a given binary tree.
 */
public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root == null || hasNoChild(root)) {
            return res;
        }
        if (root.left != null){
            if (hasNoChild(root.left)){
                res += root.left.val;
            } else {
                res += sumOfLeftLeaves(root.left);
            }
        }
        if (root.right != null) {
            res += sumOfLeftLeaves(root.right);
        }
        return res;
    }

    boolean hasNoChild(TreeNode node) {
        return node.left == null && node.right == null;
    }

}
