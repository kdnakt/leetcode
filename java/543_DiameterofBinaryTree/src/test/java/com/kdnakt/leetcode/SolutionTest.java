package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        assertEquals(3, sol.diameterOfBinaryTree(root));
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        assertEquals(4, sol.diameterOfBinaryTree(root));
    }

    @Test
    public void testExample3() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.right.right.left = new TreeNode(11);
        root.right.right.right = new TreeNode(11);
        assertEquals(5, sol.diameterOfBinaryTree(root));
    }
}
