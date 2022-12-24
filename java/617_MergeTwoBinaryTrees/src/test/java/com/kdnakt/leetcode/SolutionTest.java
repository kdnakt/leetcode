package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode expected = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)));
        assertTrue(Objects.equals(expected, sol.mergeTrees(root1, root2)));
    }

    @Test
    public void testExample2() {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode expected = new TreeNode(2, new TreeNode(2), null);
        assertTrue(Objects.equals(expected, sol.mergeTrees(root1, root2)));
    }

}
