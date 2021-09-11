package com.kdnakt.leetcode;

/**
 * Given a n-ary tree, find its maximum depth.
 * The maximum depth is the number of nodes
 * along the longest path from the root node
 * down to the farthest leaf node.
 * 
 * Nary-Tree input serialization is represented
 * in their level order traversal,
 * each group of children is separated
 * by the null value (See examples).
 * 
 * Constraints:
 * The total number of nodes is in the range [0, 10^4].
 * The depth of the n-ary tree is less than or equal to 1000.
 */
public class Solution {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }
        int maxDepth = 0;
        for (Node child : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(child));
        }
        return maxDepth + 1;
    }

}
