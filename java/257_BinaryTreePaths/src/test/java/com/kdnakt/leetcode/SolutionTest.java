package com.kdnakt.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import com.kdnakt.leetcode.Solution;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution sol = new Solution();

    @Test
    public void testNull() {
        TreeNode root = null;
        List<String> expected = Arrays.asList();
        assertIterableEquals(expected, sol.binaryTreePaths(root));
    }

    @Test
    public void testRootOnly() {
        TreeNode root = new TreeNode(1);
        List<String> expected = Arrays.asList("1");
        assertIterableEquals(expected, sol.binaryTreePaths(root));
    }

    @Test
    public void testRootAndLeftOnly() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        List<String> expected = Arrays.asList("1->2");
        assertIterableEquals(expected, sol.binaryTreePaths(root));
    }

    @Test
    public void testBasic() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left = new TreeNode(2);
        List<String> expected = Arrays.asList("1->2", "1->3->6", "1->3->7");
        assertIterableEquals(expected, sol.binaryTreePaths(root));
    }

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertIterableEquals(expected, sol.binaryTreePaths(root));
    }

}
