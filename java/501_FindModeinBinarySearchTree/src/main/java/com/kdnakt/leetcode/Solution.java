package com.kdnakt.leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/**
 * Given the root of a binary search tree (BST)
 * with duplicates, return all the mode(s)
 * (i.e., the most frequently occurred element) in it.
 * 
 * If the tree has more than one mode,
 * return them in any order.
 * 
 * Assume a BST is defined as follows:
 * - The left subtree of a node contains
 *   only nodes with keys less than or equal to the node's key.
 * - The right subtree of a node contains
 *   only nodes with keys greater than or equal to the node's key.
 * - Both the left and right subtrees must also be
 *   binary search trees.
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [1, 10^4].
 * -10^5 <= Node.val <= 10^5
 */
public class Solution {

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(Integer.valueOf(root.val), Integer.valueOf(1));
        find(root.right, map);
        find(root.left, map);

        Set<Integer> temp = new HashSet<>();
        int max = 0;
        for (Integer i : map.values()) {
            max = Math.max(max, i.intValue());
        }
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue().intValue() == max) {
                temp.add(e.getKey());
            }
        }
        int[] ans = new int[temp.size()];
        int i = 0;
        for (Integer v : temp) {
            ans[i++] = v.intValue();
        }
        return ans;
    }

    void find(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;
        Integer key = Integer.valueOf(root.val);
        if (map.containsKey(key)) {
            map.put(key, Integer.valueOf(map.get(key).intValue() + 1));
        } else {
            map.put(key, Integer.valueOf(1));
        }

        find(root.right, map);
        find(root.left, map);
    }
}
