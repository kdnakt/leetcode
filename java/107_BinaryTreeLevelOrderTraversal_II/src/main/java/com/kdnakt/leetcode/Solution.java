package com.kdnakt.leetcode;

import java.util.ArrayList;
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
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> inner = new ArrayList<>();
        res.add(0, inner);
        inner.add(Integer.valueOf(root.val));
        solve(res, 1, root.left, root.right);
        return res;
    }

    void solve(List<List<Integer>> res, int level, TreeNode left, TreeNode right) {
        int next = level + 1;
        if (res.size() < next)
            res.add(0, new ArrayList<Integer>());
        if (left != null) {
            res.get(res.size() - next).add(Integer.valueOf(left.val));
            solve(res, next, left.left, left.right);
        }
        if (right != null) {
            res.get(res.size() - next).add(Integer.valueOf(right.val));
            solve(res, next, right.left, right.right);
        }
        if (res.get(0).size() == 0) res.remove(0);
    }

}