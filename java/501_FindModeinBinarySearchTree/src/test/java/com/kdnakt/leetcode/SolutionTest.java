package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(0);
        int[] expected = {0};
        assertArrayEquals(expected, sol.findMode(root));
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);
        int[] expected = {2};
        assertArrayEquals(expected, sol.findMode(root));
    }
}
