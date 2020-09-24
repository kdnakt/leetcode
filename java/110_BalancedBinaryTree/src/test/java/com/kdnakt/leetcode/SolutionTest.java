package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(sol.isBalanced(root));
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        assertFalse(sol.isBalanced(root));
    }

    @Test
    public void testFailed1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);
        assertTrue(sol.isBalanced(root));
    }

    @Test
    public void testFailed2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4,
                        new TreeNode(7), null), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6,
                        null, new TreeNode(8))));
        assertFalse(sol.isBalanced(root));
    }

}
