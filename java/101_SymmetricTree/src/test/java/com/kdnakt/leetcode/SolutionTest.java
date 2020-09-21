package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(sol.isSymmetric(root));
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));
        assertFalse(sol.isSymmetric(root));
    }

    @Test
    public void testEmpty() {
        assertTrue(sol.isSymmetric(null));
    }

    @Test
    public void testComplicated() {
        TreeNode root = new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));
        assertFalse(sol.isSymmetric(root));
    }
}
