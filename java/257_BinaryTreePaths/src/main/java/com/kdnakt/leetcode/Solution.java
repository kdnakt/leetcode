package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * 
 * Given a binary tree, return all root-to-leaf paths.
 * Note: A leaf is a node with no children.
 */
public class Solution {
    private static final String ARROW = "->";
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        if (root.left == null && root.right == null)
            return Arrays.asList(String.valueOf(root.val));
        StringBuilder tempPath = new StringBuilder()
                .append(root.val);
        if (root.left != null) solve(result, tempPath, root.left);
        if (root.right != null) solve(result, tempPath, root.right);
        return result;
    }

    void solve(List<String> result, StringBuilder tempPath,
            TreeNode node) {
        StringBuilder path = new StringBuilder(tempPath).append(ARROW).append(node.val);
        if (node.left == null && node.right == null) {
            result.add(path.toString());
            return;
        }
        if (node.left != null) solve(result, path, node.left);
        if (node.right != null) solve(result, path, node.right);
    }

}
