package com.kdnakt.leetcode;

import java.util.HashMap;

/**
 * Given the root of a binary tree,
 * return the length of the diameter of the tree.
 * 
 * The diameter of a binary tree is
 * the length of the longest path between any two nodes
 * in a tree. This path may or may not pass
 * through the root.
 * 
 * The length of a path between two nodes is
 * represented by the number of edges between them.
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [1, 10^4].
 * -100 <= Node.val <= 100
 */
public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        HashMap<Integer, Integer> cache = new HashMap<>();
        int r = depth(root.right, cache);
        int l = depth(root.left, cache);
        int dr = calc(root.right, cache);
        int dl = calc(root.left, cache);
        return Math.max(r + l, Math.max(dr, dl));
    }

    public int calc(TreeNode root, HashMap<Integer, Integer> cache) {
        if (root == null) return 0;
        int r = depth(root.right, cache);
        int l = depth(root.left, cache);
        int dr = calc(root.right, cache);
        int dl = calc(root.left, cache);
        return Math.max(r + l, Math.max(dr, dl));
    }

    int depth(TreeNode root, HashMap<Integer, Integer> cache) {
        if (root == null) return 0;
        int key = root.hashCode();
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int r = depth(root.right, cache);
        int l = depth(root.left, cache);
        int res = 1 + Math.max(r, l);
        cache.put(key, res);
        return res;
    }
}
