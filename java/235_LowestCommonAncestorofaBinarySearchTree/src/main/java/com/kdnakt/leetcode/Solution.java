package com.kdnakt.leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [2, 10^5].
 * -10^9 <= Node.val <= 10^9
 * All Node.val are unique.
 * p != q
 * p and q will exist in the BST.
 */
public class Solution {

    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val) return p;
        if (root.val == q.val) return q;
        if (contains(root.left, p) && contains(root.left, q)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (contains(root.right, p) && contains(root.right, q)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    boolean contains(TreeNode root, TreeNode target) {
        if (root.val == target.val) return true;
        if (root.left != null && contains(root.left, target)) return true;
        if (root.right != null && contains(root.right, target)) return true;
        return false;
    }
}
