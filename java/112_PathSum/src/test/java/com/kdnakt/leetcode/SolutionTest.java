package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11,
                        new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4,
                        null, new TreeNode(1))));
        assertTrue(sol.hasPathSum(root, 22));
    }

}
