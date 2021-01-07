package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        assertEquals(6,
            sol.lowestCommonAncestor(root, root.left, root.right).val);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        assertEquals(2,
            sol.lowestCommonAncestor(root, root.left, root.left.right).val);
    }

    @Test
    public void testExample3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);

        assertEquals(2, sol.lowestCommonAncestor(root, root, root.left).val);
    }
}
